
package Control;

import Modelo.Doctor;
import javax.swing.JOptionPane;


public class Arreglo_Doctor {
    private Doctor[][] arreglo = new Doctor[15][5];
    private int i =0;
    
    public void Registrar(Doctor dato) {
        if(Buscar(dato.getDoctor()) == -1) {
        arreglo[i][0] = dato;
        i++;
        
        }else {
        JOptionPane.showMessageDialog(null, "El Doctor ya esta registrado");
        }
        
    }
    public int Buscar(String Doctor) {
    for (int j = 0; j < i; j++) {
        if (arreglo[j][0].getDoctor().equals(Doctor)) {
            return j; 
        }
    }
    return -1; 
   }

    
}
