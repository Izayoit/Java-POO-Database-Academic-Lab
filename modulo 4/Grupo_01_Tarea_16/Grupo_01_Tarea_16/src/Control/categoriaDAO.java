package Control;

import AccesoDB.ConectaDB;
import Modelo_mantenimiento.categoria;
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

public class categoriaDAO {

    // DAO -> Data Access Object (Objeto de acceso a datos)
    public static void Insertar(categoria Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("insert into categoria(nombre,descripcion,condicion) values('"
                    + Elemento.getNombre() + "','"
                    + Elemento.getDescripcion() + "','"
                    + Elemento.getCondicion() + "')");
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

    public static void Actualizar(categoria Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("update categoria set "
                    + "nombre='" + Elemento.getNombre() + "', "
                    + "descripcion='" + Elemento.getDescripcion() + "', "
                    + "condicion='" + Elemento.getCondicion() + "' "
                    + "WHERE idcategoria=" + Elemento.getIdcategoria());
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

    public static void Eliminar(categoria Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            int rpta = st.executeUpdate("delete from categoria where idcategoria=" + Elemento.getIdcategoria());
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
        String[] cabecera = {"Código", "Nombre", "descripcion", "condicion"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from categoria");
            while (rs.next()) {
                Object[] registro = {
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4)==1  ? "Activo" : "Inactivo"
                };
                modTabla.addRow(registro);
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar: " + e.getMessage());
        }
    }

    public static categoria ConsultarUno(int codigo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from categoria where idcategoria=" + codigo);
            categoria Elemento = null;
            if (rs.next()) {
                Elemento = new categoria() ;
                Elemento.setIdcategoria(rs.getInt(1));
                Elemento.setNombre(rs.getString(2));
                Elemento.setDescripcion(rs.getString(3));
                Elemento.setCondicion(rs.getInt(4));
            }
            st.close();
            ConectaDB.CerrarConexion(cn);
            return Elemento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar dato por codigo: " + e.getMessage());
            return null;
        }
    }
public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from categoria");
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

    public static void ConsultarTodosCBN(JComboBox control, Arreglo_categoriaNA arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from categoria");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 //rs se usa para seleccionar el siguiente registro while mientras siga existiendo  un registro
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)};
                modCombo.addElement(rs.getString(2));
                arreglo.Agregar(new categoria(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar categorias: "+e.getMessage());
        }        
    }
}
