package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectaDB {
    public static Connection ObtenerConexion(){
        Connection cn = 
            null;
        try {String url = "jdbc:mysql://localhost:3307/registro";
            String user = "root";
            String password = "Arthas487";
           
            
            cn = DriverManager.getConnection(url,user,password);
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
