package Modelo;

import java.text.DecimalFormat;

public abstract class Empleado {

    private String nombres;
    private String apellidos;
    private String dni;

    public Empleado(String nombres, String apellidos, String dni) {

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Object[] getRegistro() {
        return new Object[]{dni, nombres, apellidos};
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String MostrarInfo() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nNombres \t\t: " + getNombres()
                + "\nApellidos \t\t: " + getApellidos()
                + "\nDNI \t\t: " + getDni()
                + "\nIngresos \t\t: " + df.format(Ingresos())
                + "\nBonificaciones\t\t: " + df.format(Bonificaciones())
                + "\nDescuento\t\t: " + df.format(Descuento());
    }

    public abstract double Ingresos();

    public abstract double Bonificaciones();

    public abstract double Descuento();

    public double Sueldo_Neto() {

        return Ingresos() + Bonificaciones() - Descuento();
    }
}
