
package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class NewClass {
   private String []nombre;
   private int[] dni;
   private int i =0;
    public NewClass() {
     nombre = new  String[5];
     dni = new  int[5];
    }
   public void listar(JTable control){
   String []cabezera = {"dni","nombre"};
       DefaultTableModel modTable = new DefaultTableModel(cabezera, 0);
       control.setModel(modTable);
       for (int pos = 0; pos < i; pos++) {
         String[] lista ={dni[pos]+"",nombre[pos]};  
         modTable.addRow(lista);
       }
   
   }
    public void agregar(String nombrePlus,int dniPlus){
   if(RepetirDni(dniPlus)==-1){
    if(i<dni.length){
    nombre[i]=nombrePlus;
    dni[i]=dniPlus;
    i++;
    }else{JOptionPane.showMessageDialog(null, "se alcanzo el limite");}
   }else{JOptionPane.showMessageDialog(null, "se repite");}
        
    }
   public int RepetirDni(int dniPlus){
       for (int pos = 0; pos < i; pos++) {
         if(dni[pos]==dniPlus){
         return pos;
         }
       }
   return -1;
   }
   
   public void Guardar(String ARCHIVO) {
       try {
           FileWriter fw = new FileWriter(ARCHIVO);
           PrintWriter pw = new PrintWriter(fw);
           for (int pos = 0; pos < i; pos++) {
            String lista = dni[pos]+","+nombre[pos];
            pw.println(lista);
           }
           pw.close();
       } catch (IOException ex) {
           
       }
   
       
          
           
       }
   public void Cargar(String ARCHIVO){
       try {
           FileReader FR = new FileReader(ARCHIVO);
           BufferedReader BR = new BufferedReader(FR);
           String linea =null;
           while ((linea=BR.readLine())!=null) {
             String[]datos = linea.split(",");
             int dni = Integer.parseInt(datos[0]);
             String nombre = datos[1];
               agregar(nombre, dni);
           }
          
       } catch (IOException ex) {
           
       }
       
   }
   
   
   }

