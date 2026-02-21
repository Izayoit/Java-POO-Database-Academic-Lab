
package Control;

import AccesoDB.ConectaDB;
import Modelo.Detalle_ingreso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Detalle_ingresoDAO {
     public static void Insertar(Detalle_ingreso Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into detalle_ingreso(iddetalle_ingreso,idingreso,idarticulo,cantidad,precio_compra,precio_venta)"
                    + " value('" + Elemento.getIddetalle_ingreso()+ "','" + Elemento.getIdingreso()+ "','" + Elemento.getIdarticulo()+ "','" + Elemento.getCantidad()+ "','" + Elemento.getPrecio_compra()+ "',"
                    + "'" + Elemento.getPrecio_venta()+"')");
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
       public static void Actualizar(Detalle_ingreso Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            
            int rpta3 = st.executeUpdate("UPDATE detalle_ingreso SET  cantidad = " + Elemento.getCantidad()+ " WHERE  cantidad = " + Elemento.getCantidad());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta4 = st.executeUpdate("UPDATE detalle_ingreso SET precio_compra  = " + Elemento.getPrecio_compra()+ " WHERE precio_compra = " + Elemento.getPrecio_compra());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta5 = st.executeUpdate("UPDATE detalle_ingreso SET precio_venta  = " + Elemento.getPrecio_venta()+ " WHERE precio_venta = " + Elemento.getPrecio_venta());
            if (rpta5 > 0) {
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
          public static void Eliminar(Detalle_ingreso Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete from detalle_ingreso where iddetalle_ingreso=" + Elemento.getIddetalle_ingreso());
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
        String[] cabecera = {"iddetalle_ingreso","idingreso","idarticulo,cantidad","precio_compra","precio_venta"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(" select * from detalle_ingreso");
            while (rs.next()) {
                Object[] registro = {rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getInt(4),rs.getDouble(5),rs.getDouble(6)};
                modtabla.addRow(registro);
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }

    }

    public static Detalle_ingreso ConsultarUno(int iddetalleingreso) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from detalle_ingreso where iddetalle_ingreso= " + iddetalleingreso);
            Detalle_ingreso Elemento = null;
            if (rs.next()) {
                Elemento = new Detalle_ingreso();
                Elemento.setIddetalle_ingreso(iddetalleingreso);
                Elemento.setIdingreso(rs.getInt(2));
                Elemento.setIdarticulo(rs.getInt(3));
                Elemento.setCantidad(rs.getInt(4));
                Elemento.setPrecio_compra(rs.getDouble(5));
                Elemento.setPrecio_venta(rs.getDouble(6));
                
          

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
