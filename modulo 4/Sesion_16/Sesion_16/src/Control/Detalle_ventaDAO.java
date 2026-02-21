
package Control;

import AccesoDB.ConectaDB;
import Modelo.Detalle_venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Detalle_ventaDAO {
     public static void Insertar(Detalle_venta Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into detalle_venta(iddetalle_venta,idventa,idarticulo,cantidad,precio_venta,descuento)"
                    + " value('" + Elemento.getIddetalle_venta()+ "','" + Elemento.getIdventa()+ "','" + Elemento.getIdarticulo()+ "','" + Elemento.getCantidad()+ "','" + Elemento.getPrecio_venta()+ "',"
                    + "'" + Elemento.getDescuento()+"')");
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
       public static void Actualizar(Detalle_venta Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            /*int rpta1 = st.executeUpdate("UPDATE compra SET idcompra = " + Elemento.getIdcompra()+ " WHERE idcompra = " + Elemento.getIdcompra());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta2 = st.executeUpdate("UPDATE compra SET idproveedor = " + Elemento.getIdproveedor() + " WHERE idproveedor = " + Elemento.getIdproveedor());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }*/
            int rpta3 = st.executeUpdate("UPDATE detalle_venta SET  cantidad = " + Elemento.getCantidad()+ " WHERE  cantidad = " + Elemento.getCantidad());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta4 = st.executeUpdate("UPDATE detalle_venta SET precio_venta  = " + Elemento.getPrecio_venta()+ " WHERE precio_venta= " + Elemento.getPrecio_venta());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta5 = st.executeUpdate("UPDATE detalle_venta SET descuento  = " + Elemento.getDescuento()+ " WHERE descuento = " + Elemento.getDescuento());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
           /* int rpta6 = st.executeUpdate("UPDATE detalle_ingreso SET fecha_hora = " + Elemento.getFechaC()+ " WHERE fecha_hora = " + Elemento.getFechaC());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta7 = st.executeUpdate("UPDATE detalle_ingreso SET impuesto = " + Elemento.getImpuestoC()+ " WHERE impuesto = " + Elemento.getImpuestoC());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            /*int rpta8 = st.executeUpdate("UPDATE ingreso SET total_ventaC = " + Elemento.getTotal_ventaC()+ " WHERE total_ventaC = " + Elemento.getTotal_ventaC());
            if (rpta8 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }*/
          
            
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de actualizacion: " + e.getMessage());
        }
    }
          public static void Eliminar(Detalle_venta Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete from detalle_venta where iddetalle_venta=" + Elemento.getIddetalle_venta());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
          /*  int rpta2 = st.executeUpdate("delete from compra where idproveedor=" + Elemento.getIdproveedor());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta3 = st.executeUpdate("delete from compra where tipocomprobamteC=" + Elemento.getNum_comprovanteC());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta4 = st.executeUpdate("delete from compra where serio_comprobanteC=" + Elemento.getSerio_comprobanteC());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta5 = st.executeUpdate("delete from compra where  num_comprovanteC=" + Elemento.getNum_comprovanteC());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta6 = st.executeUpdate("delete from compra where fechaC=" + Elemento.getFechaC());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta7 = st.executeUpdate("delete from compra where  impuestoC=" + Elemento.getImpuestoC());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta8 = st.executeUpdate("delete from compra where  total_ventaC" + Elemento.getTotal_ventaC());
            if (rpta8 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta9 = st.executeUpdate("delete from compra where estadoC=" + Elemento.getEstadoC());
            if (rpta9 > 0) {
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
        String[] cabecera = {"id detalle vento","id venta","id articulo","cantidad","precio venta","descuento"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(" select * from detalle_venta");
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

    public static Detalle_venta ConsultarUno(int iddetalleventa) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from detalle_venta where iddetalle_venta= " + iddetalleventa);
            Detalle_venta Elemento = null;
            if (rs.next()) {
                Elemento = new Detalle_venta();
                Elemento.setIddetalle_venta(iddetalleventa);
                Elemento.setIdventa(rs.getInt(2));
                Elemento.setIdarticulo(rs.getInt(3));
                Elemento.setCantidad(rs.getInt(4));
                Elemento.setPrecio_venta(rs.getDouble(5));
                Elemento.setDescuento(rs.getDouble(6));
                
          

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
