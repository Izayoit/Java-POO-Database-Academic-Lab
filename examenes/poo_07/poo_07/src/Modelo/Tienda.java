package Modelo;

public class Tienda {
    private int codigoProducto;
    private int precioProducto;

    public Tienda(int codigoProducto, int precioProducto) {
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
    }
    
    public Object[] registro(){
        Object[] registrar = {codigoProducto, precioProducto};
        return registrar;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }
}
