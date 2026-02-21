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

public class encuesta {

    protected String[] Lista_Encuesta;
    private int i = 0;

    public encuesta() {
        Lista_Encuesta = new String[5];
    }

    public void listar(JTable control) {
        String[] cabezera = {"respuestas"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {
            Object[] Lista = {Lista_Encuesta[pos]};
            modtable.addRow(Lista);
        }
    }

    public void Agregar(String respuestas) {
        if (i < Lista_Encuesta.length) {
            Lista_Encuesta[i] = respuestas;

            i++;
        } else {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }

    }

    public void guardar(String NombreArchivo) {

        try {
            FileWriter objFilWriter = new FileWriter(NombreArchivo);
            PrintWriter objPrintWriter = new PrintWriter(objFilWriter);
            for (int pos = 0; pos < i; pos++) {
                String Line = Lista_Encuesta[pos];
                objPrintWriter.println(Line);
            }
            JOptionPane.showMessageDialog(null, "realizado con exito");
            objFilWriter.close();
        } catch (IOException ex) {

        }

    }

    public void cargar(String NombreArchivo) {

        try {
            FileReader objFileReader = new FileReader(NombreArchivo);
            BufferedReader objBufferedReader = new BufferedReader(objFileReader);
            String linea = null;
            while ((linea = objBufferedReader.readLine()) != null) {

                Agregar(linea);

            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error");

        }

    }

}
