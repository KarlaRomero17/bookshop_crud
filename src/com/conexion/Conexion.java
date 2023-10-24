/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Lissette
 */
public class Conexion {
    private Connection conexion;
    
    public Connection getConexion() {
        return conexion;
    }
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    public void conectar() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop?user=root&password=");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR" + e.toString());
        }
    }
    public void desconectar() throws Exception {
        try {
            if (conexion.isClosed() == false) {
                conexion.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
