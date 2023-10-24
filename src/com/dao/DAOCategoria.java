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
public class DAOCategoria extends Conexion{
    public List<Categoria> mostrarCategoria() throws Exception {
        ResultSet rs;
        List<Categoria> lst = new ArrayList();
        try {
            this.conectar();
            String sql = "SELECT * FROM categorias ";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Categoria item = new Categoria();
                item.setCategoriaID(rs.getInt("CategoriaID"));
                item.setNombreCategoria(rs.getString("NombreCategoria"));
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
    public void crearCategoria(Categoria item) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT INTO categorias (NombreCategoria)VALUES(?);";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
          //  pst.setInt(1, item.getCodigoDepartamento());
            pst.setString(1, item.getNombreCategoria());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    //Método para actualizar registros del proveedor
    public void actualizarCategoria(Categoria item) throws Exception {
        try {
            this.conectar();
            String sql = "UPDATE categorias SET NombreCategoria=? WHERE CategoriaID=?";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            pst.setString(1, item.getNombreCategoria());
            pst.setInt(2, item.getCategoriaID());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    //Método para eliminar registros del proveedor
    public void eliminarCategoria(Categoria item) throws Exception {
        try {
            this.conectar();
            String sql = "DELETE FROM categorias WHERE CategoriaID=?";
            PreparedStatement pst = this.getConexion().prepareStatement(sql);
            pst.setInt(1,item.getCategoriaID());
            pst.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
    public int obtenerIdCategoria(String nombreCategoria) throws Exception {
        ResultSet res;
        try {
            this.conectar();
            String query = "SELECT CategoriaID FROM categorias WHERE NombreCategoria=?";
            PreparedStatement st = this.getConexion().prepareStatement(query);
            st.setString(1, nombreCategoria);
            res = st.executeQuery();
            
            if (res.next()) {
                return res.getInt("CategoriaID");
            } else {
                throw new Exception("Categoría no encontrada"); 
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }
}
