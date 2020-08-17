package Datos;

import Dominio.Encargado;
import java.sql.*;
import java.util.*;

public class EncargadoDaoJDBC {

    private static final String SQL_SELECT = "SELECT id_encargado, nombre_usuario, nombre, apellido_1"
            + " FROM encargado_area";
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
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_encargado = rs.getInt("id_encargado");
                String nombre_usuario = rs.getString("nombre_usuario");
                String nombre = rs.getString("nombre");
                String apellido_1 = rs.getString("apellido_1");
                encargado = new Encargado(id_encargado, nombre_usuario, nombre, apellido_1);
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
