
package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConectaDB {
    
    public static Connection Obtener_Conexion(){
    
       Connection cn=null;
       try{
  String url="jdbc:mysql://localhost:3306/base_de_datos?user=root & password=4321";
           cn=DriverManager.getConnection(url);
       
       }catch(Exception e ){
           JOptionPane.showMessageDialog(null, "Error de conexion"+e.getMessage());
       
       }
        return cn;
    
    }
    
    public static void Cerrar_Conexion(Connection cn){
        
        try{
            if(cn.isClosed() == false){
                cn.close();
            }
                
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error de desconexion"+e.getMessage());
        }
        
    }

  
    
}
