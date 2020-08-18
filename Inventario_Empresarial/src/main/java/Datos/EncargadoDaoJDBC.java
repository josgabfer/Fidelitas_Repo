package Datos;

import Dominio.Encargado;
import java.sql.*;
import java.util.*;

public class EncargadoDaoJDBC {
    //Queries Encargado_area
    private static final String SQL_SELECT = "SELECT id_encargado, nombre_usuario, nombre, apellido_1"
            + " FROM encargado_area";
        private static final String SQL_SELECT_INNER_JOIN = "SELECT \n" +
"    t1.id_encargado,\n" +
"    t1.nombre_usuario,\n" +
"    t1.nombre,\n" +
"    t1.apellido_1,\n" +
"    correo_1, \n" +
"    numero_1\n" +
"FROM\n" +
"    encargado_area t1\n" +
"INNER JOIN correo_encargado t2 \n" +
"    ON t1.id_encargado = t2.encargado_area_id_encargado\n" +
"INNER JOIN numero_encargado t3 \n" +
"    ON t1.id_encargado = t3.encargado_area_id_encargado;";
    private static final String SQL_BY_ID = "SELECT id_encargado, nombre_usuario, nombre, apellido_1"
            + " FROM encargado_area WHERE id_encargado = ?";
    private static final String SQL_INSERT = "INSERT into encargado_area(nombre_usuario, nombre, apellido_1) "
            + "VALUES (?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE encargado_area "
            + "SET nombre_usuario=?, nombre=?, apellido_1=?";
    private static final String SQL_DELETE = "DELETE from encargado_area WHERE id_encargado = ?";
    
    
    public List<Encargado> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Encargado encargado = null;
        List<Encargado> encargados = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_INNER_JOIN);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_encargado = rs.getInt("id_encargado");
                String nombre_usuario = rs.getString("nombre_usuario");
                String nombre = rs.getString("nombre");
                String apellido_1 = rs.getString("apellido_1");
                String correo_1 = rs.getString("correo_1");
                String numero_1 = rs.getString("numero_1");
                encargado = new Encargado(id_encargado, nombre_usuario, nombre, apellido_1, correo_1, numero_1);
                encargados.add(encargado);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        }
        return encargados;
    }

    public Encargado encontrar(Encargado encargado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_BY_ID);
            stmt.setInt(1, encargado.getId_encargado());
            rs = stmt.executeQuery();
            rs.absolute(1);
            String nombre_usuario = rs.getString("nombre_usuario");
            String nombre = rs.getString("nombre");
            String apellido_1 = rs.getString("apellido_1");
            
            encargado.setNombre_usuario(nombre_usuario);
            encargado.setNombre(nombre);
            encargado.setApellido_1(apellido_1);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        }
        return encargado;
        
    }

}
