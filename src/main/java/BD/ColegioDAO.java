/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import static BD.Database.getConexion;
import Clases.Colegio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author asisr
 */
public class ColegioDAO {
    public static ResultSet consultarColegios(){
        Connection conn = Database.getConexion();
        String consulta = "SELECT idcolegio, idestudiante, privado, distrital, activo FROM \"Colegio\"";
        Statement st;
        ResultSet datos = null;
        try{
            st = conn.createStatement();
            datos = st.executeQuery(consulta);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return datos;
    }
    
    public static Boolean eliminarColegio(int idColegio){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "DELETE FROM \"Colegio\" WHERE idcolegio = " + idColegio;
        Statement st;
        try{
            st = conn.createStatement();
            int respuesta = st.executeUpdate(consulta);
            if(respuesta > 0){
                resultado = true;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return resultado;
    }
    
    public static Boolean registrarColegio(Colegio colegio){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO \"Colegio\" (idestudiante, privado, distrital, activo) VALUES (?, ?, ?, ?)";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, colegio.getIdEstudiante());
            ps.setString(2, colegio.getPrivado());
            ps.setString(3, colegio.getDistrital());
            ps.setBoolean(4, colegio.getActivo());
            
            int respuesta = ps.executeUpdate();
            if(respuesta > 0){
                resultado = true;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return resultado;
    }
    
    public static Boolean modificarColegio(Colegio colegio){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"Colegio\" SET idestudiante = ?, privado = ?, distrital = ?, activo = ? WHERE idestudiante = ?";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, colegio.getIdEstudiante());
            ps.setString(2, colegio.getPrivado());
            ps.setString(3, colegio.getDistrital());
            ps.setBoolean(4, colegio.getActivo());
            ps.setInt(6, colegio.getIdColegio());
            int respuesta = ps.executeUpdate();
            if(respuesta > 0){
                resultado = true;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return resultado;
    }
}
