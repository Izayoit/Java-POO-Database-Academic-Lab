
package vista;

import java.util.Scanner;
import modelo.ControlPeaje;

public class NewMain {
    
     

   private static String ubicacion;
    private static String tipoVehiculo;
    private static double tarifa;
    private static double distancia;
    public static void main(String[] args) {
      
        ControlPeaje registro;
         
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba los datos");
        System.out.println("ubicacion");
           ubicacion = scanner.next();
        System.out.println("tipo de vehiculo");
        tipoVehiculo= scanner.next();
        System.out.println("tarifa");
        tarifa= scanner.nextDouble();
        System.out.println("distancia");
        distancia = scanner.nextDouble();
        
       registro = new  ControlPeaje(ubicacion, tipoVehiculo);
        registro.registrarPeaje();
        registro = new  ControlPeaje(tarifa, distancia);
        registro.registrarPeaje(distancia);
    }
       
        
    }
    

