/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

/**
 *
 * @author Lissette
 */
public class Libro {
    int LibroID;
    String Titulo;
    int AutorID;
    int CategoriaID;
    String ISBN;
    int AnnioPublicacion;
    double Precio;
    String NombreAutor;
    String NombreCategoria;
    public Libro(){
        
    }

    public Libro(int LibroID, String Titulo, int AutorID, int CategoriaID, String ISBN, int AnnioPublicacion, double Precio, String NombreAutor, String NombreCategoria) {
        this.LibroID = LibroID;
        this.Titulo = Titulo;
        this.AutorID = AutorID;
        this.CategoriaID = CategoriaID;
        this.ISBN = ISBN;
        this.AnnioPublicacion = AnnioPublicacion;
        this.Precio = Precio;
        this.NombreAutor = NombreAutor;
        this.NombreCategoria = NombreCategoria;
    }

    

    public int getLibroID() {
        return LibroID;
    }

    public void setLibroID(int LibroID) {
        this.LibroID = LibroID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getAutorID() {
        return AutorID;
    }

    public void setAutorID(int AutorID) {
        this.AutorID = AutorID;
    }

    public int getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(int CategoriaID) {
        this.CategoriaID = CategoriaID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAnnioPublicacion() {
        return AnnioPublicacion;
    }

    public void setAnnioPublicacion(int AnnioPublicacion) {
        this.AnnioPublicacion = AnnioPublicacion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public void setNombreAutor(String NombreAutor) {
        this.NombreAutor = NombreAutor;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
    
    
    
}
