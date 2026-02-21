package Modelo;

public class Arbol {
    //Atributos
    private String nombre;
    private String tipo;
    private int altura;
    //Constructor
    public Arbol() {
    }
    public Arbol(String nombre, String tipo, int altura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
    }

    public Arbol(String nombre) {
        this(nombre,"",0);
    }
    //Métodos

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }  
    
}
