package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private Connection conn;

    public Connection getConnection() throws SQLException {
        try {
            // Reemplaza los valores con tus credenciales
            String url = "jdbc:mysql://localhost:3307/registro";
            String user = "root";
            String password = "Arthas487";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password); // Utiliza DriverManager de java.sql
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}
