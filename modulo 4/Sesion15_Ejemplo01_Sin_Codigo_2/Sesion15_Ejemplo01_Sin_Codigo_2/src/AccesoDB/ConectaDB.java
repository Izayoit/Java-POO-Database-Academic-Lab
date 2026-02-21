package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectaDB {
    public static Connection ObtenerConexion(){
        Connection cn = null;
        try {            
            String url = "jdbc:mysql://localhost:3307/academia?user=root&password=Arthas487";
            //conexio hacia la base de datos al puerto 3306 
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url);
            //se evalua y de ser favorable revuleve y si no exepcion
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cn;
    }
    
    public static void CerrarConexion(Connection cn){
        try {
            if(cn.isClosed() == false){
                //cierra la conexcion porque son limitadas no consumir mucho ram
                
                cn.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
