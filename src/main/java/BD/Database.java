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
    private static String db = "apex";
    private static String username = "apex";
    private static String password = "Lobaloba";
    private static String host = "maisonbleue2020.ddns.net";
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
