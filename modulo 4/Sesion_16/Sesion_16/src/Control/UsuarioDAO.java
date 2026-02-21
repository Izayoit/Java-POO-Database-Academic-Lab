
package Control;

import AccesoDB.ConectaDB;
import Modelo.Usuarios;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {
        public static void Insertar(Usuarios Elemento) {
          try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into users(id, name, email, password)"
                    + " value('" + Elemento.getIdusuario()+ "','" + Elemento.getNombre_usuario()+ "','" + Elemento.getEmail_usuario()+ "','" + Elemento.getPassword_usuario()+ "')");
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "registro fallido");
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de insercion: " + e.getMessage());
        }
         }
 
         
          public static void Actualizar(Usuarios Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("UPDATE users SET name ='" + Elemento.getNombre_usuario()+"', email='"+Elemento.getEmail_usuario()+"', password='"+Elemento.getPassword_usuario()+"' WHERE id = " + Elemento.getIdusuario());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
     
           
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de actualizacion: " + e.getMessage());
        }
    }
           public static void Eliminar(Usuarios Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete from users where id=" + Elemento.getIdusuario());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
          /*  int rpta2 = st.executeUpdate("delete from usuarios where name =" + Elemento.getNombre_usuario());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta3 = st.executeUpdate("delete from usuarios where email =" + Elemento.getEmail_usuario());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta4 = st.executeUpdate("delete from usuarios where password=" + Elemento.getPassword_usuario());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }*/
          
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de eliminacion: " + e.getMessage());
        }
    }
            public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"id usuario", "nombre usuario","email usuario", "password usuario"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(" select * from users");
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4)};
                modtabla.addRow(registro);
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }

    }
              public static Usuarios ConsultarUno(int idusuarios) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from users where id= " + idusuarios);
            Usuarios  Elemento = null;
            if (rs.next()) {
                Elemento = new Usuarios();
                Elemento.setIdusuario(idusuarios);
                Elemento.setNombre_usuario(rs.getString(2));
                Elemento.setEmail_usuario(rs.getString(3));
                Elemento.setPassword_usuario(rs.getString(4));
               

            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
            return Elemento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
            return null;
        }

    }
}
