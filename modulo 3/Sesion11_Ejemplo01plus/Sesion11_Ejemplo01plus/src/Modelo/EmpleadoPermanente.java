package Modelo;

public class EmpleadoPermanente extends Empleado{

    private double sueldo_base;
    private String afiliacion;
    
    public EmpleadoPermanente(String dni, String nombres, String apellidos) {
        super(dni, nombres, apellidos);
    }

    public EmpleadoPermanente(String dni, String nombres, String apellidos, double sueldo_base, String afiliacion) {
        super(dni, nombres, apellidos);
        this.sueldo_base = sueldo_base;
        this.afiliacion = afiliacion;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public double Ingresos() {
        return getSueldo_base();
    }

    @Override
    public double Bonificaciones() {
        return 0;
    }

    @Override
    public double Descuentos() {
        if (getAfiliacion().equals("AFP")) {
            return getSueldo_base() * 0.15;
        } else {
            return getSueldo_base() * 0.11;
        }
    }
    
    
    
}
