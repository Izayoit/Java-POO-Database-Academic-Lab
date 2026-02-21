
package Modelo;
import AccesoDB.ConectaDB;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class NewClass {
    
    public static void agregar_usuario(String nombre,String correo,String contraseña){
        
        try{
            Connection cn=ConectaDB.Obtener_Conexion();
            Statement st=cn.createStatement();
            int dato=st.executeUpdate("insert into users(name,email,password) value ('"+nombre+"','"+correo+"','"+contraseña+"')");
            if(dato>0){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }else{
            JOptionPane.showMessageDialog(null, "Registro fallido");
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error de insercion"+e.getMessage());
        }
        
    }

    public static String Buscar(String correo, String contraseña) {
    String resultado = null;
    String dato = "SELECT email, password FROM users WHERE email = ? AND password = ?";
try (
         Connection cn = ConectaDB.Obtener_Conexion();
        PreparedStatement ps = cn.prepareStatement(dato)) {
    ps.setString(1, correo.trim());
    ps.setString(2, contraseña.trim());
    System.out.println("Correo ingresado: " + correo);
System.out.println("Contraseña ingresada: " + contraseña);
        ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                resultado = "Usuario encontrado";
            } else {
                resultado = "Correo o contraseña incorrectos";
            }
        
        
    }catch (SQLException e) {
        e.printStackTrace();
        resultado = "Error en la base de datos: " + e.getMessage();
    }
    return resultado;
}
}
