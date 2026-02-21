package Control;

import AccesoDB.ConectaDB;
import Modelo.Articulos;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArticuloDAO {

    public static void Insertar(Articulos Elemento) {
     
           try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("insert into articulo(idarticulo, idcategoria, codigo, nombre, stock, descripcion, imagen, estado) value(?,?,?,?,?,?,?,?)");
            ps.setInt(1, Elemento.getIdarticulo());
            ps.setInt(2, Elemento.getIdcategoria());
            ps.setString(3, Elemento.getCodigo_articulo());
         ps.setString(4, Elemento.getNombre_articulo());
          ps.setInt(5, Elemento.getStock_articulo());
           ps.setString(6, Elemento.getDescripcion_articulo());
            ps.setString(7, Elemento.getImagen_articulo());
             ps.setString(8, Elemento.getEstado_artticulo());
          
         
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
                 
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    

 
      public static void Actualizar(Articulos Elemento){
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("update articulo set codigo = ?,nombre = ?,stock = ?,descripcion = ?, imagen = ?, estado = ? where idarticulo = ?, idcategoria = ?");
          ps.setString(1, Elemento.getCodigo_articulo());
         ps.setString(2, Elemento.getNombre_articulo());
          ps.setInt(3, Elemento.getStock_articulo());
           ps.setString(4, Elemento.getDescripcion_articulo());
            ps.setString(5, Elemento.getImagen_articulo());
             ps.setString(6, Elemento.getEstado_artticulo());
                ps.setInt(7, Elemento.getIdarticulo());
            ps.setInt(8, Elemento.getIdcategoria());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
      }

    public static void Eliminar(Articulos Elemento) {
   
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("delete from articulo where idarticulo = ?");
            ps.setInt(1, Elemento.getIdarticulo());
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
    public static void ConsultarTodos(JTable control, Arreglo_Articulos arreglo){
        String[] cabecera = {"idarticulo", "idcategoria", "codigo ", " articulo", "Stock", "descripcion", "iimagen", "estado"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);    
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
              PreparedStatement ps = cn.prepareStatement(
                "SELECT a.idarticulo, a.idcategoria, a.codigo, a.nombre, a.stock, a.descripcion, a.imagen, a.estado, c.nombre " +
                "FROM articulo a " +
                "INNER JOIN categoria c ON a.idcategoria = c.idcategoria " +
                "ORDER BY a.nombre ASC");
           
      
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] registro1 = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8)};
                modTabla.addRow(registro1);
                Object[] registro2 = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(9)};
                arreglo.Agregar(new Articulos(registro2));
               
            }
            rs.close();
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    
/*public static void ConsultarTodos(JTable control, Arreglo_Articulos arreglo) {
    // Cabeceras para la tabla
    String[] cabecera = {"idarticulo", "idcategoria", "codigo", "articulo", "Stock", "descripcion", "imagen", "estado", "categoria"};
    DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
    control.setModel(modTabla);

    try {
        // Conexión a la base de datos
        Connection cn = ConectaDB.Obtener_Conexion();
        PreparedStatement ps = cn.prepareStatement(
            "SELECT a.idarticulo, a.idcategoria, a.codigo, a.nombre AS articulo, " +
            "a.stock, a.descripcion, a.imagen, a.estado, c.nombre AS categoria " +
            "FROM articulo a " +
            "INNER JOIN categoria c ON a.idcategoria = c.idcategoria " +
            "ORDER BY a.nombre ASC"
        );

        ResultSet rs = ps.executeQuery();

        // Procesar los resultados de la consulta
        while (rs.next()) {
            // Agregar datos a la tabla
            Object[] registroTabla = {
                rs.getInt("idarticulo"),
                rs.getInt("idcategoria"),
                rs.getString("codigo"),
                rs.getString("articulo"),
                rs.getInt("stock"),
                rs.getString("descripcion"),
                rs.getString("imagen"),
                rs.getString("estado"),
                rs.getString("categoria")
            };
            modTabla.addRow(registroTabla);

            // Agregar datos al arreglo
            Object[] registroArreglo = {
                rs.getInt("idarticulo"),
                rs.getInt("idcategoria"),
                rs.getString("codigo"),
                rs.getString("articulo"),
                rs.getInt("stock"),
                rs.getString("descripcion"),
                rs.getString("imagen"),
                rs.getString("categoria")
            };
            arreglo.Agregar(new Articulos(registroArreglo));
        }

        // Cerrar recursos
        rs.close();
        ps.close();
        ConectaDB.Cerrar_Conexion(cn);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}*/

    public static Articulos ConsultarUno(int idarticulo) {

        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from articulo where idarticulo= " + idarticulo);
            Articulos Elemento = null;
            if (rs.next()) {
                Elemento = new Articulos();
                Elemento.setIdarticulo(idarticulo);
                Elemento.setIdcategoria(rs.getInt(2));
                Elemento.setCodigo_articulo(rs.getString(3));
                Elemento.setNombre_articulo(rs.getString(4));
                Elemento.setStock_articulo(rs.getInt(5));
                Elemento.setDescripcion_articulo(rs.getString(6));
                Elemento.setImagen_articulo(rs.getString(7));
                Elemento.setEstado_artticulo(rs.getString(8));

            }
            st.close();
            ConectaDB.Cerrar_Conexion(cn);
            return Elemento;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al consultar: " + e.getMessage());
            return null;
        }

    }

    public static int ContarRegistros() {
        int count = 0;
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from articulo");
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

    public static void ConsultarTodos(JComboBox control, Arreglo_Articulos arreglo) {
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.Obtener_Conexion();
            PreparedStatement ps = cn.prepareStatement("select * from articulo order by nombre asc");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)};
                modCombo.addElement(rs.getString(4));
                arreglo.Agregar(new Articulos(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.Cerrar_Conexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


}
