

package Control;

import AccesoDB.ConectaDB;
import Modelo_mantenimiento.articulos;
import Modelo_mantenimiento.usuario;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ArticulosDAO {
    public static void Insertar(articulos elemento){ //nuevo
        try {
            
         
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into articulo(codigo,nombre,stock,descripcion,imagen,estado,idcategoria) values(?,?,?,?,?,?,?)");
            ps.setString(1, elemento.getCodigo());
            ps.setString(2, elemento.getNombre());
            ps.setInt(3, elemento.getStock());
            ps.setString(4, elemento.getDescripcion());
            ps.setString(5,elemento.getImagen());
            ps.setString(6, elemento.getEstado());
            ps.setInt(7, elemento.getIdcategoria());
            
       
            
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error"+e.getMessage());
        }
    }
    
    public static void Actualizar(articulos Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update articulo set codigo = ?,nombre = ?,stock= ?,descripcion= ?,imagen= ?,estado= ?,idcategoria = ? where idarticulo = ?");
            ps.setString(1, Elemento.getCodigo());
            ps.setString(2, Elemento.getNombre());
            ps.setInt(3, Elemento.getStock());
            ps.setString(4, Elemento.getDescripcion());
            ps.setString(5, Elemento.getImagen());
            ps.setString(6, Elemento.getEstado());
            ps.setInt(7, Elemento.getIdcategoria());
            ps.setInt(8,Elemento.getIdArticulos());
            int rpta = ps.executeUpdate();
           
          
            
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Eliminar(articulos Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from articulo where idarticulo = ?");
            ps.setInt(1, Elemento.getIdArticulos());
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo eliminar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
        }
    }

   
    
     public static void ConsultarTodosARGLO(JTable control, Arreglo_ArticuloAR arreglo){
        String[] cabecera = {"id","Código","Nombre","Stock","descripcion","imagen","estado","categoria"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);    
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                    "select a.idarticulo,a.codigo,a.Nombre, a.stock,a.descripcion,a.imagen,a.estado, c.Nombre,c.idcategoria" +
"  from articulo a,categoria c" +
"  where a.idcategoria = c.idcategoria  order by a.idarticulo asc");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                  
                Object[] registro1 = {rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getInt(4),
                                    rs.getString(5), 
                                    rs.getString(6),
                                    rs.getString(7),
                                    rs.getString(8),
                };//el nombre
                modTabla.addRow(registro1);
                Object[] registro2 = {
                    rs.getInt(1), 
                    rs.getInt(9),
                    rs.getString(2),
                    rs.getString(3), 
                    rs.getInt(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7), 
                   };//arreglo cursp
                arreglo.Agregar(new articulos(registro2));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar articulos: " + e.getMessage());
        }        
    }
    
     
     public static void ConsultarTodosCBN(JComboBox control, Arreglo_ArticuloNA arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from articulo");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 //rs se usa para seleccionar el siguiente registro while mientras siga existiendo  un registro
                Object[] registro = {
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getInt(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                  };
                modCombo.addElement(rs.getString(4));
                arreglo.Agregar(new articulos(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar Articulos: "+e.getMessage());
        }        
    }
     
     
     
     
      public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from articulo");
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
     
     
     
     
     
     
     
     
     
     
     
     
}
