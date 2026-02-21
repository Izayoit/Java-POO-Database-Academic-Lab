package Modelo;

public class EmpleadoVendedor extends Empleado {
    
    private double tasa_comision;
    private double monto_vendido;

    public EmpleadoVendedor(String dni, String nombres, String apellidos) {
        super(dni, nombres, apellidos);
    }

    public EmpleadoVendedor(String dni, String nombres, String apellidos, double tasa_comision, double monto_vendido) {
        super(dni, nombres, apellidos);
        this.tasa_comision = tasa_comision;
        this.monto_vendido = monto_vendido;
    }

    public double getTasa_comision() {
        return tasa_comision;
    }

    public void setTasa_comision(double tasa_comision) {
        this.tasa_comision = tasa_comision;
    }

    public double getMonto_vendido() {
        return monto_vendido;
    }

    public void setMonto_vendido(double monto_vendido) {
        this.monto_vendido = monto_vendido;
    }

    @Override
    public double Ingresos() {
        return getMonto_vendido() * getTasa_comision();
    }

    @Override
    public double Bonificaciones() {
        if (getMonto_vendido() < 1000) {
            return 0;
        } else if (getMonto_vendido() < 5000) {
            return Ingresos() * 0.05;
        } else {
            return Ingresos() * 0.10;
        }
    }

    @Override
    public double Descuentos() {
        if (getMonto_vendido() < 1000) {
            return Ingresos() * 0.11;
        } else {
            return Ingresos() * 0.15;
        }
    }
}