
package Modelo;


public class Libro {
     int codigo;
  String titulo;
  double precio;
    int stock;

    public Libro() {
    }

    public Libro(int codigo, String titulo, double precio, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
