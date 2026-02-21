
package Control;

import Modelo.Horas;
import javax.swing.JOptionPane;


public class Arreglo_Horas {
    private Horas [][] arreglo = new Horas[15][5];
    private int i =0;
    
    public void Registrar(Horas dato) {
        if(Buscar(dato.getHoras()) == -1) {
        arreglo[i][0] = dato;
        i++;
        
        }else {
        JOptionPane.showMessageDialog(null, "La hora  ya esta registrado");
        }
        
    }
    public int Buscar(String Horas) {
    for (int j = 0; j < i; j++) {
        if (arreglo[j][0].getHoras().equals(Horas)) {
            return j; 
        }
    }
    return -1; 
   }
    
}
