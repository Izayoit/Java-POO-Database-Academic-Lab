      
package modelo_operaciones;

import java.sql.Timestamp;
import java.util.Date;


public class compras {
    
    
    private int idIngreso;

    private String tipoComprobante;
    private String serieComprobante;
    private String numComprobante;
    private String fechaHora;
    private double impuesto;
    private String estado;
    public String getTipo_persona;   
    private int idProveedor;

    public compras() {}
public compras(Object[] Registro) {
        idIngreso = Integer.parseInt(Registro[0].toString());
        idProveedor = Integer.parseInt(Registro[1].toString());
        tipoComprobante = Registro[2].toString();
        serieComprobante = Registro[3].toString();
        numComprobante = Registro[4].toString();
        fechaHora =Registro[5].toString();
        impuesto = Double.parseDouble(Registro[6].toString());
        estado = Registro[7].toString();
        
    }

    public Object[] getRegistro() {
        return new Object[]{idProveedor, tipoComprobante, serieComprobante, numComprobante,fechaHora,impuesto,estado};
    }
    public compras(int idIngreso, int idProveedor, String tipoComprobante, 
                  String serieComprobante, String numComprobante, 
                  String fechaHora, double impuesto, String estado) {
        this.idIngreso = idIngreso;
        this.idProveedor = idProveedor;
        this.tipoComprobante = tipoComprobante;
        this.serieComprobante = serieComprobante;
        this.numComprobante = numComprobante;
        this.fechaHora = fechaHora;
        this.impuesto = impuesto;
        this.estado = estado;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerieComprobante() {
        return serieComprobante;
    }

    public void setSerieComprobante(String serieComprobante) {
        this.serieComprobante = serieComprobante;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

   

   
    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
