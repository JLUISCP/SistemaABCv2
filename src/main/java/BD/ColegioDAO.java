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
 * Data Access Object para la tabla Colagio de la base de datos
 * Escuela en PostgreSQL.
 * En esta clase se controlan todas las conexiones que se realizan a la BD
 * para realizar las operaciones de crear, actualizar, consultar y eliminar
 * de la tabla Colegio
 *
 * @author asisr
 */
public class ColegioDAO {
    /**
     * Se conecta a la base de datos y consulta 
     * los registros de los colegios que esten activos.
     * @return ResultSet que contiene los resultados de la busqueda. 
     */
    public static ResultSet consultarColegios(){
        Connection conn = Database.getConexion();
        String consulta = "SELECT idcolegio, tipo, ciudad, activo, nombre FROM \"colegio\" WHERE activo = true";
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
   /**
     * Se acualiza el registro de un Colegio a activo = false.
     * @param idColegio Id del colegio que se actualizara.
     * @return True si se pudo actualizar.
     * False si no fue posible actualizar el registro.
     */
    public static Boolean eliminarColegio(int idColegio){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"colegio\" SET activo=? "
                + "WHERE \"idcolegio\" = ?;";
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
    /**
     * Registra en la base de datos un nuevo colegio.
     * @param colegio que se registrará
     * @return 
     */    
    public static Boolean registrarColegio(Colegio colegio){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO \"colegio\" (tipo, ciudad, activo, nombre) VALUES (?, ?, ?, ?)";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, colegio.getTipoColegio());
            ps.setString(2, colegio.getCiudad());
            ps.setBoolean(3, colegio.getActivo());
            ps.setString(4, colegio.getNombreColegio());
            
            int respuesta = ps.executeUpdate();
            if(respuesta > 0){
                resultado = true;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return resultado;
    }
    /**
     * Modifica en la base de datos el registro de un colegio.
     * @param colegio Registro que se actualizará
     * @return True si se pudo actualizar, 
     * False si no fue posible actualizar el registro.
     */
    public static Boolean modificarColegio(Colegio colegio){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"colegio\" SET tipo = ?, ciudad = ?, activo = ?, nombre = ? WHERE idcolegio = ?";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, colegio.getTipoColegio());
            ps.setString(2, colegio.getCiudad());
            ps.setBoolean(3, colegio.getActivo());
            ps.setString(4, colegio.getNombreColegio());
            ps.setInt(5, colegio.getIdColegio());
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
