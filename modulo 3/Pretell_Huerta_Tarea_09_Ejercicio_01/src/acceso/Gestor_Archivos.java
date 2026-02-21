
package acceso;

import control.Arreglo_ventas;
import java.io.BufferedReader;

import java.io.FileReader;
import modelo.Ventas;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class Gestor_Archivos {
   
    
    private String Archivo ="Matricula.txt";
    public void guardar(Arreglo_ventas objArregloVentas){
        try {
            FileWriter FW = new FileWriter(Archivo);
            PrintWriter PW = new  PrintWriter(FW);
            Ventas[] Arreglo = objArregloVentas.getArreglo();
             for (int pos = 0; pos < objArregloVentas.getI(); pos++) {
                 PW.println(Arreglo[pos].getCadena());
       
        }
             PW.close();
             FW.close();
        }catch(IOException ex2){
        JOptionPane.showMessageDialog(null, "se guardaron los datos");
        
        }
        

        
    }
    
   
   
      public void Cargar(Arreglo_ventas objArregloVentas){
        try {
            FileReader FR = new FileReader(Archivo);
            BufferedReader BR = new  BufferedReader(FR);
            String linea = null;
            while ((linea = BR.readLine())!=null) {  
             String [] Datos = linea.split("%");
             String boleto = Datos[0];
             String origen = Datos[1];
             String destino = Datos[2];
            int precio = Integer.parseInt(Datos[3]);
             String pasajero = Datos[4];
             String asiento = Datos[5];
             String fecha = Datos[6];
             String turno = Datos[7];
             objArregloVentas.Registrar(boleto, origen, destino, precio, pasajero, asiento, fecha, turno);
                
            }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
        JOptionPane.showMessageDialog(null, "los archivos fueros eliminados");
        
        }
        
   
   
   
   
   }
    
        
      
        
    
 

    
    
    
}
