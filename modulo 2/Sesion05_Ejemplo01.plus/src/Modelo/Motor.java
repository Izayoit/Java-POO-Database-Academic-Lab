package Modelo;

public class Motor {
    //atributos
    private String marca;
    private int  potencia;
    private double consumo;
    //Constructor
    
   

    public Motor() {
    }

    public Motor(String marca, int potencia, double consumo) {
        this.marca = marca;
        this.potencia = potencia;
        this.consumo = consumo;
    }
        public Motor(Object[] registro) {
            marca = registro [0].toString();
            potencia = (int)registro[1];
            consumo= (double)registro[2];
    }
    //Metodos

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    
    
}
