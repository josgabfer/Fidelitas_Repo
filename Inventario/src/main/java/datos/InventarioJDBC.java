package datos;

import dominio.Activo;
import dominio.activoDetalles;
import java.sql.*;
import java.util.*;

public class InventarioJDBC {

    private static final String SQL_SELECT_ACTIVO_DETALLES = "SELECT id_activo_detalles, netbios, hostname, os, os_version"
            + " FROM activo_detalles";

    private static final String SQL_SELECT_BY_ID_ACTIVO_DETALLES = "SELECT id_activo_detalles, netbios, hostname, os, os_version "
            + " FROM activo_detalles WHERE id_activo_detalles = ?";

    private static final String SQL_INSERT_ACTIVO_DETALLES = "INSERT INTO activo_detalles(netbios, hostname, os, os_version) "
            + " VALUES(?, ?, ?)";

    private static final String SQL_UPDATE_ACTIVO_DETALLES = "UPDATE activo_detalles "
            + " SET netbios=?, hostname=?, os=?, os_version=? WHERE id_activo_detalles=?";

    private static final String SQL_DELETE_ACTIVO_DETALLES = "DELETE FROM activo_detalles WHERE id_activo_detalles = ?";
    
        public List<activoDetalles> listar() throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        activoDetalles activo = null;
        List<activoDetalles> activos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ACTIVO_DETALLES);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String netbios = rs.getString("netbios");
                String hostname = rs.getString("hostname");
                String os = rs.getString("os");
                String os_version = rs.getString("os_version");
    
                activo = new activoDetalles(netbios, hostname, os, os_version);
                activos.add(activo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return activos;
    }
/*
    public Cliente encontrar(Cliente cliente) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, cliente.getIdCliente());
            rs = stmt.executeQuery();
            rs.absolute(1);//nos posicionamos en el primer registro devuelto

            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String email = rs.getString("email");
            String telefono = rs.getString("telefono");
            double saldo = rs.getDouble("saldo");

            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            cliente.setSaldo(saldo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return cliente;
    }

    public int insertar(Cliente cliente) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.setDouble(5, cliente.getSaldo());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int actualizar(Cliente cliente) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.setDouble(5, cliente.getSaldo());
            stmt.setInt(6, cliente.getIdCliente());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int eliminar(Cliente cliente) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, cliente.getIdCliente());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
*/

}
