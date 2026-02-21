package Modelo;

import java.text.DecimalFormat;

public abstract class Empleado {
    private String dni;
    private String nombres;
    private String apellidos;
    
    public Empleado(String dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    //public abstract Object[] getRegistro();
    public Object[] getRegistro() {
        return new Object[]{dni, nombres, apellidos};
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String MostrarInfo() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nNombres \t\t: " + getNombres() + 
               "\nApellidos \t\t: " + getApellidos() +
               "\nDNI \t\t: " + getDni() +
               "\nIngresos \t\t: " + df.format(Ingresos()) +
               "\nBonificaciones \t\t: " + df.format(Bonificaciones()) +
               "\nDescuentos \t\t: " + df.format(Descuentos());
    }
    
    public abstract double Ingresos();
    public abstract double Bonificaciones();
    public abstract double Descuentos();
    
    public double Sueldo_Neto() {
        return Ingresos() * Bonificaciones() - Descuentos();
    }
}
