package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/inventario?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "gabriel";
    private static final String JDBC_PASSWORD = "Underoath.22";

    //variable para no crear un objeto nuevo de DataSource cada vez que llamamos DataSource, y asi evitamos las 50 conexiones creadas por cada llamada
    private static BasicDataSource dataSource;

    public static DataSource getDataSource() throws ClassNotFoundException {

        //Si el objeto dataSource es diferente a nulo, no se crea un objeto nuevo, si es nulo, se crea un objeto nuevo, y se crean 50 conexiones nuevas.
        if (dataSource == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            dataSource = new BasicDataSource();
            dataSource.setUrl(JDBC_URL);
            dataSource.setUsername(JDBC_USER);
            dataSource.setPassword(JDBC_PASSWORD);
            dataSource.setInitialSize(50);
        }

        return dataSource;
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return getDataSource().getConnection();
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
