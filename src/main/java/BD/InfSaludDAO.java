/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import Clases.InfSalud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Data Access Object para la entidad InfSalud. Se
 * encarga de realizar varias funciones relacionadas con Estudiantes
 * en la base de datos. 
 * @author Emilio Antonio Alarcón Santos
 * @version 1.0.0
 */

public class InfSaludDAO {
    
     /**
     * Regresa un conjunto de datos que permitira ver la consultad de salud de
     * un estudiante en la base de datos.
     * @return conjunto de datos
     */
    public static ResultSet consultarInfSalud(){
        Connection conn = Database.getConexion();
        String consulta = "SELECT es.idestudiante, es.primernombre, es.primerapellido, es.segundonombre, es.segundoapellido, sa.activo FROM \"Estudiante\" es INNER JOIN \"salud\" sa ON es.idestudiante = sa.idestudiante";
        Statement st;
        ResultSet informacion = null;
        try{
            st = conn.createStatement();
            informacion = st.executeQuery(consulta);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return informacion;
    }
    
    /**
    * Regresa un conjunto de datos que permitira ver la consultad de salud de
    * un estudiante en la base de datos.
    * @return conjunto de datos
    */
    public static Boolean crearInfSalud(InfSalud infSalud){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO \"salud\" (activo, peso, altura, presionalterial, grupo_sang, indiceMasaCorporal, idestudiante) VALUES(?,?,?,?,?,?,?) ";
        System.out.println(consulta);
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setBoolean(1,infSalud.getActivo());
            ps.setString(2,infSalud.getPeso());
            ps.setString(3,infSalud.getAltura());
            ps.setString(4,infSalud.getPresionArterial());
            ps.setString(5,infSalud.getGrupo_sang());
            ps.setString(6,infSalud.getIndiceMasaCorporal());
            ps.setInt(7,infSalud.getIdestudiante());
            
            int respuesta = ps.executeUpdate();
            if(respuesta > 0){
                resultado = true;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return resultado;
    }
    
        public static Boolean modificarInfSalud(InfSalud infSalud){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"salud\" SET activo = ?, peso = ?, altura = ?, presionalterial = ?, grupo_sang = ?, indiceMasaCorporal = ? WHERE idestudiante = ?";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setBoolean(1,infSalud.getActivo());
            ps.setString(2,infSalud.getPeso());
            ps.setString(3,infSalud.getAltura());
            ps.setString(4,infSalud.getPresionArterial());
            ps.setString(5,infSalud.getGrupo_sang());
            ps.setString(6,infSalud.getIndiceMasaCorporal());
            ps.setInt(7,infSalud.getIdestudiante());
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
