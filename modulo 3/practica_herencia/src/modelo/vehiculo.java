
package modelo;

import javax.swing.JOptionPane;


public class vehiculo {
    protected String placa;
    protected String tipo;

    public vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }
    public double calcularpasaje(){
    return 0.0;
    }
    
    public void mostrarInformacion(){
        System.out.println("placa: "+ placa);
        System.out.println("tipo: "+tipo);
  
           
    
    
    }
    

}
