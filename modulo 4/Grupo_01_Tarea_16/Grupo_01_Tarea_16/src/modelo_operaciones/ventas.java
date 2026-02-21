
package modelo_operaciones;

import java.sql.Timestamp;


public  class  ventas {
    private int idVentas; 
    private int id_Persona_Cliente;
    private int id_usuario;
    private String tipo_comprobante; //boleta, factura
    private String serie_comprobante; //0000001
    private String num_comprobante;//0000000001,0000000002,000000003..
    private String fecha_hora;
    private double impuesto =0.18;
    private double totalVenta;
    private String estado; //registrado,pagado,nulo.
    
  
   

    public ventas() {
    }
       
    public ventas(Object[] Registro){
        idVentas= Integer.parseInt(Registro[0].toString());
      
         id_Persona_Cliente = Integer.parseInt(Registro[1].toString());
        id_usuario = Integer.parseInt(Registro[2].toString());
        
        tipo_comprobante= Registro[3].toString();
        serie_comprobante= Registro[4].toString();
        num_comprobante = Registro[5].toString();
        fecha_hora =Registro[6].toString();
        impuesto = Double.parseDouble(Registro[7].toString());
        totalVenta= Double.parseDouble(Registro[8].toString());
        estado = Registro[9].toString();

        
        
    }
    
    public Object[] getRegistro(){
        return new Object[]{idVentas,tipo_comprobante,serie_comprobante,num_comprobante,fecha_hora,impuesto,totalVenta,estado,id_Persona_Cliente,id_usuario};
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getSerie_comprobante() {
        return serie_comprobante;
    }

    public void setSerie_comprobante(String serie_comprobante) {
        this.serie_comprobante = serie_comprobante;
    }

    public String getNum_comprobante() {
        return num_comprobante;
    }

    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_Persona_Cliente() {
        return id_Persona_Cliente;
    }

    public void setId_Persona_Cliente(int id_Persona_Cliente) {
        this.id_Persona_Cliente = id_Persona_Cliente;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    
 
}
