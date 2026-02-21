package Modelo;


public abstract class Empleado {
    
    private String nombre;
    private String apellidos;
    private double sueldo;

    public Empleado(String nombre, String apellidos, double sueldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
   
    
    public abstract String MostrarInfo();
    
    
}
