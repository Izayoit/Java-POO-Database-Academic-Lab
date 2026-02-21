package Control;

import AccesoDB.ConectaDB;
import Modelo.Curso;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CursoDAO {

    // DAO -> Data Access Object (Objeto de acceso a datos)
    public static void Insertar(Curso Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("insert into curso(nombre) value('" + Elemento.getNombre() + "')");
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

    public static void Actualizar(Curso Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("update curso set nombre='" + Elemento.getNombre() + "' where codcurso=" + Elemento.getCodCurso());
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

    public static void Eliminar(Curso Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("delete from curso where codcurso=" + Elemento.getCodCurso());
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
        String[] cabecera = {"Código", "Nombre"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from curso");
            while (rs.next()) {
                Object[] registro = {
                    rs.getInt(1),
                    rs.getString(2)
                };
                modTabla.addRow(registro);
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public static Curso ConsultarUno(int codigo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from curso where codcurso=" + codigo);
            Curso Elemento = null;
            if (rs.next()) {
                Elemento = new Curso();
                Elemento.setCodCurso(rs.getInt(1));
                Elemento.setNombre(rs.getString(2));
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
            return Elemento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar dato por codigo: " + e.getMessage());
            return null;
        }
    }
}
