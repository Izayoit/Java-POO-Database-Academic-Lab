
package modelo;


public class auto extends vehiculo{
    private static final double TARIFA_PEAJE =5.0;
    
    public auto(String placa){
    super(placa, "auto");
    
    }
    @Override
    public double calcularpasaje(){
    return TARIFA_PEAJE;
    
    }
  
    
}
