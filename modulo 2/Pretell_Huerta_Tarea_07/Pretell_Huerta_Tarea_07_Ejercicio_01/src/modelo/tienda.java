
package modelo;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class tienda {
  private int[] codigo;
  private double[] precio;
  private int i=0;
  public tienda(){
  codigo= new int[15];
  precio = new  double[15];
  }
  
  
  public void Listar(JTable control){
  String[]cabezera ={"codigo", "precio"};
      DefaultTableModel ModTable = new DefaultTableModel(cabezera, 0);
  control.setModel(ModTable);

      for (int pos = 0; pos < i; pos++) {
     String [] lista ={codigo[pos]+"",precio[pos]+""}; 
     ModTable.addRow(lista);
          
      }
  
  }
  public void agregar(int a,double b){
    if(buscarCodigo(a)==-1){
      if(i<codigo.length){
    codigo[i]= a;
    precio[i]=b;
    i++;
    }else{JOptionPane.showMessageDialog(null, "se execedio");}
      
  }else{JOptionPane.showMessageDialog(null, "se repite");}
  }
  public int buscarCodigo(int CodeBuscar){
      for (int pos = 0; pos < i; pos++) {
          if(codigo[pos]== CodeBuscar){
          return pos;
          }
      }
      return -1;
  } 
  
  public int CodigoMayorPrecio(){
  if(i==0){
  JOptionPane.showMessageDialog(null, "la lista esta vacio");
  }
  int CodigoMayor = (int)codigo[0];
  double PrecioMayor = (double)precio[0];
      for (int pos = 1; pos < i; pos++) {
          if((double)precio[pos]>PrecioMayor){
            CodigoMayor = (int)codigo[pos];
          }
          
          
      }
  return CodigoMayor;
  
  }
  
  
  
  
  
   /*
      public int codigoMayorPrecio() {
    if (i == 0) {
        JOptionPane.showMessageDialog(null, "No hay productos registrados.");
        return -1;
    }

    int codigoMayor = (int) codigo[0];
    double mayorPrecio = (double) precio[0];

    for (int pos = 1; pos < i; pos++) {
        if ((double) precio[pos] > mayorPrecio) {
           codigoMayor = (int) codigo[pos];
        }
    }
    return codigoMayor;
}   */  
      public int codigoMenorPrecio() {
    if (i == 0) {
        JOptionPane.showMessageDialog(null, "No hay productos registrados.");
        return -1;
    }

    int codigoMayor = (int) codigo[0];
    double menorPrecio = (double) precio[0];

    for (int pos = 1; pos < i; pos++) {
        if ((double) precio[pos] < menorPrecio) {
           codigoMayor  = (int) codigo[pos];
          
        }
    }
    return codigoMayor;
}        
   public void Guardar(String NombreArchivo){
      try {
          FileWriter objFileWriter = new FileWriter(NombreArchivo);
          PrintWriter objPrintWriter = new PrintWriter(objFileWriter);
          for (int pos = 0; pos < i; pos++) {
              String Linea = codigo[pos] + "," +precio[pos];
              objPrintWriter.println(Linea);
          }
          objPrintWriter.close();
      } catch (IOException ex) {
         JOptionPane.showMessageDialog(null, "se guardo exitosamente");
      }
   
   
   }      
   public void Registrar(String NombreArchivo){
      try {
          FileReader objFileReader = new FileReader(NombreArchivo);
          BufferedReader objBufferedReader = new BufferedReader(objFileReader);
          String Linea=null;
          while ((Linea=objBufferedReader.readLine())!=null) {              
           
           String[] datos =Linea.split(",");
           int codigo = Integer.parseInt(datos[0]);
           double precio = Double.parseDouble(datos[1]);
           agregar(codigo, precio);
          }
          
      } catch (IOException ex) {
          JOptionPane.showMessageDialog(null, "error");
      } 
   
   
   }
          
          
}         
          
          
          
          
          
          
          
          
          
          
          



