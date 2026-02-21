package Control;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Arreglo_Nombres {

    private String[] arreglo = new String[5];
    private int i = 0;

    
    public void Registrar(String dato) {

        try {

            if (GuardarIguales(dato) == -1) {

                arreglo[i] = dato;
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "son iguales");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }
    }

    /*if(i<arreglo.length){
        arreglo[i] = dato;
        i++;        
    }else{JOptionPane.showMessageDialog(null, "se paso del limite");}
    }*/
    public void Listar(JList control) {
        DefaultListModel modLista = new DefaultListModel();
        control.setModel(modLista);
        for (int pos = 0; pos < i; pos++) {
            modLista.addElement(arreglo[pos]);
        }
    }

    public int GuardarIguales(String arregloPlus) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].equals(arregloPlus)) {
                return pos;
            }

        }
        return -1;
    }

    public void Guardar(String ARCHIVO) {
        try {
            FileReader FR = new FileReader(ARCHIVO);
        } catch (FileNotFoundException ex) {

        }

    }

    public void eliminar(int pos) {
        for (int j = pos; j < i - 1; j++) {
            arreglo[j] = arreglo[j + 1];
        }
        i--;
    }
}
