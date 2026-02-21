
package modelo_reportes;

    public class consulta_compras {
    
 private int id_detalle_compra;
private int cantidad;
private double precio_compra;
private double precio_venta;
private int idingreso;
private int idarticulo;

      public consulta_compras() {
    }
   public consulta_compras(Object[] Registro){
        id_detalle_compra= Integer.parseInt(Registro[0].toString());
        cantidad= Integer.parseInt(Registro[1].toString());
        precio_compra= Double.parseDouble(Registro[2].toString());
        precio_venta = Double.parseDouble(Registro[3].toString());
        idingreso = Integer.parseInt(Registro[4].toString());
        idarticulo = Integer.parseInt(Registro[5].toString());
        
       
       
    }
    
    public Object[] getRegistro(){
        return new Object[]{id_detalle_compra,cantidad,precio_compra,precio_venta,idingreso,idarticulo};
    }

    public int getIdingreso() {
        return idingreso;
    }

    public void setIdingreso(int idingreso) {
        this.idingreso = idingreso;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public int getId_detalle_compra() {
        return id_detalle_compra;
    }

    public void setId_detalle_compra(int id_detalle_compra) {
        this.id_detalle_compra = id_detalle_compra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    
}
