package control;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.usuarios;

public class Arreglo_usuarios {

    private usuarios[] arreglo = new usuarios[15];
    private int i;

    public void listar(JTable control) {
         if (control == null) {
        System.err.println("Error: JTable es null.");
        return;
    }

        String[] cabezera = {"nombre", "apellido", "dni", "edad", "genero", "region", "tipo de internet"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);

        for (int pos = 0; pos < i; pos++) {
            modtable.addRow(arreglo[pos].getRegistro());

        }
    }

    public void registrar(usuarios dato) {
        arreglo[i] = dato;
        i++;
    }

}
