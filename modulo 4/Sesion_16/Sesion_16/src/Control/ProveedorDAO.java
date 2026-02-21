
package Control;

import AccesoDB.ConectaDB;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProveedorDAO {
     public static void Insertar(Proveedor Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into proveedor(idproveedor, proveedor, nombre_proveedor, documento_proveedor, num_doc_proveedor, direccion_proveedor, telefono_proveedor, email_proveedor)"
                    + " value('" + Elemento.getProveedor()+ "','" + Elemento.getProveedor()+ "','" + Elemento.getNombre_proveedor()+ "','" + Elemento.getDocumento_proveedor()+ "','" + Elemento.getNum_doc_proveedor()+ "',"
                    + "'" + Elemento.getDireccion_proveedor()+ "','" + Elemento.getTelefono_proveedor()+ "','" + Elemento.getEmail_proveedor()+ "')");
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
 public static void Actualizar(Proveedor Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta3 = st.executeUpdate("UPDATE proveedor SET nombre_proveedor = " + Elemento.getNombre_proveedor() + " WHERE nombre_proveedor = " + Elemento.getNombre_proveedor());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta4 = st.executeUpdate("UPDATE proveedor SET documento_proveedor = " + Elemento.getDocumento_proveedor()+ " WHERE documento_proveedor = " + Elemento.getDocumento_proveedor());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta5 = st.executeUpdate("UPDATE proveedor SET num_doc_proveedor = " + Elemento.getNum_doc_proveedor()+ " WHERE num_doc_proveedor = " + Elemento.getNum_doc_proveedor());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta6 = st.executeUpdate("UPDATE proveedor SET  direccion_proveedo = " + Elemento.getDireccion_proveedor()+ " WHERE  direccion_proveedo = " + Elemento.getDireccion_proveedor());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta7 = st.executeUpdate("UPDATE proveedor SET telefono_proveedor = " + Elemento.getTelefono_proveedor()+ " WHERE telefono_proveedor = " + Elemento.getTelefono_proveedor());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta8 = st.executeUpdate("UPDATEproveedor SET email_proveedor = " + Elemento.getEmail_proveedor()+ " WHERE email_proveedor = " + Elemento.getEmail_proveedor());
            if (rpta8 > 0) {
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
   public static void Eliminar(Proveedor Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete fromproveedor  where idproveedor=" + Elemento.getIdproveedor());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de eliminacion: " + e.getMessage());
        }
    }
 public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"id proveedor", "proveedor", "nombre","documento","num documento","direccion","telefono", "email"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(" select * from venta");
            while (rs.next()) {
                Object[] registro = {rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                modtabla.addRow(registro);
            }
            rs.close();
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }

    }

    public static Proveedor ConsultarUno(int idproveedor) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from venta where idventa= " + idproveedor);
            Proveedor Elemento = null;
            if (rs.next()) {
                Elemento = new Proveedor();
                Elemento.setIdproveedor(idproveedor);
                Elemento.setProveedor(rs.getString(2));
                Elemento.setNombre_proveedor(rs.getString(3));
                Elemento.setDocumento_proveedor(rs.getString(4));
                Elemento.setNum_doc_proveedor(rs.getString(5));
                Elemento.setDireccion_proveedor(rs.getString(6));
                Elemento.setTelefono_proveedor(rs.getString(7));
                Elemento.setEmail_proveedor(rs.getString(8));
                

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
