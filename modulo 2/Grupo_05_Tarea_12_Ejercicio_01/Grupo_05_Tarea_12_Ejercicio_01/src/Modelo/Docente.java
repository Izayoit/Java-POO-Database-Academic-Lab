package Modelo;

import java.text.DecimalFormat;

public class Docente extends Empleado {
    
    private String categoria;
    private int numero_horas;

    public Docente(String categoria, int numero_horas, String nombre, String apellidos, double sueldo) {
        super(nombre, apellidos, sueldo);
        this.categoria = categoria;
        this.numero_horas = numero_horas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }
    
    @Override
    public String MostrarInfo() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nNombres \t\t: " + getNombre()+ 
               "\nApellidos \t\t: " + getApellidos() +
               "\nSueldo \t\t: " + df.format(getSueldo()) +
               "\nCategoría \t\t: " + categoria +
               "\nNúm. Horas \t\t: " + numero_horas;
    }
}
