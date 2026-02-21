package Modelo;

public class EmpleadoVendedor extends Empleado{
    private double tasa_comision;
    private double monto_vendido;

    public EmpleadoVendedor( String nombres, String apellidos, String dni) {
        super( nombres, apellidos, dni);
    }

    public EmpleadoVendedor(  String nombres, String apellidos, String dni,double tasa_comision, double monto_vendido) {
        super( nombres, apellidos, dni);
        this.tasa_comision = tasa_comision;
        this.monto_vendido = monto_vendido;
    }

    

   

@Override
    public double Ingresos() {
        return getMonto_vendido()*getTasa_comision();
    }

    @Override
    public double Bonificaciones() {
       if(getMonto_vendido()<1000){
       return 0;
       }else if(getMonto_vendido()<5000){
       return Ingresos()*0.05;
       }else{
       return  Ingresos()*0.10;
       }
    }

    @Override
    public double Descuento() {
    if(Ingresos()<1000){
    return Ingresos()*0.11;
    }else{
    return Ingresos()*0.15;
    }
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

   
}
