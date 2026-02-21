
package modelo;

import javax.swing.JOptionPane;


public class camion extends vehiculo{

    private final int ejes;
 private static final double TARIFA_PEAJE =10.0;
    public camion(String placa ,int ejes) {
        super(placa, "camion");
        this.ejes = ejes;
    }
    
    @Override
   public double calcularpasaje(){
       return ejes*TARIFA_PEAJE;
   
   }
    @Override
   public void mostrarInformacion(){
   super.mostrarInformacion();
        System.out.println("ejes:"+ ejes);
       
   
   
   }
    
    
    
    
    
    
}
