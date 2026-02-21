
package modelo_reportes;

public class consulta_ventas{
private int id_detalle_venta;
private int cantidad;
private double precio_venta;
private double descuento;
private int idventa;
private int idarticulo;

    public consulta_ventas() {
    }
   public consulta_ventas(Object[] Registro){
        id_detalle_venta= Integer.parseInt(Registro[0].toString());
        cantidad= Integer.parseInt(Registro[1].toString());
        precio_venta= Double.parseDouble(Registro[2].toString());
        descuento = Double.parseDouble(Registro[3].toString());
        idventa = Integer.parseInt(Registro[4].toString());
        idarticulo = Integer.parseInt(Registro[5].toString());
       
    }
    
    public Object[] getRegistro(){
        return new Object[]{id_detalle_venta,cantidad,precio_venta,descuento,idventa,idarticulo};
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
  

   
    
    
}
