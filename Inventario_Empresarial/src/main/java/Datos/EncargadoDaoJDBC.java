package Datos;

import Dominio.Area_TI;
import Dominio.Encargado;
import Dominio.Inventario;
import java.sql.*;
import java.util.*;

public class EncargadoDaoJDBC {

    //Queries Encargado_area
    private static final String SQL_SELECT_INNER_JOIN_ACTIVOS = "SELECT\n"
            + "t1.id_activo, \n"
            + "t1.activo_des, \n"
            + "netbios, \n"
            + "hostname,\n"
            + "os,\n"
            + "os_version\n"
            + "FROM activo t1 \n"
            + "INNER JOIN activo_detalles t2\n"
            + "ON t1.id_activo = t2.id_activo_detalles";
    private static final String SQL_SELECT_INNER_JOIN_ENCARGADO = "SELECT \n"
            + "    t1.id_encargado,\n"
            + "    t1.nombre_usuario,\n"
            + "    t1.nombre,\n"
            + "    t1.apellido_1,\n"
            + "    correo_1, \n"
            + "    numero_1\n"
            + "FROM\n"
            + "    encargado_area t1\n"
            + "INNER JOIN correo_encargado t2 \n"
            + "    ON t1.id_encargado = t2.encargado_area_id_encargado\n"
            + "INNER JOIN numero_encargado t3 \n"
            + "    ON t1.id_encargado = t3.encargado_area_id_encargado;";
    private static final String SQL_BY_AREA_IT = "SELECT\n"
            + "t1.id_area, \n"
            + "t1.nombre_area, \n"
            + "nombre_plataforma, \n"
            + "nombre_region \n"
            + "FROM area_ti t1 \n"
            + "INNER JOIN plataforma t2\n"
            + "ON t1.id_area = t2.id_plataforma\n"
            + "INNER JOIN region t3\n"
            + "ON t1.id_area = t3.id_region";
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
            stmt = conn.prepareStatement(SQL_SELECT_INNER_JOIN_ENCARGADO);
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

    public List<Inventario> listar_activos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Inventario activo = null;
        List<Inventario> activos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_INNER_JOIN_ACTIVOS);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_activo = rs.getInt("id_activo");
                String activo_des = rs.getString("activo_des");
                String netbios = rs.getString("netbios");
                String hostname = rs.getString("hostname");
                String os = rs.getString("os");
                String os_version = rs.getString("os_version");
                activo = new Inventario(id_activo, activo_des, netbios, hostname, os, os_version);
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
    
        public List<Area_TI> listar_area_it() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Area_TI area = null;
        List<Area_TI> areas = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_INNER_JOIN_ACTIVOS);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_area = rs.getInt("id_area");
                String nombre_area = rs.getString("nombre_area");
                String nombre_plataforma = rs.getString("nombre_plataforma");
                String nombre_region = rs.getString("nombre_region");
                area = new Area_TI(id_area, nombre_area, nombre_plataforma, nombre_region);
                areas.add(area);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        }
        return areas;
    }

}
