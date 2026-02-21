
package Control;

import AccesoDB.ConectaDB;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VentaDAO {
      public static void Insertar(Venta Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into venta(idventa,idcliente,idusuario,tipo_comprobante,serio_comprobante,num_comprobante,fecha,impuesto,total_venta,estado)"
                    + " value('" + Elemento.getIdventa() + "','" + Elemento.getIdcliente() + "','" + Elemento.getIdusuario() + "','" + Elemento.getTipo_comprobanteV()+ "','" + Elemento.getSerio_comprobanteV()+ " ',"
                    + "'" + Elemento.getNum_comprovanteV()+ "','" + Elemento.getFechaV()+ "','" + Elemento.getImpuestoV()+ "','" + Elemento.getTotal_ventaV()+ "','" + Elemento.getEstadoV()+ "')");
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

    public static void Actualizar(Venta Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
           /* int rpta1 = st.executeUpdate("UPDATE venta SET idventa = " + Elemento.getIdventa() + " WHERE idventa = " + Elemento.getIdventa());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta2 = st.executeUpdate("UPDATE venta SET idcliente = " + Elemento.getIdcliente() + " WHERE idcliente = " + Elemento.getIdcliente());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta3 = st.executeUpdate("UPDATE venta SET idusuario = " + Elemento.getIdusuario() + " WHERE idusuario = " + Elemento.getIdusuario());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }*/
            int rpta4 = st.executeUpdate("UPDATE venta SET tipo_comprobante = " + Elemento.getTipo_comprobanteV()+ " WHERE tipo_comprobante = " + Elemento.getTipo_comprobanteV());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta5 = st.executeUpdate("UPDATE venta SET serio_comprobante = " + Elemento.getSerio_comprobanteV()+ " WHERE tipo_comprobante = " + Elemento.getSerio_comprobanteV());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta6 = st.executeUpdate("UPDATE venta SET num_comprobante = " + Elemento.getNum_comprovanteV()+ " WHERE num_comprovante = " + Elemento.getNum_comprovanteV());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta7 = st.executeUpdate("UPDATE venta SET fecha_hora = " + Elemento.getFechaV()+ " WHERE fecha = " + Elemento.getFechaV());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta8 = st.executeUpdate("UPDATE venta SET impuesto = " + Elemento.getImpuestoV()+ " WHERE impuesto = " + Elemento.getImpuestoV());
            if (rpta8 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta9 = st.executeUpdate("UPDATE venta SET total_venta = " + Elemento.getTotal_ventaV()+ " WHERE tipo_comprobante = " + Elemento.getTotal_ventaV());
            if (rpta9 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta10 = st.executeUpdate("UPDATE venta SET estado = " + Elemento.getEstadoV()+ " WHERE tipo_comprobante = " + Elemento.getEstadoV());
            if (rpta10 > 0) {
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

    public static void Eliminar(Venta Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete from venta where idventa=" + Elemento.getIdventa());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
           /* int rpta2 = st.executeUpdate("delete from venta where idcliente=" + Elemento.getIdcliente());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta3 = st.executeUpdate("delete from venta where idusuario=" + Elemento.getIdusuario());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta4 = st.executeUpdate("delete from venta where tipo_comprobante=" + Elemento.getTipo_comprobanteV());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta5 = st.executeUpdate("delete from venta where serio_comprobante=" + Elemento.getSerio_comprobanteV());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta6 = st.executeUpdate("delete from venta where num_comprobante=" + Elemento.getNum_comprovanteV());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta7 = st.executeUpdate("delete from venta where fecha=" + Elemento.getFechaV());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta8 = st.executeUpdate("delete from venta where impuesto=" + Elemento.getImpuestoV());
            if (rpta8 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta9 = st.executeUpdate("delete from venta where total_venta=" + Elemento.getTotal_ventaV());
            if (rpta9 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta10 = st.executeUpdate("delete from venta where estado=" + Elemento.getEstadoV());
            if (rpta10 > 0) {
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
        String[] cabecera = {"idVenta", "idCliente", "idUsuario", "T.C", "S.C", "N.C", "F", "I", "T.V", "E"};
        DefaultTableModel modtabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modtabla);

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(" select * from venta");
            while (rs.next()) {
                Object[] registro = {rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDouble(8),rs.getDouble(9),rs.getString(10)};
                modtabla.addRow(registro);
            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }

    }

    public static Venta ConsultarUno(int idventa) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from venta where idventa= " + idventa);
            Venta Elemento = null;
            if (rs.next()) {
                Elemento = new Venta();
                Elemento.setIdventa(idventa);
                Elemento.setIdcliente(rs.getInt(2));
                Elemento.setIdusuario(rs.getInt(3));
                Elemento.setTipo_comprobanteV(rs.getString(4));
                Elemento.setSerio_comprobanteV(rs.getString(5));
                Elemento.setNum_comprovanteV(rs.getString(6));
                Elemento.setFechaV(rs.getString(7));
                Elemento.setImpuestoV(rs.getDouble(8));
                Elemento.setTotal_ventaV(rs.getDouble(9));
                Elemento.setEstadoV(rs.getString(10));

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
