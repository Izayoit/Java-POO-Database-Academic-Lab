
package control;

import accesoDB.ConectarDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.usuarios;


public class usuarioDAO {
    
    public static void Insertar(usuarios Elemento) {
        try {
            Connection cn = ConectarDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("insert into usuarios(nombre,correo,telefono,direccion,fecha_registro) values('" 
                            + Elemento.getNombre() + "','" 
                            + Elemento.getCorreo() + "','" 
                            + Elemento.getTelefono() + "','" 
                            + Elemento.getDireccion() + "','" 
                            + Elemento.getFecha()+ "')");
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Registro fallido");
            }
            st.close();
            ConectarDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de inserccion:" + e.getMessage());
        }
    }

    public static void Actualizar(usuarios Elemento) {
        try {
            Connection cn = ConectarDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("update usuarios set " +
                       "nombre='" + Elemento.getNombre() + "', " +
                       "correo='" + Elemento.getCorreo() + "', " +
                       "telefono='" + Elemento.getTelefono() + "' " +
                       "direccion='" + Elemento.getDireccion() + "' " +
                       "fecha_registro='" + Elemento.getFecha() + "' " +
                       "WHERE id=" + Elemento.getId_usuario());
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Actualizacion fallida");
            }
            st.close();
            ConectarDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Actualizacion: " + e.getMessage());
        }

    }

    public static void Eliminar(usuarios Elemento) {
try {
            Connection cn = ConectarDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("delete from usuarios where id_usuario="+Elemento.getId_usuario());
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Eliminacion fallida");
            }
            st.close();
            ConectarDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Eliminacion: " + e.getMessage());
        }

    }

    public static void ConsultarTodos(JTable control) {
        String[] cabezera = {"codigo", "nombre","correo","telefono","direccion","fecha_registro"};
        DefaultTableModel modTabla = new DefaultTableModel(cabezera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectarDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("Select * from usuarios");
            while (rs.next()) {
                Object[] registro = {
                    rs.getInt(1), 
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)

                };
                modTabla.addRow(registro);
            }
            st.close();
            ConectarDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }
    }

    public static usuarios ConsultarUno(int codigo) {

        try {
            Connection cn = ConectarDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from usuarios where id_usuario=" + codigo);
            usuarios Elemento = null;
            if (rs.next()) {
                Elemento = new usuarios();
                Elemento.setId_usuario(rs.getInt(1));
                Elemento.setNombre(rs.getString(2));
                Elemento.setCorreo(rs.getString(3));
                Elemento.setTelefono(rs.getString(4));
                Elemento.setDireccion(rs.getString(5));
                Elemento.setFecha(rs.getString(6));
            }
            st.close();
            ConectarDB.CerrarConexion(cn);
            return Elemento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }
        return null;
    }
}
