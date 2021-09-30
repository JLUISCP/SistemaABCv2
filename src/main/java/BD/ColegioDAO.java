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
        String consulta = "SELECT idcolegio, privado, distrital, activo FROM \"colegio\"";
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
        String consulta = "DELETE FROM \"colegio\" WHERE idcolegio = " + idColegio;
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
        String consulta = "INSERT INTO \"colegio\" (privado, distrital, activo) VALUES (?, ?, ?)";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, colegio.getTipoColegio());
            ps.setString(2, colegio.getCiudad());
            ps.setBoolean(3, colegio.getActivo());
            
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
        String consulta = "UPDATE \"colegio\" SET privado = ?, distrital = ?, activo = ? WHERE idcolegio = ?";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, colegio.getTipoColegio());
            ps.setString(2, colegio.getCiudad());
            ps.setBoolean(3, colegio.getActivo());
            ps.setInt(4, colegio.getIdColegio());
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
