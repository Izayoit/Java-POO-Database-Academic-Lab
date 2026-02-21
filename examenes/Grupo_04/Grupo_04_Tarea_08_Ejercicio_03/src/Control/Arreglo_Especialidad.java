
package Control;

import Modelo.Especialidad;
import javax.swing.JOptionPane;


public class Arreglo_Especialidad {
    private Especialidad[][] arreglo = new Especialidad[15][5];
    private int i =0;
    
    public void Registrar(Especialidad dato) {
        if(Buscar(dato.getEspecialidad()) == -1) {
        arreglo[i][0] = dato;
        i++;
        
        }else {
            JOptionPane.showMessageDialog(null, "La Especialidad ya esta registrado");
        }
        
    }
    public int Buscar(String Doctor) {
    for (int j = 0; j < i; j++) {
        if (arreglo[j][0].getEspecialidad().equals(Doctor)) {
            return j; 
        }
    }
    return -1; 
   }

}
