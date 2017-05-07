/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LISTAS_SIMPLES;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author familia
 */
class Conexion {
    Connection conex = null;
    public Connection conexion(){
        String cadena = "jdbc:postgresql://localhost:5432/proyecto";
        try {
            Class.forName("org.postgresql.Driver");
            conex = DriverManager.getConnection(cadena, "postgres", "1234");
            if(conex !=null){
                System.out.println("CONEXION EXITOSA");
                //JOptionPane.showMessageDialog(null,"CONEXION EXITOSA");
            }
        }catch (Exception exc){
            System.out.println("ERROR:" + exc.getMessage());
        }    
                return conex;
    } 
    
}
