package BD;

import Clases.Telefono;

import java.sql.*;


public class TelefonoDAO {
    /**
     * Consulta los telefonos que se encuentran en la base de datos
     * @return Una tabla de datos que representa un resultset, que es el resultado
     * de ejecutar una querie en una base de datos
     */
    public static ResultSet consultarTelefonos(){
        Connection conn = Database.getConexion();
        String consulta = "SELECT idtelefono, fijo, celular, idacudiente, activo FROM \"Telefono\" WHERE activo = true";
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
     * Elimina (eliminado logico) un telefono, especificado por su id, de la base de datos.
     * @param idTelefono id del telefono que se desea eliminar
     * @return resultado de la eliminación de teléfono
     * False: Error al eliminar
     */
    public static Boolean eliminarTelefono(int idTelefono){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"Telefono\" SET activo = ? WHERE idTelefono = " + idTelefono;
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setBoolean(1, false);

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
     * Registra un nuevo telefono en la base de datos.
     * @param telefono Clase telefono, que representa una fila de la tabla Telefono
     * @return resultado del registro en ventana
     * False: Error al registrar
     */
    public static Boolean registrarTelefono(Telefono telefono){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "INSERT INTO \"Telefono\" (fijo, celular, idacudiente, activo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, telefono.getFijo());
            ps.setString(2, telefono.getCelular());
            ps.setInt(3, telefono.getIdacudiente());
            ps.setBoolean(4, telefono.isActivo());

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
     * Modificación en la base de datos de un registro especificado
     * @param telefono Clase telefono, que representa una fila de la tabla Telefono
     * @return resultado true si se pudo modificar el telefono
     * False: Error al modificar
     */
    public static Boolean modificarTelefono(Telefono telefono){
        Boolean resultado = false;
        Connection conn = Database.getConexion();
        String consulta = "UPDATE \"Telefono\" SET fijo = ?, celular = ?, idacudiente = ?, activo = ? WHERE idTelefono = ?";
        PreparedStatement  ps;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, telefono.getFijo());
            ps.setString(2, telefono.getCelular());
            ps.setInt(3, telefono.getIdacudiente());
            ps.setBoolean(4, telefono.isActivo());
            ps.setInt(5, telefono.getIdtelefono());
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
