
package Acceso;

import Control.Arreglo_Productos;
import Modelo.Producto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Gestor_Archivos {
   
    private static String nombre_Archivo="Producto.txt";
    public static void  Abrir_Archivo(Arreglo_Productos objProductos){
        try {
            FileReader FR = new FileReader(nombre_Archivo);
            BufferedReader BR = new BufferedReader(FR);
            String linea =null;
            while ((linea= BR.readLine())!=null) {                
                String[] datos = linea.split(",");
                int codigo = Integer.parseInt(datos[0]);
                String Descripcion = datos[1];
                double precio = Double.parseDouble(datos[2]);
                objProductos.Registrar(codigo, Descripcion, precio);
                
            }
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "el archivo no existe");
        }catch(IOException e2){ 
        
        }
    }
    
    
     public static void  Guardar_Archivo(Arreglo_Productos objProductos){
        try {
            FileWriter FW = new FileWriter(nombre_Archivo);
            PrintWriter PW = new PrintWriter(FW);
            Producto[] arreglo = objProductos.getArreglo();
            for (int pos = 0; pos < objProductos.getI(); pos++) {
                PW.println(arreglo[pos].getCadena()) ;
                
            }
                PW.close();
                FW.close();
            
        }catch(IOException e2){
        
        }
         
    }
    
    
}
