
package modelo;

public abstract class comida {
    private double precio;
    private String calorias ;
    private double peso;

    public comida(double precio, String calorias, double peso) {
        this.precio = precio;
        this.calorias = calorias;
        this.peso = peso;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getCalorias() {
        return calorias;
    }
    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public abstract String cocinar();
    
    public abstract String congelar();
    
    public abstract String comer();
     
    
}