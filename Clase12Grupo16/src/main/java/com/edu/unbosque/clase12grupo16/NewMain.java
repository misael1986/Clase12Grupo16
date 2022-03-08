/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase12grupo16;

import java.io.FileInputStream;//IO es es In-Out
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {//TODOS LOS metodos en la clase main deber ser static

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//
        //throws IOException es que NO se haga

        
        Scanner famoso=new Scanner (System.in);
        //----------GUARDAR---------------------
        System.out.println("Digite Nombre:");
        String N= famoso.next();
        System.out.println("Digite Apellido:");
        String A= famoso.next();
        System.out.println("Digite edad:");
        int E= famoso.nextInt();
        
        Persona aGuardar = new Persona(N, A, E);
        Guardar(aGuardar);
        //---------------LEER------------------------------
        System.out.println("Digite el Nombre del Archivo a Abrir:");
        String nom=famoso.next();
        Imprimir(Leer(nom));
    }

    private static void Guardar(Persona P) {
        FileOutputStream archivo = null;//Archivo para Guardar -> Out -> Salir

        try {
            archivo = new FileOutputStream(P.getNombre()+P.getApellidos()+".dat");
            ObjectOutputStream canal = new ObjectOutputStream(archivo);
            canal.writeObject(P);
        } catch (IOException e) {//Se deben usar varios catch para los posibles errores como IO, FileNotFound
            System.out.println("Error al Guardar los datos" + e.getMessage());
            e.printStackTrace();//Arbol de errores
        } finally {
            try {
                archivo.close();//cerrar es importante
            } catch (Exception ec) {
                ec.printStackTrace();
            }

        }

    }

    private static Persona Leer(String nombre) {
        FileInputStream lectura = null;//In -> Entrar -> Leer
        Persona buscada = null;

        try {
            lectura = new FileInputStream(nombre+".dat");
            ObjectInputStream canalLectura = new ObjectInputStream(lectura);
            buscada = (Persona) canalLectura.readObject();//readObject comvierte a Objeto lo que encuentra 

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException cle) {
            cle.printStackTrace();
        }

        return buscada;
    }

    private static void Imprimir(Persona P) {
        System.out.println(P.getNombre() + "\n"
                + P.getApellidos() + "\n"
                + P.getEdad());
    }

}
