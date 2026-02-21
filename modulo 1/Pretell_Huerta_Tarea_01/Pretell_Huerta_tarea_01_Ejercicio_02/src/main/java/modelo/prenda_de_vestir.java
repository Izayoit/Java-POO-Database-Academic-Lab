
package modelo;


public class prenda_de_vestir {
    String tipo;
    String color;
    int precio;
    String marca;

    public prenda_de_vestir(String tipo, String color, int precio, String marca) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
