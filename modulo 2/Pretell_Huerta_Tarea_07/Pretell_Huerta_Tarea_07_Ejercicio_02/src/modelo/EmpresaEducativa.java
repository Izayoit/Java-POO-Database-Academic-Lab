package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

public class EmpresaEducativa {

    private int[] dni;
    private String[] nombre;
    private int i = 0;

    public EmpresaEducativa() {
        dni = new int[15];
        nombre = new String[15];
    }

    public void listar(JTable control) { //cabezera
        String[] cabecera = {"dni", "nombre"};
        DefaultTableModel modTable = new DefaultTableModel(cabecera, 0);
        control.setModel(modTable);
        for (int pos = 0; pos < i; pos++) {
            String[] lista = {dni[pos] + "", nombre[pos]};
            modTable.addRow(lista);
        }

    }

    public void Agregar(int dniPlus, String nombrePlus) {
   
        if (BuscarDni(dniPlus) == -1) {   
       if (i < dni.length) {  
                dni[i] = dniPlus;
                nombre[i] = nombrePlus;
                i++;
            } else {
               JOptionPane.showMessageDialog(null, "alcanzo limite");
            }

        } else {
            JOptionPane.showMessageDialog(null, "es igual");
        }
    }

    public int BuscarDni(int code) {
        for (int pos = 0; pos < i; pos++) {
            if (dni[pos] == code) {
                return pos;
            }
        }
        return -1;
    }

    public String Getnombre(int pos) {
        return nombre[pos];

    }

    public void guarda(String NombreArchivo) {
        try {
            FileWriter objfileWriter = new FileWriter(NombreArchivo);
            PrintWriter objprintWriter = new PrintWriter(objfileWriter);
            for (int pos = 0; pos < i; pos++) {
                String linea = dni[pos] + "," + nombre[pos];
                objprintWriter.println(linea);
            }
            objprintWriter.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    public void cargar(String NombreArchivo) {
        try {
            FileReader objFileReader = new FileReader(NombreArchivo);
            BufferedReader objBufferedreader = new BufferedReader(objFileReader);
            String Linea =null;
            while ((Linea=objBufferedreader.readLine())!= null) {
               String[]datos = Linea.split(",");
               int dni = Integer.parseInt(datos[0]);
               String nombre = datos[1];
                Agregar(dni, nombre);
              
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }
     public void FiltrarYListar(String filtro, JTable tabla) {
     if(i==0){
     JOptionPane.showMessageDialog(null, "la lista esta vacia");
     }
     String[] cabecera ={"dni","nombre"};
         DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modTabla);
        boolean encontrado =false;
         for (int pos = 0; pos < i; pos++) {
         String dniString = dni[pos]+"";
         if(dniString.contains(filtro)){
          String fila[] ={dni[pos]+"",nombre[pos]};
          modTabla.addRow(fila);
          encontrado = true;}
         }
         if(encontrado==false){
         JOptionPane.showMessageDialog(null, "no se encontro ");
             listar(tabla);
         }
     
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         /* if (i == 0) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            return;
        }
        String[] cabecera ={"nombre","dni"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modTabla);
        boolean encontrado = false;
        for (int pos = 0; pos < i; pos++) {
            String dniString = dni[pos] + "";
            if (dniString.contains(filtro)) {
                String fila[] = {dni[pos]+ "",nombre[pos]  };
                modTabla.addRow(fila);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No encontramos coincidencias con el filtro.");
            listar(tabla);
        }*/
    }

}
