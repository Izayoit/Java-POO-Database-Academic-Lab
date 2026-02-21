
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class cliente {
    private Object[][] lista_cliente;
    private int i =0;
 private int numeroDePasaje = 1; 
    public cliente() {
        lista_cliente = new Object[50][7];
    }
   public void Listar(JTable control){
      String [] cabezera = {" pasaje" ,"origen" ,"Destino","Tiempo Viaje","Tipo asiento","tarifa","nombre"};
       DefaultTableModel modTable = new  DefaultTableModel(cabezera, 0); 
       control.setModel(modTable);
       for (int pos = 0; pos < i; pos++) {
           Object[] lista = lista_cliente[pos];
           modTable.addRow(lista);
       }
       
       
   }
    
    public void agregar(String NCorigen,String NCdestino,int tiempoViaje,String asiento, int tarifa, String pasajero,int numeroDepasaje){
       
   
          if(i<50){
          lista_cliente[i][0]= numeroDepasaje;
          lista_cliente[i][1]= NCorigen;
          lista_cliente[i][2]= NCdestino;
          lista_cliente[i][3]= tiempoViaje;
          lista_cliente[i][4]= asiento;
          lista_cliente[i][5]= tarifa;
          lista_cliente[i][6]= pasajero;
          i++;
          numeroDepasaje++;
          }else{
              JOptionPane.showMessageDialog(null, "se paso del limite");
          }
    
    }
    public void Eliminar(int pos){
        for (int j = pos; j < i-1; j++) {
            lista_cliente[pos]=lista_cliente[pos+1];
        }
        i--;
    
    
    }
    
   public void Guardar(String ARCHIVO) {
        try {
            FileWriter fw = new FileWriter(ARCHIVO);
            PrintWriter pw = new PrintWriter(fw);
            for (int pos = 0; pos < i; pos++) {
                String[] datos = new String[7];
                for (int j = 0; j < 7; j++) {
                    datos[j] = lista_cliente[pos][j] + "";
                }
                String linea = String.join(",", datos);
                pw.println(linea);
            }
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void Cargar(String ARCHIVO) {
        try {
            FileReader fr = new FileReader(ARCHIVO);
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
                String origen = datos[1];
                String destino = datos[2];
                double tiempo = Double.parseDouble(datos[3]);
                String tipoAsiento = datos[4];
                int tarifa = Integer.parseInt(datos[5]);
                String nombre = datos[6];
                agregar(origen, destino, tarifa, tipoAsiento, tarifa, destino, numeroDePasaje);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo: " + e.getMessage());
        }
    }
    
}
