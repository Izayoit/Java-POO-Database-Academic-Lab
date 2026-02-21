package DAO;

import Conexión.ConectaDB;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VentaDAO {

    public ArrayList<Venta> ConsultarTodos() {
        ArrayList<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta";
        try (Connection cn = ConectaDB.ObtenerConexion();
             PreparedStatement pst = cn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idventa"));
                venta.setIdCliente(rs.getInt("idcliente"));
                venta.setIdUsuario(rs.getInt("idusuario"));
                venta.setTipoComprobante(rs.getString("tipo_comprobante"));
                venta.setSerieComprobante(rs.getString("serie_comprobante"));
                venta.setNumComprobante(rs.getString("num_comprobante"));
                venta.setFechaHora(rs.getString("fecha_hora"));
                venta.setImpuesto(rs.getDouble("impuesto"));
                venta.setTotalVenta(rs.getDouble("total_venta"));
                venta.setEstado(rs.getString("estado"));
                lista.add(venta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Venta> ConsultarPorCriterio(String criterio, String valor) {
        ArrayList<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE " + criterio + " LIKE ?";
        try (Connection cn = ConectaDB.ObtenerConexion();
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, "%" + valor + "%");
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Venta venta = new Venta();
                    venta.setIdVenta(rs.getInt("idventa"));
                    venta.setIdCliente(rs.getInt("idcliente"));
                    venta.setIdUsuario(rs.getInt("idusuario"));
                    venta.setTipoComprobante(rs.getString("tipo_comprobante"));
                    venta.setSerieComprobante(rs.getString("serie_comprobante"));
                    venta.setNumComprobante(rs.getString("num_comprobante"));
                    venta.setFechaHora(rs.getString("fecha_hora"));
                    venta.setImpuesto(rs.getDouble("impuesto"));
                    venta.setTotalVenta(rs.getDouble("total_venta"));
                    venta.setEstado(rs.getString("estado"));
                    lista.add(venta);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
