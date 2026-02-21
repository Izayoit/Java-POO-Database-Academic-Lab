package Modelo;

import java.text.DecimalFormat;

public class Administrativo extends Empleado {
    
    private String jefatura;
    private String cargo;

    public Administrativo(String jefatura, String cargo, String nombre, String apellidos, double sueldo) {
        super(nombre, apellidos, sueldo);
        this.jefatura = jefatura;
        this.cargo = cargo;
    }

    public String getJefatura() {
        return jefatura;
    }

    public void setJefatura(String jefatura) {
        this.jefatura = jefatura;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String MostrarInfo() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nNombres \t\t: " + getNombre()+ 
               "\nApellidos \t\t: " + getApellidos() +
               "\nSueldo \t\t: " + df.format(getSueldo()) +
               "\nJefatura \t\t: " + jefatura +
               "\nCargo \t\t: " + cargo;
    }
    
}
