/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author echamorro
 */
public class Conexion {
    Connection conectar= null;
    String usuario="root";
    String contrasena="123456";
    String bd="market";
    String ip="Localhost";
    String puerto="3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,contrasena);
            JOptionPane.showMessageDialog(null,"Se conecto");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"no se conecto"+e.toString());
        }
    return conectar;
    }
    
}