
package Modelo;

public  class Compra {
    private int idcompra;
    private int idproveedor;
    private String tipocomprobamteC;
     private String serio_comprobanteC;
    private String num_comprovanteC;
    private String fechaC;
    private double impuestoC;
    private double total_ventaC;
    private String estadoC;

    public Compra() {
    }
    
    public Object[] getRegistro(){
    return new Object[]{idcompra, idproveedor, tipocomprobamteC, serio_comprobanteC, num_comprovanteC, fechaC, impuestoC, total_ventaC, estadoC};
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getTipocomprobamteC() {
        return tipocomprobamteC;
    }

    public void setTipocomprobamteC(String tipocomprobamteC) {
        this.tipocomprobamteC = tipocomprobamteC;
    }

    public String getSerio_comprobanteC() {
        return serio_comprobanteC;
    }

    public void setSerio_comprobanteC(String serio_comprobanteC) {
        this.serio_comprobanteC = serio_comprobanteC;
    }

    public String getNum_comprovanteC() {
        return num_comprovanteC;
    }

    public void setNum_comprovanteC(String num_comprovanteC) {
        this.num_comprovanteC = num_comprovanteC;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    public double getImpuestoC() {
        return impuestoC;
    }

    public void setImpuestoC(double impuestoC) {
        this.impuestoC = impuestoC;
    }

    public double getTotal_ventaC() {
        return total_ventaC;
    }

    public void setTotal_ventaC(double total_ventaC) {
        this.total_ventaC = total_ventaC;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }
    
    
}
