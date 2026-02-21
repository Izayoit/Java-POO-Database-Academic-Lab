

package Modelo;


public class Venta {
      private int idventa;
    private int idcliente;
    private int idusuario;
    private String tipo_comprobanteV;
    private String serio_comprobanteV;
    private String num_comprovanteV;
    private String fechaV;
    private double impuestoV;
    private double total_ventaV;
    private String estadoV;
    
    public Venta(){
    
    }
    
     public Venta(Object[] Registro){
       idventa = Integer.parseInt(Registro[0].toString());
        idcliente = Integer.parseInt(Registro[1].toString());
        idusuario = Integer.parseInt(Registro[2].toString());
        tipo_comprobanteV = Registro[3].toString();
        serio_comprobanteV= Registro[4].toString();
        num_comprovanteV = Registro[5].toString();
        fechaV = Registro[6].toString();
        impuestoV = Double.parseDouble(Registro[7].toString());
        total_ventaV = Double.parseDouble(Registro[8].toString());
        estadoV = Registro[9].toString();
        
    }
    public Object[] getRegistro(){
        return new Object[]{idventa,idcliente,idusuario,tipo_comprobanteV,serio_comprobanteV,num_comprovanteV,fechaV,impuestoV,total_ventaV,estadoV};
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getTipo_comprobanteV() {
        return tipo_comprobanteV;
    }

    public void setTipo_comprobanteV(String tipo_comprobanteV) {
        this.tipo_comprobanteV = tipo_comprobanteV;
    }

    public String getSerio_comprobanteV() {
        return serio_comprobanteV;
    }

    public void setSerio_comprobanteV(String serio_comprobanteV) {
        this.serio_comprobanteV = serio_comprobanteV;
    }

    public String getNum_comprovanteV() {
        return num_comprovanteV;
    }

    public void setNum_comprovanteV(String num_comprovanteV) {
        this.num_comprovanteV = num_comprovanteV;
    }

    public String getFechaV() {
        return fechaV;
    }

    public void setFechaV(String fechaV) {
        this.fechaV = fechaV;
    }

    public double getImpuestoV() {
        return impuestoV;
    }

    public void setImpuestoV(double impuestoV) {
        this.impuestoV = impuestoV;
    }

    public double getTotal_ventaV() {
        return total_ventaV;
    }

    public void setTotal_ventaV(double total_ventaV) {
        this.total_ventaV = total_ventaV;
    }

    public String getEstadoV() {
        return estadoV;
    }

    public void setEstadoV(String estadoV) {
        this.estadoV = estadoV;
    }
    
}
