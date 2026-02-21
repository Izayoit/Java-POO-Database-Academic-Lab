package modelo_operaciones;

import AccesoDB.ConectaDB;
import java.sql.*;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class comprasDAO {
     

  

    // Método para insertar un nuevo ingreso
    public static void Insertar(compras Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            String sql = "INSERT INTO ingreso (tipo_comprobante, serie_comprobante, num_comprobante, fecha_hora, impuesto, estado, idproveedor ) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = cn.prepareStatement(sql);
           
            ps.setString(1, Elemento.getTipoComprobante());
            ps.setString(2, Elemento.getSerieComprobante());
            ps.setString(3, Elemento.getNumComprobante());
            ps.setString(4, Elemento.getFechaHora());
            ps.setDouble(5, Elemento.getImpuesto());
            ps.setString(6, Elemento.getEstado()); 
            ps.setInt(7, Elemento.getIdProveedor());

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
   
    public static void Actualizar(compras Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update ingreso set tipo_comprobante = ?,serie_comprobante = ?,num_comprobante= ?,fecha_hora= ?,impuesto= ?,estado= ?,idproveedor = ? where idingreso = ?");
           
            ps.setString(1, Elemento.getTipoComprobante());
            ps.setString(2, Elemento.getSerieComprobante());
            ps.setString(3, Elemento.getNumComprobante());
            ps.setString(4, Elemento.getFechaHora());
            ps.setDouble(5, Elemento.getImpuesto());
            ps.setString(6, Elemento.getEstado()); 
            ps.setInt(7, Elemento.getIdProveedor());
            ps.setInt(8, Elemento.getIdIngreso());
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
 
   
   public static void ConsultarTodos(JTable control, Arreglo_compraAR arreglo) {
    String[] cabecera = { "ID Ingreso", "Tipo Comprobante", "Serie", "Número", "Fecha y Hora", "Impuesto", "Estado","ID Proveedor"};
    DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
    control.setModel(modTabla);

    try {
        Connection cn = ConectaDB.ObtenerConexion();
        PreparedStatement ps = cn.prepareStatement(
     "SELECT i.idingreso, i.tipo_comprobante, i.serie_comprobante, i.num_comprobante, i.fecha_hora, i.impuesto, i.estado, p.tipo_persona, p.idpersona " +
    "FROM ingreso i, persona p " +
    "WHERE i.idproveedor = p.idpersona ORDER BY i.idingreso");
        ResultSet rs = ps.executeQuery();
           while(rs.next()){
                  
                Object[] registro1 = {rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4),
                                    rs.getString(5), 
                                    rs.getDouble(6),
                                    rs.getString(7),
                                    rs.getString(8),
                };//el nombre
                
                modTabla.addRow(registro1);
                Object[] registro2 = {
                    rs.getInt(1), 
                    rs.getInt(9),
                    rs.getString(2),
                    rs.getString(3), 
                    rs.getString(4),
                    rs.getString(5),
                    rs.getDouble(6),
                    rs.getString(7), 
                    };//arreglo cursp
                
                arreglo.Agregar(new compras(registro2));
            }
   
        rs.close();    
        ps.close();
        ConectaDB.CerrarConexion(cn);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al consultar ingresos: " + e.getMessage());
    }
}
    
    
   
    
   public static void ConsultarTodosCBN(JComboBox control, Arreglo_comprasNA arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from ingreso");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 //rs se usa para seleccionar el siguiente registro while mientras siga existiendo  un registro
                Object[] registro = {
                    rs.getInt(1),  
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4), 
                    rs.getString(5),
                    rs.getString(6),
                    rs.getDouble(7),
                    rs.getString(8),  
                   };
                modCombo.addElement(rs.getString(1));
                arreglo.Agregar(new compras(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar ingreso: "+e.getMessage());
        }        
    }

    

    // Método para actualizar un ingreso
    
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

     public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from ingreso");
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
