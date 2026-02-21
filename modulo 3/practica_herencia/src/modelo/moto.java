
package modelo;


public class moto extends vehiculo{
    public static final double TARIFA_PEAJE=2.5;
    public moto(String placa) {
        super(placa, "moto");
    }
    @Override
    public double calcularpasaje(){
    
    return TARIFA_PEAJE;
    }
    
    
    
}
