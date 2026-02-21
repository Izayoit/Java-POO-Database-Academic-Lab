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

public class tiendaP {

    private Object[][] Arreglo_Productos;
    private int i = 0;
    private int agregar;

    public tiendaP() {
        Arreglo_Productos = new Object[50][4];

    }
    

    public void Listar(JTable control) {
        String[] cabezera = {"codigo", "nombre", "tiempo", "cantidad"};
        DefaultTableModel modTabla = new DefaultTableModel(cabezera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(Arreglo_Productos[pos]);

        }

    }

    public void agregar(int codigoPlus, String nombrePlus, int tiempoPlus, int cantidadPlus) {
        if (buscarBloquearproducto(nombrePlus) == -1) {
            if (i < Arreglo_Productos.length) {
                Arreglo_Productos[i][0] = codigoPlus;
                Arreglo_Productos[i][1] = nombrePlus;
                Arreglo_Productos[i][2] = tiempoPlus;
                Arreglo_Productos[i][3] = cantidadPlus;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "se paso del limite");
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "es igual");
        }

    }

    public void AgregarStock(int pos, int agregar) {
 
        Arreglo_Productos[pos][3] = (int) Arreglo_Productos[pos][3] + agregar;
    }
    public void  DisminuirStock(int pos) {
        Arreglo_Productos[pos][3] = (int) Arreglo_Productos[pos][3] - 1;//revisar
        
    }

    public void AumentarStock(int pos) {
        Arreglo_Productos[pos][3] = (int) Arreglo_Productos[pos][3] + 1;
    }

    public String MayorStock() {
        int dato1 = (int) Arreglo_Productos[0][3];
        String dato2 = (String) Arreglo_Productos[0][1];
        for (int pos = 1; pos < i; pos++) {
            if ((int) Arreglo_Productos[pos][3] > dato1) {
                dato2 = (String) Arreglo_Productos[pos][1];
            }
        }
        return dato2;

    }

    public int buscarBloquearproducto(String nombrePlus) {
        for (int pos = 0; pos < i; pos++) {
            if (Arreglo_Productos[pos][1].equals(nombrePlus)) {  //int == , String .equals

                return pos;
            }

        }
        return -1;
    }

    public void editar(int codigoPlus, String nombrePlus, int tiempoPlus, int cantidad) {
        int pos = buscarBloquearproducto(nombrePlus);
        if (pos != -1) {

            Arreglo_Productos[pos][1] = nombrePlus;
            Arreglo_Productos[pos][2] = tiempoPlus;
            Arreglo_Productos[pos][3] = cantidad;

            JOptionPane.showMessageDialog(null, "se relizo con exito");
        } else {
            JOptionPane.showMessageDialog(null, "no se encontro nada");
        }

    }

    public void elimnar(int pos) {
        for (int j = pos; j < i - 1; j++) {
            Arreglo_Productos[j] = Arreglo_Productos[j + 1];

        }
        i--;
    }

    public void Guarda(String Archivo) {
        try {
            FileWriter FW = new FileWriter(Archivo);
            PrintWriter PW = new PrintWriter(FW);
            for (int pos = 0; pos < i; pos++) {
                PW.println(Arreglo_Productos[pos]);
            }
            JOptionPane.showMessageDialog(null, "se guardo correctamente");
            PW.close();
        } catch (IOException ex) {

        }

    }

    public void cargar(String Archivo) {
        try {
            FileReader FR = new FileReader(Archivo);
            BufferedReader BR = new BufferedReader(FR);
            String linea = null;
            while ((linea = BR.readLine()) != null) {
                String[] datos = linea.split(",");
                int codigo1 = Integer.parseInt(datos[0]);
                String nombre1 = (datos[1]);
                int tiempo1 = Integer.parseInt(datos[2]);
                int stock = Integer.parseInt(datos[3]);
                agregar(codigo1, nombre1, tiempo1, stock);

            }
        } catch (IOException ex) {

        }

    }

}
