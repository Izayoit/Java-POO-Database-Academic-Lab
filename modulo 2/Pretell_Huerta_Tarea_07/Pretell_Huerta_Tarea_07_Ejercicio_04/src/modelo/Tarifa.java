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

public class Tarifa {

    private Object[][] Lista_tarifas;
    private int i = 0;

    public Tarifa() {
        Lista_tarifas = new Object[50][7];
    }

    public void Listar(JTable control) {
        String[] cabecera = {"codigo", "origen", "destino", "tiempo viaje", "tipo asiento", "tarifa", "asient.disponibles"};
        DefaultTableModel ModTable = new DefaultTableModel(cabecera, 0);
        control.setModel(ModTable);
        for (int pos = 0; pos < i; pos++) {
            ModTable.addRow(Lista_tarifas[pos]);
        }
    }
public void OcuparAsiento(int pos) {
       Lista_tarifas[pos][6] = (int)Lista_tarifas[pos][6] - 1;
    }
       public void DesocuparAsiento(int pos) {
       Lista_tarifas[pos][6] = (int)Lista_tarifas[pos][6] + 1;
    }
    public void Agregar(int codigo, String origen, String ciudadDes, int TiempoViaje, String TipoAsiento, int tarifa, int asientos) {

        if (buscar(origen, ciudadDes, TipoAsiento) == -1) {
            
            if (i < Lista_tarifas.length) {
                Lista_tarifas[i][0] = codigo;
                Lista_tarifas[i][1] = origen;
                Lista_tarifas[i][2] = ciudadDes;
                Lista_tarifas[i][3] = TiempoViaje;
                Lista_tarifas[i][4] = TipoAsiento;
                Lista_tarifas[i][5] = tarifa;
                Lista_tarifas[i][6] = asientos;
                i++;
              
            } else {
                JOptionPane.showMessageDialog(null, "se paso del limite");
            }

        } else {
            JOptionPane.showMessageDialog(null, "ya existe uno con un mismo origen, ciudad y asiento");
        }
    }

    public int buscar(String origen, String ciudadDes, String TipoAsiento) {
        for (int pos = 0; pos < i; pos++) {

            if (Lista_tarifas[pos][1].equals(origen)
                    && Lista_tarifas[pos][2].equals(ciudadDes)
                    && Lista_tarifas[pos][4].equals(TipoAsiento)) {
                return pos;
            }
        }
        return -1;

    }
     public Object[] getDatosInPos(int pos) {
        Object datos[] = new Object[7];
        datos[0] = Lista_tarifas[pos][0];
        datos[1] =Lista_tarifas[pos][1];
        datos[2] = Lista_tarifas[pos][2];
        datos[3] = Lista_tarifas[pos][3];
        datos[4] = Lista_tarifas[pos][4];
        datos[5] = Lista_tarifas[pos][5];
        datos[6] = Lista_tarifas[pos][6];
        return datos;
    }

    public void Eliminar(int pos) {
        
            for (int j = pos; j < i - 1; j++) {
              
                Lista_tarifas[j] = Lista_tarifas[j + 1];
                  JOptionPane.showMessageDialog(null, "se realizo el eliminadao exitosamente");
            }
            i--;

    }
     

    public void Editar(int codigo, String origen, String ciudadDes, int TiempoViaje, String TipoAsiento, int tarifa, int asientos) {
        int pos = buscar(origen, ciudadDes, TipoAsiento);
       
        if (pos != -1) {
            Lista_tarifas[pos][1]= codigo;
            Lista_tarifas[pos][3] = TiempoViaje;
            Lista_tarifas[pos][5] = tarifa;
            Lista_tarifas[pos][6] = asientos;
              
            JOptionPane.showMessageDialog(null, "se a realizado cambios exitosamente");

        } else {
            JOptionPane.showMessageDialog(null, "no se encontro nada");
        }

    
  
   }
   public void Guardar(String ARCHIVO){
       
        try {FileWriter objFileWriter = new FileWriter(ARCHIVO); 
               PrintWriter objWriter = new  PrintWriter(objFileWriter);
               for (int pos = 0; pos < i; pos++) {
                String[] datos = new String[7];
                for (int j = 0; j < 7; j++) {
                    datos[j] = Lista_tarifas[pos][j] + "";
                }
                String linea = String.join(",", datos);
                objWriter.println(linea);
            }
               objWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
        }
      
       
       
   
   }
   public void cargar(String ARCHIVO_tarifa){
      
        try { FileReader objfileReader = new FileReader(ARCHIVO_tarifa);
             BufferedReader objBuff =new BufferedReader(objfileReader);
             String linea =null;
             while ((linea=objBuff.readLine())!=null) {                
                 String[] datos = linea.split(",");

                int codigo = Integer.parseInt(datos[0]); // codigo de la tarifa
                String origen = datos[1]; // ciudad de origen
                String destino = datos[2]; // ciudad de destino
                int tiempo = Integer.parseInt(datos[3]); // tiempo de viaje
                String tipoAsiento = datos[4]; // económico, turista, ejecutivo
                int tarifa = Integer.parseInt(datos[5]); // costo
                int asientos = Integer.parseInt(datos[6]);

                Agregar(codigo, origen, destino, tiempo, tipoAsiento, tarifa, asientos);
            }
             
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo: " + ex.getMessage());
        }
       
   
   
   
   }
}
