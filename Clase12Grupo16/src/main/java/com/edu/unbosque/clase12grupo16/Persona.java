/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase12grupo16;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Persona implements Serializable{//Librería para que pueda ser guardado
    
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    /**
     * @param edad sirve para asignar un valor al parametro edad de la clase
     *
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Constructor de la Clase como aparece en DTO
     *
     * @param nombre es para el nombre de la persona (Solo letras)
     * @param apellidos es para los apellidos de la persona (Solo letras)
     * @param edad para la edad de la persona
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
}
