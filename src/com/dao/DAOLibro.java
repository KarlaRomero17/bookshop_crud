/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lissette
 */
public class DAOLibro extends Conexion{
    
    public List<Libro> mostrarLibro() throws Exception {
        ResultSet rs;
        List<Libro> lst = new ArrayList();
        try {
            this.conectar();
            String sql = "SELECT l.*, c.NombreCategoria , a.NombreAutor FROM libros l  join categorias c on c.CategoriaID = l.CategoriaID join autores a on a.AutorID = l.AutorID ";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Libro item = new Libro();
                item.setLibroID(rs.getInt("LibroID"));
                item.setTitulo(rs.getString("Titulo"));
                item.setNombreAutor(rs.getString("NombreAutor"));
                item.setNombreCategoria(rs.getString("NombreCategoria"));
                item.setISBN(rs.getString("ISBN"));
                item.setAnnioPublicacion(rs.getInt("AnioPublicacion"));
                item.setPrecio(rs.getDouble("Precio"));
                lst.add(item);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lst;
    }
    //Método para insertar registros a proveedor
    public void crearLibro(Libro item) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO libros ( Titulo, AutorID, CategoriaID, ISBN, AnioPublicacion, Precio) VALUES( ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            //pst.setInt(1, item.getLibroID());
            pst.setString(1, item.getTitulo());
            pst.setInt(2, item.getAutorID());
            pst.setInt(3, item.getCategoriaID());
            pst.setString(4, item.getISBN());
            pst.setInt(5, item.getAnnioPublicacion());
            pst.setDouble(6, item.getPrecio());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    //Método para actualizar registros del proveedor
    public void actualizarLibro(Libro item) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE libros SET Titulo=?, AutorID=?, CategoriaID=?, ISBN=?, AnioPublicacion=?, Precio=? WHERE LibroID=?";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            pst.setString(1, item.getTitulo());
            pst.setInt(2, item.getAutorID());
            pst.setInt(3, item.getCategoriaID());
            pst.setString(4, item.getISBN());
            pst.setInt(5, item.getAnnioPublicacion());
            pst.setDouble(6, item.getPrecio());
            pst.setInt(7, item.getLibroID());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    //Método para eliminar registros del proveedor
    public void eliminarLibro(Libro item) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM libros WHERE LibroID=?";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            pst.setInt(1,item.getLibroID());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
}
