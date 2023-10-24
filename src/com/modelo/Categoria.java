/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

/**
 *
 * @author Lissette
 */
public class Categoria {
    int CategoriaID;
    String NombreCategoria;
    public Categoria(){
        
    }

    public Categoria(int CategoriaID, String NombreCategoria) {
        this.CategoriaID = CategoriaID;
        this.NombreCategoria = NombreCategoria;
    }

    public int getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(int CategoriaID) {
        this.CategoriaID = CategoriaID;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
    
    
}
