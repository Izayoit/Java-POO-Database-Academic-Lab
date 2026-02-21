package Modelo;

public class Rueda {
    //Atributos
    private double peso ;
    private String color ;
    private String marca;
    
    //Constructor
    
    //Metodos

    public Rueda() {
    }

    public Rueda(double peso, String color, String marca) {
        this.peso = peso;
        this.color = color;
        this.marca = marca;
    }
    public Rueda (Object[] arreglo){
    
    peso = (double)arreglo[0];
    color = (String)arreglo[1];
    marca = arreglo[2].toString();
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
