
package modelo;


public class ControlPeaje {
     private String ubicacion;
    private String tipoVehiculo;
   private double tarifa;
  private double distancia;
    public ControlPeaje(String ubicacion, String tipoVehiculo) {
        this.ubicacion = ubicacion;
        this.tipoVehiculo = tipoVehiculo;
        
    }

    public ControlPeaje(double tarifa, double distancia) {
        this.tarifa = tarifa;
        this.distancia = distancia;
        
    }
      public void registrarPeaje(){
          System.out.println("Peaje registrado en: " + ubicacion + ", tipo de vehiculo: " + getTipoVehiculo() );
      }
       public void registrarPeaje(double distancia){
          System.out.println(" tarifa: " + getTarifa() +  " distancia :"+ getDistancia()+"km");
      }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }      

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
          
          
         
      

}
    
  
        
   
     
     
    
    
   
   
    
    











































    
    
   
    
    

