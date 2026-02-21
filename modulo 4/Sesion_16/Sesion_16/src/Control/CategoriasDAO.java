
package Control;

import AccesoDB.ConectaDB;
import Modelo.Categorias;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CategoriasDAO {
     public static void Insertar(Categorias Elemento) {
          try {
            Connection cn = ConectaDB.Obtener_Conexion();
           PreparedStatement ps = cn.prepareStatement(" insert into categoria(idcategoria, nombre, descripcion, condicion) value(?,?,?,?)");
               ps.setInt(1, Elemento.getIdcategoria());
               ps.setString(2, Elemento.getNombre_categoria());
               ps.setString(3, Elemento.getDescripcion_categoria());
               ps.setString(4, Elemento.getCondicion_categoria());
                int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de insercion: " + e.getMessage());
        }
         }
         
          public static void Actualizar(Categorias Elemento) {
      try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("update articulo set nombre = ?, descripcion = ?, condicion = ? where idcategoria= ? ");
             ps.setString(1, Elemento.getNombre_categoria());
               ps.setString(2, Elemento.getDescripcion_categoria());
               ps.setString(3, Elemento.getCondicion_categoria());
                  ps.setInt(4, Elemento.getIdcategoria());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo actualizar");
            }
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
           public static void Eliminar(Categorias Elemento) {
       try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("delete from categoria where idcatefgoria = ?");
            ps.setInt(1, Elemento.getIdcategoria());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo eliminar");
            }
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
        }
    }
            public static void ConsultarTodos(JTable control) {
                 String[] cabecera = {"idcategoria", "nombre categoria","descripcion  categoria", "condicion categoria"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("select * from categoria");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //rs selecciona el siguiente registro mientras el siguiente registro exista o sea diferente d enulo
                Object[] registro = {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4)};
                modTabla.addRow(registro);
            }
            rs.close();
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
     
    }
     

    
               public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from categoria");
            ResultSet rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
            rs.close();
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }
                public static void ConsultarTodos(JComboBox control, Arreglo_Categorias arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("select * from categoria order by nombre asc");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro = {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4)};
                modCombo.addElement(rs.getString(2));
                arreglo.Agregar(new Categorias(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
        public static Categorias ConsultarUno(int idcategorias) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from categoria where idcategoria= " + idcategorias);
           Categorias Elemento = null;
            if (rs.next()) {
                Elemento = new Categorias();
                Elemento.setIdcategoria(idcategorias);
                Elemento.setNombre_categoria(rs.getString(2));
                Elemento.setDescripcion_categoria(rs.getString(3));
                Elemento.setCondicion_categoria(rs.getString(4));
               

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
