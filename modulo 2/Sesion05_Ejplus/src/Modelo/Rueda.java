package Modelo;

public class Rueda {
    //Atributos
    private double peso;
    private String color;
    private String marca;
    //Constructor
    public Rueda() {
    }
    public Rueda(double peso, String color, String marca) {
        this.peso = peso;
        this.color = color;
        this.marca = marca;
    }
    public Rueda(Object[] registro) {
        peso = (double)registro[0];
        color = registro[1].toString();
        marca = registro[2].toString();
    }
    //Metodos

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
