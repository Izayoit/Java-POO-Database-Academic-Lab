package Modelo;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = 0;
    }
     public Producto(String codigo, String nombre, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Stock: " + stock;
    }
}