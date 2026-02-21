
package modelo_reportes;

import AccesoDB.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class consulta_comprasDAO {
    
    
    
  

    // Método para insertar un nuevo ingreso
    public static void Insertar(consulta_compras Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            String sql = "insert into detalle_ingreso(cantidad,precio_compra,precio_venta,idingreso,idarticulo) "
                       + "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = cn.prepareStatement(sql);
           
            ps.setInt(1, Elemento.getCantidad());
            ps.setDouble(2, Elemento.getPrecio_compra());
            ps.setDouble(3, Elemento.getPrecio_venta());
            ps.setInt(4, Elemento.getIdingreso());
            ps.setInt(5, Elemento.getIdarticulo());

            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: " + e.getMessage());
        }
    }
    // Método para obtener todos los ingresos
   
    public static void Actualizar(consulta_compras Elemento){
        try {
            
            
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
            "update detalle_ingreso " +
            "SET cantidad = ?, precio_compra = ?, precio_venta = ?, idingreso = ?, idarticulo = ? " +
            "WHERE iddetalle_ingreso = ?"
            );
           
            ps.setInt(1, Elemento.getCantidad());
            ps.setDouble(2, Elemento.getPrecio_compra());
            ps.setDouble(3, Elemento.getPrecio_venta());
            ps.setInt(4, Elemento.getIdingreso());
            ps.setInt(5, Elemento.getIdarticulo());
            ps.setInt(6,Elemento.getId_detalle_compra());
            int rpta = ps.executeUpdate();
           
            System.out.println("xd "+Elemento.getId_detalle_compra());
            
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al actualizar consulta compras"+e.getMessage());
        }
    }
 
   
   public static void ConsultarTodos(JTable control, Arreglo_ConComprasAR arreglo) {
    String[] cabecera = { "ID detalle ingreso", "cantidad", "precio_compra", "precio_venta", "Estado_ingreso", "Nombre_articulo"};
    DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
    control.setModel(modTabla);

    try {
        Connection cn = ConectaDB.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
     "select d.iddetalle_ingreso , d.cantidad , d.precio_compra , d.precio_venta , i.idingreso , i.estado , a.idarticulo , a.nombre\n" +
"from ingreso i, articulo a,detalle_ingreso d\n" +
"where  d.idarticulo = a.idarticulo and d.idingreso = i.idingreso");
        ResultSet rs = ps.executeQuery();
           while(rs.next()){
                  
                Object[] registro1 = {rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getDouble(3), 
                                    rs.getDouble(4),
                                    rs.getInt(5), 
                                    rs.getString(8),
                                 
                };//el nombre
                
                modTabla.addRow(registro1);
                Object[] registro2 = {
                                    rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getDouble(3), 
                                    rs.getDouble(4),
                                    rs.getInt(5), 
                                    rs.getInt(7),
                };//arreglo cursp
                
                arreglo.Agregar(new consulta_compras(registro2));
            }
   
        rs.close();    
        ps.close();
        ConectaDB.CerrarConexion(cn);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al consultar ingresos: " + e.getMessage());
    }
}
    

    
   
    // Método para eliminar un ingreso
    public void eliminarIngreso(int idIngreso) {
        try (
                Connection cn = ConectaDB.ObtenerConexion();
                PreparedStatement stmt = cn.prepareStatement("DELETE FROM ingreso WHERE idingreso = ?")) {
            stmt.setInt(1, idIngreso);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar ingreso: " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
