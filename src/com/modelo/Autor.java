/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

/**
 *
 * @author Lissette
 */
public class Autor {
    int AutorID;
    String NombreAutor;

    public Autor(){
        
    }
    public Autor(int AutorID, String NombreAutor) {
        this.AutorID = AutorID;
        this.NombreAutor = NombreAutor;
    }

    public int getAutorID() {
        return AutorID;
    }

    public void setAutorID(int AutorID) {
        this.AutorID = AutorID;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String NombreAutor) {
        this.NombreAutor = NombreAutor;
    }
    
    
}
