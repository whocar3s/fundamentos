/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.market;
import Conexion.Conexion;
/**
 *
 * @author echamorro
 */
public class Market {

    public static void main(String[] args) {
     Conexion objetoconexion = new Conexion();
     objetoconexion.estableceConexion();
    }
}