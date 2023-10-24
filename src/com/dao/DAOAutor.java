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
public class DAOAutor extends Conexion{
    public List<Autor> mostrarAutores() throws Exception {
        ResultSet rs;
        List<Autor> lst = new ArrayList();
        try {
            this.conectar();
            String sql = "SELECT * FROM autores";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Autor item = new Autor();
                item.setAutorID(rs.getInt("AutorID"));
                item.setNombreAutor(rs.getString("NombreAutor"));
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
    public void crearAutor(Autor item) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO autores(NombreAutor)VALUES(?);";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
          //  pst.setInt(1, item.getCodigoDepartamento());
            pst.setString(1, item.getNombreAutor());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    //Método para actualizar registros del proveedor
    public void actualizarAutor(Autor item) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE autores SET NombreAutor=? WHERE AutorID=?";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            pst.setString(1, item.getNombreAutor());
            pst.setInt(2, item.getAutorID());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    //Método para eliminar registros del proveedor
    public void eliminarDepartamento(Autor item) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM autores WHERE AutorID=?";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            pst.setInt(1,item.getAutorID());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    public int obtenerIdAutor(String nombreAutor) throws Exception {
        ResultSet res;
        try {
            this.conectar();
            String query = "SELECT AutorID FROM autores WHERE NombreAutor=?";
            PreparedStatement st = this.getConexion().prepareStatement(query);
            st.setString(1, nombreAutor);
            res = st.executeQuery();
            
            if (res.next()) {
                return res.getInt("AutorID");
            } else {
                throw new Exception("Autor no encontrada"); 
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
}
