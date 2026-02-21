
package Control;

import AccesoDB.ConectaDB;
import Modelo.Clientes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientesDAO {
    public static void Insertar(Clientes Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate(" insert into clientes(dcliente, cliente, nombre_cliente, documento_cliente, num_doc_cliente, direccion_cliente, telefono_cliente, email_cliente)"
                    + " value('" + Elemento.getIdcliente()+ "','" + Elemento.getCliente()+ "','" + Elemento.getNombre_cliente()+ "','" + Elemento.getDocumento_cliente()+ "','" + Elemento.getNum_doc_cliente()+ "',"
                    + "'" + Elemento.getDireccion_cliente()+ "','" + Elemento.getTelefono_cliente()+ "','" + Elemento.getEmail_cliente()+ "')");
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
    public static void Actualizar(Clientes Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
          /*  int rpta1 = st.executeUpdate("UPDATE clientes SET idcliente = " + Elemento.getIdcliente()+ " WHERE idcliente = " + Elemento.getIdcliente());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }*/
            int rpta2 = st.executeUpdate("UPDATE clientes SET cliente = " + Elemento.getCliente()+ " WHERE cliente = " + Elemento.getCliente());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta3 = st.executeUpdate("UPDATE clientes SET nombre_cliente = " + Elemento.getNombre_cliente()+ " WHERE nombre_cliente = " + Elemento.getNombre_cliente());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta4 = st.executeUpdate("UPDATE clientes SET documento_cliente = " + Elemento.getDocumento_cliente()+ " WHERE documento_cliente = " + Elemento.getDocumento_cliente());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta5 = st.executeUpdate("UPDATE clientes SET num_doc_cliente = " + Elemento.getNum_doc_cliente()+ " WHERE num_doc_cliente = " + Elemento.getNum_doc_cliente());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta6 = st.executeUpdate("UPDATE clientes SET direccion_cliente = " + Elemento.getDireccion_cliente()+ " WHERE direccion_cliente = " + Elemento.getDireccion_cliente());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta7 = st.executeUpdate("UPDATE clientes SET  telefono_cliente = " + Elemento.getTelefono_cliente()+ " WHERE  telefono_cliente = " + Elemento.getTelefono_cliente());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "actualizacion fallida");
            }
            int rpta8 = st.executeUpdate("UPDATE clientes SET email_cliente = " + Elemento.getEmail_cliente()+ " WHEREemail_cliente = " + Elemento.getEmail_cliente());
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
     public static void Eliminar(Clientes Elemento) {
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            int rpta1 = st.executeUpdate("delete from clientes where idcliente=" + Elemento.getIdcliente());
            if (rpta1 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
           /* int rpta2 = st.executeUpdate("delete from clientes where cliente=" + Elemento.getCliente());
            if (rpta2 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta3 = st.executeUpdate("delete from clientes where nombre_cliente=" + Elemento.getNombre_cliente());
            if (rpta3 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta4 = st.executeUpdate("delete from clientres where documento_cliente=" + Elemento.getDocumento_cliente());
            if (rpta4 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta5 = st.executeUpdate("delete from clientes where num_doc_cliente=" + Elemento.getNum_doc_cliente());
            if (rpta5 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta6 = st.executeUpdate("delete from clientes where direccion_cliente=" + Elemento.getDireccion_cliente());
            if (rpta6 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta7 = st.executeUpdate("delete from clientes where telefono_cliente=" + Elemento.getTelefono_cliente());
            if (rpta7 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
            int rpta8 = st.executeUpdate("delete from clientes where email_cliente=" + Elemento.getEmail_cliente());
            if (rpta8 > 0) {
                JOptionPane.showMessageDialog(null, "eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "eliminacion fallida");
            }
           */
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de eliminacion: " + e.getMessage());
        }
    }
     public static void ConsultarTodos(JTable control) {
        String[] cabecera = {"idcliente","cliente","nombre","documento","num documento","direccion","telefono","email"};
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
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
        }

    }

    public static Clientes ConsultarUno(int idcliente) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from venta where idventa= " + idcliente);
            Clientes Elemento = null;
            if (rs.next()) {
                Elemento = new Clientes();
                Elemento.setIdcliente(idcliente);
                Elemento.setCliente(rs.getString(2));
                Elemento.setNombre_cliente(rs.getString(3));
                Elemento.setDocumento_cliente(rs.getString(4));
                Elemento.setNum_doc_cliente(rs.getString(5));
                Elemento.setDireccion_cliente(rs.getString(6));
                Elemento.setTelefono_cliente(rs.getString(7));
                Elemento.setEmail_cliente(rs.getString(8));
             

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
