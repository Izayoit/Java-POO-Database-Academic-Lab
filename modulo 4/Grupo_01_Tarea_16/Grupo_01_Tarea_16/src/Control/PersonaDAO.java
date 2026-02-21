package Control;

import AccesoDB.ConectaDB;
import Control.Arreglo_personaAR;
import Modelo_mantenimiento.persona;
import com.mysql.cj.protocol.ResultsetRowsOwner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PersonaDAO {

    public static void Insertar(persona elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("insert into persona(tipo_persona,nombre ,tipo_documento, num_documento,direccion, telefono ,email) values (?,?,?,?,?,?,?)");
            ps.setString(1, elemento.getTipo_persona());
            ps.setString(2, elemento.getNombre());
            ps.setString(3, elemento.getTipo_documento());
            ps.setInt(4, elemento.getNum_documento());
            ps.setString(5, elemento.getDireccion());
            ps.setInt(6, elemento.getTelefono());
            ps.setString(7, elemento.getEmail());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Registro Fallido");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se a insertado" + e.getMessage());
        }
    }

    public static void Actualizar(persona elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("update persona set tipo_persona =?,nombre =?, tipo_documento = ?, num_documento = ?,direccion=?, telefono=? ,email=? where idpersona = ?");
            ps.setString(1, elemento.getTipo_persona());
            ps.setString(2, elemento.getNombre());
            ps.setString(3, elemento.getTipo_documento());
            ps.setInt(4, elemento.getNum_documento());
            ps.setString(5, elemento.getDireccion());
            ps.setInt(6, elemento.getTelefono());
            ps.setString(7, elemento.getEmail());
            ps.setInt(8, elemento.getIdpersona());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actaulizar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se actualizado" + e.getMessage());
        }
    }

    public static void Eliminar(persona elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("delete from persona where idpersona = ?");
            ps.setInt(1, elemento.getIdpersona());
            int rpta = ps.executeUpdate();
            if (rpta > 0) {
                JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en actualizar" + e.getMessage());
        }
    }

    public static void ConsultarTodos(JTable control, Arreglo_personaAR arreglo) {
        String[] cabecera = {"Id", "Persona", "Nombre", "Documento", "Numero de Doc", "Direccion", "Telefono", "Email"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select p.idpersona, p.tipo_persona, p.nombre, p.tipo_documento, p.num_documento , p.direccion , p.telefono , p.email" + " from persona p");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] registro1 = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8)};
                modTabla.addRow(registro1);
                Object[] registro2 = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getString(8)};
                arreglo.Agregar(new persona(registro2));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se a consultado" + e.getMessage());
        }

    }
    
     public static void ConsultarTodosCBN(JComboBox control, Arreglo_PersonaNA arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select * from persona");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 //rs se usa para seleccionar el siguiente registro while mientras siga existiendo  un registro
                Object[] registro = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getString(8)};
                modCombo.addElement(rs.getString(2));
                arreglo.Agregar(new persona(registro));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar categorias: "+e.getMessage());
        }        
    }
    
    
     
     public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement("select count(*) from persona");
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
