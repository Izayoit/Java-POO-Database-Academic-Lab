
package modelo_operaciones;

import AccesoDB.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ventasDAO {
    
    public static void Insertar(ventas elemento){ //nuevo
        try {
            
         
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into venta(tipo_comprobante,serie_comprobante,num_comprobante,fecha_hora,impuesto,total_venta,estado,idcliente,idusuario) values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, elemento.getTipo_comprobante());
            ps.setString(2, elemento.getSerie_comprobante());
            ps.setString(3, elemento.getNum_comprobante());
            ps.setString(4, elemento.getFecha_hora());
            ps.setDouble(5, elemento.getImpuesto());
            ps.setDouble(6, elemento.getTotalVenta());
            ps.setString(7,elemento.getEstado());
            ps.setInt(8, elemento.getId_Persona_Cliente());
            ps.setInt(9, elemento.getId_usuario());
            
       
            
            int rpta = ps.executeUpdate();
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Registro Exitoso");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al insertar"+e.getMessage());
        }
    }
    
    public static void Actualizar(ventas Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update venta set tipo_comprobante = ?, serie_comprobante = ?, num_comprobante= ?, fecha_hora= ?,impuesto= ?,total_venta= ?,estado= ?,idcliente = ?,idusuario=?  where idventa = ?");
            ps.setString(1, Elemento.getTipo_comprobante());
            ps.setString(2, Elemento.getSerie_comprobante());
            ps.setString(3, Elemento.getNum_comprobante());
            ps.setString(4, Elemento.getFecha_hora());
            ps.setDouble(5, Elemento.getImpuesto());
            ps.setDouble(6, Elemento.getTotalVenta());
            ps.setString(7, Elemento.getEstado());
            ps.setInt(8, Elemento.getId_Persona_Cliente());
            ps.setInt(9, Elemento.getId_usuario());
            ps.setInt(10,Elemento.getIdVentas());
            int rpta = ps.executeUpdate();
           
          
            
            if(rpta > 0){
                JOptionPane.showMessageDialog(null,"Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null,"No se pudo registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al actualizar"+e.getMessage());
        }
    }
    
    public static void Eliminar(ventas Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from venta where idventas = ?");
            ps.setInt(1, Elemento.getIdVentas());
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

     public static void ConsultarTodos(JTable control, Arreglo_ventasAR arreglo){
        String[] cabecera = {"idventa","tipo_comprobante","serie_comprobante","num_comprobante","fecha_hora","impuesto","total_venta","estado","tipo_persona","nombre"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);    
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                    "SELECT v.idventa, v.tipo_comprobante, v.serie_comprobante, v.num_comprobante, \n" +
"       v.fecha_hora, v.impuesto, v.total_venta, v.estado, \n" +
"       p.tipo_persona, p.idpersona, u.name, u.id \n" +
"FROM venta v, persona p, users u \n" +
"WHERE v.idcliente = p.idpersona AND v.idusuario = u.id \n" +
"ORDER BY v.idventa");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                  
                Object[] registro1 = {
                                    rs.getInt(1),
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getDouble(6),
                                    rs.getDouble(7),
                                    rs.getString(8), 
                                    rs.getString(9),
                                    rs.getString(11),
                                    
                };//el nombre
                modTabla.addRow(registro1);
                Object[] registro2 = {
                                    rs.getInt(1),
                                    rs.getInt(10),
                                    rs.getInt(12),
                                    rs.getString(2), 
                                    rs.getString(3), 
                                    rs.getString(4), 
                                    rs.getString(5), 
                                    rs.getDouble(6),
                                    rs.getDouble(7),
                                    rs.getString(8), 
                                    
                };//arreglo cursp
                arreglo.Agregar(new ventas(registro2));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar articulos: " + e.getMessage());
        }        
    }
    
    
    
    
    public static void ConsultarTodosCBN(JComboBox control, Arreglo_ventasNA arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from venta");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 //rs se usa para seleccionar el siguiente registro while mientras siga existiendo  un registro
                Object[] registro = {
                    
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),  
                    rs.getDouble(8),
                    rs.getDouble(9),
                    rs.getString(10)
                  };
                modCombo.addElement(rs.getInt(1));
                arreglo.Agregar(new ventas(registro));
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
            PreparedStatement ps = cn.prepareStatement("select count(*) from venta");
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
