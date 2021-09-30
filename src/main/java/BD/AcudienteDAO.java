/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import Clases.Acudiente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EduardoLeoLim
 */
public class AcudienteDAO {
    
    /**
     * Se conecta a la base de datos y consulta 
     * los registros de los Acudientes que esten activos.
     * @return ResultSet que contiene los resultados de la busqueda. 
     */
    public static ResultSet consultarAcudientes(){
        Connection conn = Database.getConexion();
        String consulta = "SELECT \"idAcudiente\", \"nombreMadre\", \"nombrePadre\", "
                + "email, telefono1, telefono2, activo, \"idEstudiante\" "
                + "FROM \"Acudiente\" WHERE activo = true";
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
     * Registra en la base de datos un nuevo acudiente.
     * @param acudiente Acudiente que se registrará
     * @return 
     */
    public static boolean registrarAcudiente(Acudiente acudiente){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO public.\"Acudiente\"(" +
            " \"nombreMadre\", \"nombrePadre\", email, \"idEstudiante\", " +
            "activo, telefono1, telefono2)" +
            " VALUES ( ?, ?, ?, ?, ?, ?, ?);";
        
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, acudiente.getNom_madre());
            ps.setString(2, acudiente.getNom_padre());
            ps.setString(3, acudiente.getDirec_elect());
            ps.setInt(4, acudiente.getIdestudiante());
            ps.setBoolean(5, acudiente.isActivo());
            ps.setString(6, acudiente.getTelefono1());
            ps.setString(7, acudiente.getTelefono2());
            
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
     * Modifica en la base de datos el registro de un acudiente.
     * @param acudiente Registro que se actualizará
     * @return True si se pudo actualizar, 
     * Flase si no fue posible actualizar el registro.
     */
    public static Boolean modificarAcudiente(Acudiente acudiente){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE public.\"Acudiente\" SET \"nombreMadre\"=?, "
                + "\"nombrePadre\"=?, email=?, \"idEstudiante\"=?, activo=?, "
                + "telefono1=?, telefono2=? WHERE \"idAcudiente\" = ?;";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, acudiente.getNom_madre());
            ps.setString(2, acudiente.getNom_padre());
            ps.setString(3, acudiente.getDirec_elect());
            ps.setInt(4, acudiente.getIdestudiante());
            ps.setBoolean(5, acudiente.isActivo());
            ps.setString(6, acudiente.getTelefono1());
            ps.setString(7, acudiente.getTelefono2());
            ps.setInt(8, acudiente.getIdacudiente());
            
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
     * Se acualiza el registro de un Acudiente a activo = flase.
     * @param IdAcudiente Id del Acudiente que se actualizara.
     * @return True si se pudo actualizar, 
     * Flase si no fue posible actualizar el registro.
     */
    public static Boolean eliminarAcudiente(int IdAcudiente){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE public.\"Acudiente\" SET activo=? "
                + "WHERE \"idAcudiente\" = ?;";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
           
            ps.setBoolean(1, false);
            ps.setInt(2, IdAcudiente);
            
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
