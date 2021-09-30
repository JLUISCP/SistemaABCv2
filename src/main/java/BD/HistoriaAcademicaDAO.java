/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import static BD.Database.getConexion;
import Clases.Colegio;
import Clases.HistoriaAcademica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Data Access Object para la tabla de Historia Academica de la base de datos
 * Escuela en PostgreSQL. En esta clase se controlan todas las conexiones que se
 * realizan a la BD para realizar las operaciones de crear, actualizar,
 * consultar y eliminar de la tabla Historia Academica de los estudiantes
 *
 * @author asisr
 */
public class HistoriaAcademicaDAO {

    public static ResultSet consultarHistoriaAcademica() {
        Connection conn = Database.getConexion();
        String consulta = "SELECT idhistorial_academico, idestudiante, cole_ant, año, grado, activo FROM \"historial_academico\"";
        Statement st;
        ResultSet datos = null;
        try {
            st = conn.createStatement();
            datos = st.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return datos;
    }

    public static Boolean registrarHistoriaAcademica(HistoriaAcademica historiaAcademica) {
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO \"historial_academico\" (idestudiante, cole_ant, año, grado, activo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, historiaAcademica.getIdestudiante());
            ps.setString(2, historiaAcademica.getColegio_Anterior());
            ps.setString(3, historiaAcademica.getAño());
            ps.setString(4, historiaAcademica.getGrado());
            ps.setBoolean(5, historiaAcademica.getActivo());

            int respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resultado;
    }

    public static Boolean modificarHistoriaAcademica(HistoriaAcademica historiaAcademica) {
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"historial_academico\" SET idestudiante = ?, cole_ant = ?, año = ?, grado = ?, activo = ? WHERE idhistorial_academico = ?";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, historiaAcademica.getIdestudiante());
            ps.setString(2, historiaAcademica.getColegio_Anterior());
            ps.setString(3, historiaAcademica.getAño());
            ps.setString(4, historiaAcademica.getGrado());
            ps.setBoolean(5, historiaAcademica.getActivo());
            ps.setInt(6, historiaAcademica.getIdhistorial_academico());
            int respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resultado;
    }

    public static Boolean eliminarHistoriaAcademica(int idhistorial_academico) {
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "DELETE FROM \"historial_academico\" WHERE idestudiante = " + idhistorial_academico;
        Statement st;
        try {
            st = conn.createStatement();
            int respuesta = st.executeUpdate(consulta);
            if (respuesta > 0) {
                resultado = true;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return resultado;
    }

}