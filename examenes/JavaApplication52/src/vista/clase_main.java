
package vista;

import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.aeropuerto;


public class clase_main {

   
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
      System.out.println("placa del avion");
      String placa = scanner.next();
        System.out.println("nombre del vuelo");
      String nombre = scanner.next();
        System.out.println("vuelos comprados adulos");
      int vuelosAdultos = scanner.nextInt();
        System.out.println("vuelos comprados niños");
      int vuelosNiños = scanner.nextInt();
        System.out.println("origen vuelo");
      String origen = scanner.next();
        System.out.println("destino vuelo");
      String lugar = scanner.next();
     
   aeropuerto objaeropuerto= new aeropuerto(placa, vuelosAdultos, vuelosNiños, lugar, origen, nombre);
            
   System.out.println(
                      objaeropuerto.informacion()+"\n"
                       +"total: "+ objaeropuerto.total()  +"\n"
   );
             

        
    }
    
}
