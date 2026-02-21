
package Control;

import AccesoDB.ConectaDB;
import Modelo.Compra;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ComprasDAO {
      public static void Insertar(Compra Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into ingreso(idingreso, idproveedor, tipo_comprobamte, serie_comprobante, num_comprovante, fecha_hora, impuesto, estado)"
                    + " value('" + Elemento.getIdcompra()+ "','" + Elemento.getIdproveedor()+ "','" + Elemento.getTipocomprobamteC() + "','" + Elemento.getSerio_comprobanteC()+ "','" + Elemento.getNum_comprovanteC()+ "',"
                    + "'" + Elemento.getFechaC()+ "','" + Elemento.getImpuestoC()+ "','" + Elemento.getEstadoC()+  "')");
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
       public static void Actualizar(Compra Elemento) {
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
            int rpta3 = st.executeUpdate("UPDATE ingreso SET  tipo_comprobamte = " + Elemento.getTipocomprobamteC()+ " WHERE  tipo_comprobamte = " + Elemento.getTipocomprobamteC());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta4 = st.executeUpdate("UPDATE ingreso SET serie_comprobante = " + Elemento.getSerio_comprobanteC()+ " WHERE serio_comprobante = " + Elemento.getSerio_comprobanteC());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta5 = st.executeUpdate("UPDATE ingreso SET num_comprobante = " + Elemento.getNum_comprovanteC()+ " WHERE num_comprobante = " + Elemento.getNum_comprovanteC());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta6 = st.executeUpdate("UPDATE ingreso SET fecha_hora = " + Elemento.getFechaC()+ " WHERE fecha_hora = " + Elemento.getFechaC());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta7 = st.executeUpdate("UPDATE ingreso SET impuesto = " + Elemento.getImpuestoC()+ " WHERE impuesto = " + Elemento.getImpuestoC());
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
            int rpta9 = st.executeUpdate("UPDATE ingreso SET estado = " + Elemento.getEstadoC()+ " WHERE estado = " + Elemento.getEstadoC());
            if (rpta9 > 0) {
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
          public static void Eliminar(Compra Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete from ingreso where idingreso=" + Elemento.getIdcompra());
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
        String[] cabecera = {"idcompra", "proveedor","tipo de comprobante"," serie de comprobante","num comprovante","fecha","impuesto","total de venta","estado"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(" select * from venta");
            while (rs.next()) {
                Object[] registro = {rs.getInt(1),rs.getInt(2),rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getDouble(8),rs.getString(9)};
                modtabla.addRow(registro);
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }

    }

    public static Compra ConsultarUno(int idcompra) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from compra where idcompra= " + idcompra);
            Compra Elemento = null;
            if (rs.next()) {
                Elemento = new Compra();
                Elemento.setIdcompra(idcompra);
                Elemento.setIdproveedor(rs.getInt(2));
                Elemento.setTipocomprobamteC(rs.getString(3));
                Elemento.setSerio_comprobanteC(rs.getString(4));
                Elemento.setNum_comprovanteC(rs.getString(5));
                Elemento.setFechaC(rs.getString(6));
                Elemento.setImpuestoC(rs.getDouble(7));
                Elemento.setTotal_ventaC(rs.getDouble(8));
                Elemento.setEstadoC(rs.getString(9));
          

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
