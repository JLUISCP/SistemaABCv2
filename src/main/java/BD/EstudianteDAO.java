/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import static BD.Database.getConexion;
import Clases.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ecarv
 */
public class EstudianteDAO {
    
    public static ResultSet consultarEstudiantes(){
        Connection conn = Database.getConexion();
        String consulta = "SELECT e.idestudiante, e.primernombre, e.segundonombre, e.primerapellido, e.segundoapellido, e.activo, c.nombre as nombrecolegio FROM estudiante e LEFT JOIN colegio c on e.idcolegio = c.idcolegio WHERE e.activo = true";
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
    
    public static Boolean eliminarEstudiante(int idEstudiante){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"estudiante\" SET activo = false";
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
    
    public static Boolean registrarEstudiante(Estudiante estudiante){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO \"estudiante\" (primernombre, segundonombre, primerapellido, segundoapellido, activo, idcolegio) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, estudiante.getPrimerNombre());
            ps.setString(2, estudiante.getSegundoNombre());
            ps.setString(3, estudiante.getPrimerApellido());
            ps.setString(4, estudiante.getSegundoApellido());
            ps.setBoolean(5, estudiante.getActivo());
            ps.setInt(6, estudiante.getIdColegio());
            
            int respuesta = ps.executeUpdate();
            if(respuesta > 0){
                resultado = true;
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return resultado;
    }
    
    public static Boolean modificarEstudiante(Estudiante estudiante){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"estudiante\" SET primernombre = ?, segundonombre = ?, primerapellido = ?, segundoapellido = ?, activo = ?, idcolegio = ? WHERE idestudiante = ?";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, estudiante.getPrimerNombre());
            ps.setString(2, estudiante.getSegundoNombre());
            ps.setString(3, estudiante.getPrimerApellido());
            ps.setString(4, estudiante.getSegundoApellido());
            ps.setBoolean(5, estudiante.getActivo());
            ps.setInt(6, estudiante.getIdColegio());
            ps.setInt(7, estudiante.getIdEstudiante());
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
