
package accesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConectarDB {

   
     public static Connection ObtenerConexion(){
        Connection cn =null;
        try {
            String url = "jdbc:mysql://localhost:3307/bibliotecadb";
            String user = "root";
            String password = "Arthas487";
            cn = DriverManager.getConnection(url,user,password);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de conexion:"+e.getMessage());
        }
      
        return cn;
    }
    
    public static void CerrarConexion(Connection cn){
        try {
            if(cn.isClosed()==false){
            cn.close();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de desconexion:"+e.getMessage());
        }
    }
    
    
    
    
}
