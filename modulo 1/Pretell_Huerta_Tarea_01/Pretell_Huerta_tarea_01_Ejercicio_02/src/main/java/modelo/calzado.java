
package modelo;

public class calzado {
    String color;
    int talla;
    String tipo;
    int precio;
    String marca;

    public calzado(String color, int talla, String tipo, int precio, String marca) {
        this.color = color;
        this.talla = talla;
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
