/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ecarv
 */
public class Database {
    private static String db = "Escuela";
    private static String username = "postgres";
    private static String password = "Pythonjavascript29.";
    private static String host = "localhost:5432";
    private static String url = "jdbc:postgresql://"+host+"/"+db;
    
    public static Connection getConexion(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, username, password);           
        }catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }
}
