package Control;

import AccesoDB.ConectaDB;
import Modelo_mantenimiento.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    // DAO -> Data Access Object (Objeto de acceso a datos)
    public static void Insertar(usuario Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("insert into users(name,email,password) values('" 
                            + Elemento.getNombre() + "','" 
                            + Elemento.getEmail() + "','" 
                            + Elemento.getPassword() + "')");
            // 0 -> No inserté ningún registro // > 0 -> Inserté tal cantidad de registros
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Registro fallido");
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de inserción: " + e.getMessage());
        }
    }

    public static void Actualizar(usuario Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("update users set " +
                       "name='" + Elemento.getNombre() + "', " +
                       "email='" + Elemento.getEmail() + "', " +
                       "password='" + Elemento.getPassword() + "' " +
                       "WHERE id=" + Elemento.getIduser());
            // 0 -> No inserté ningún registro // > 0 -> Inserté tal cantidad de registros
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualización exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Actualización fallida");
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de actualización: " + e.getMessage());
        }
    }

    public static void Eliminar(usuario Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("delete from users where id=" + Elemento.getIduser());
            // 0 -> No inserté ningún registro // > 0 -> Inserté tal cantidad de registros
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Eliminación fallida");
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de eliminación: " + e.getMessage());
        }
    }

    public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"Código", "Nombre","email","password"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from users");
            while (rs.next()) {
                Object[] registro = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                modTabla.addRow(registro);
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }
 public static usuario ConsultarUno(int codigo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from users where id=" + codigo);
            usuario Elemento = null;
            if (rs.next()) {
                Elemento = new usuario();
                Elemento.setIduser(rs.getInt(1));
                Elemento.setNombre(rs.getString(2));
                Elemento.setEmail(rs.getString(3));
                Elemento.setPassword(rs.getString(4));
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
            return Elemento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar dato por codigo: " + e.getMessage());
            return null;
        }
    }
 
 
 
 
   public static void ConsultarTodosCBN(JComboBox control, Arreglo_usuarioNA arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from users");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 //rs se usa para seleccionar el siguiente registro while mientras siga existiendo  un registro
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                modCombo.addElement(rs.getString(2));
                arreglo.Agregar(new usuario(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar categorias: "+e.getMessage());
        }        
    }
    
    
     
     public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from users");
            ResultSet rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }
     
 
 
 
 
 
   
}
