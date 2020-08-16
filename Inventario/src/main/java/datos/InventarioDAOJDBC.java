package datos;

import dominio.activoDetalles;
import java.sql.*;
import java.util.*;

public class InventarioDAOJDBC {

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
        activoDetalles activodet = null;
        List<activoDetalles> activos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ACTIVO_DETALLES);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_activo = rs.getInt("id_cliente_cliente_detalles");
                String netbios = rs.getString("netbios");
                String hostname = rs.getString("hostname");
                String os = rs.getString("os");
                String os_version = rs.getString("os_version");
    
                activodet = new activoDetalles(netbios, hostname, os, os_version);
                activos.add(activodet);
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

}
