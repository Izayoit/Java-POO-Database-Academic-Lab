package DAO;

import Conexión.ConectaDB;
import Modelo.Ingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class IngresoDAO {
    public ArrayList<Ingreso> ConsultarTodos() {
        ArrayList<Ingreso> lista = new ArrayList<>();
        String sql = "SELECT * FROM ingreso";
        try (Connection cn = ConectaDB.ObtenerConexion();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Ingreso ingreso = new Ingreso();
                ingreso.setIdIngreso(rs.getInt("idingreso"));
                ingreso.setIdProveedor(rs.getInt("idproveedor"));
                ingreso.setTipoComprobante(rs.getString("tipo_comprobante"));
                ingreso.setSerieComprobante(rs.getString("serie_comprobante"));
                ingreso.setNumComprobante(rs.getString("num_comprobante"));
                ingreso.setFechaHora(rs.getString("fecha_hora"));
                ingreso.setImpuesto(rs.getDouble("impuesto"));
                ingreso.setEstado(rs.getString("estado"));
                lista.add(ingreso);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<Ingreso> ConsultarPorCriterio(String criterio, String valor) {
        ArrayList<Ingreso> lista = new ArrayList<>();
        String sql = "SELECT * FROM ingreso WHERE " + criterio + " LIKE ?";
        try (Connection cn = ConectaDB.ObtenerConexion();
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, "%" + valor + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Ingreso ingreso = new Ingreso();
                    ingreso.setIdIngreso(rs.getInt("idingreso"));
                    ingreso.setIdProveedor(rs.getInt("idproveedor"));
                    ingreso.setTipoComprobante(rs.getString("tipo_comprobante"));
                    ingreso.setSerieComprobante(rs.getString("serie_comprobante"));
                    ingreso.setNumComprobante(rs.getString("num_comprobante"));
                    ingreso.setFechaHora(rs.getString("fecha_hora"));
                    ingreso.setImpuesto(rs.getDouble("impuesto"));
                    ingreso.setEstado(rs.getString("estado"));
                    lista.add(ingreso);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    
    
}
