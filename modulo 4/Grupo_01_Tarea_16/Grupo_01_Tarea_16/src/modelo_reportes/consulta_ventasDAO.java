
package modelo_reportes;

import AccesoDB.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class consulta_ventasDAO {
    
    
    public static double calcularTotalVenta(int idVenta) throws SQLException {
        double totalVenta = 0;
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            cn = ConectaDB.ObtenerConexion();
            String query = "SELECT SUM(cantidad * precio_venta - (precio_venta * descuento)) as total " +
                           "FROM detalle_venta WHERE idventa = ?";
            
            ps = cn.prepareStatement(query);
            ps.setInt(1, idVenta);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                totalVenta = rs.getDouble("total");
            }
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (cn != null) ConectaDB.CerrarConexion(cn);
        }
        
        return totalVenta;
    }
    
    
  

    // Método para insertar un nuevo ingreso
    public static void Insertar(consulta_ventas Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            String sql = "insert into detalle_venta(cantidad,precio_venta,descuento,idventa,idarticulo) values (?, ?, ?, ?, ?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setInt(1, Elemento.getCantidad());
            ps.setDouble(2, Elemento.getPrecio_venta());
            ps.setDouble(3, Elemento.getDescuento());
            ps.setInt(4, Elemento.getIdventa());
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
   
    public static void Actualizar(consulta_ventas Elemento){
        try {
            
            
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
            "update detalle_venta " +
            "SET cantidad = ? , precio_venta = ? ,descuento = ?, idventa =? ,idarticulo = ? " +
            "WHERE iddetalle_venta = ?"
            );
           
            ps.setInt(1, Elemento.getCantidad());
            ps.setDouble(2, Elemento.getPrecio_venta());
            ps.setDouble(3, Elemento.getDescuento());
            ps.setInt(4, Elemento.getIdventa());
            ps.setInt(5, Elemento.getIdarticulo());
            ps.setInt(6,Elemento.getId_detalle_venta());
            int rpta = ps.executeUpdate();
           
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
 
   
   public static void ConsultarTodos(JTable control, Arreglo_ConVentasAR arreglo) {
    String[] cabecera = { "ID detalle venta", "cantidad", "precio_venta", "descuento", "idventa", "Nombre_articulo"};
    DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
    control.setModel(modTabla);

    try {
        Connection cn = ConectaDB.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
     "select d.iddetalle_venta , d.cantidad, d.precio_venta, d.descuento , v.idventa, a.idarticulo, a.nombre\n" +
"from detalle_venta d, venta v ,articulo a\n" +
"where d.idarticulo = a.idarticulo and d.idventa = v.idventa");
        ResultSet rs = ps.executeQuery();
           while(rs.next()){
                  
                Object[] registro1 = {rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getDouble(3), 
                                    rs.getDouble(4),
                                    rs.getInt(5), 
                                    rs.getString(7),
                                 
                };//el nombre
                
                modTabla.addRow(registro1);
                Object[] registro2 = {
                                    rs.getInt(1),
                                    rs.getInt(2), 
                                    rs.getDouble(3), 
                                    rs.getDouble(4),
                                    rs.getInt(5), 
                                    rs.getInt(6),
                };//arreglo cursp
                
                arreglo.Agregar(new consulta_ventas(registro2));
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
