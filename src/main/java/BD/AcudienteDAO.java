/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author EduardoLeoLim
 */
public class AcudienteDAO {
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
}
