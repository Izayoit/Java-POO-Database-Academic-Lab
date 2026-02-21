package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectaDB {
    public static Connection ObtenerConexion(){
        Connection cn = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3307/academia?user=root&password=1234";
            cn = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return cn;
    }
    
    public static void CerrarConexion(Connection cn){
        try {
            if (cn.isClosed() == false) {
                cn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de desconexión: " + e.getMessage());
        }
    }
}
