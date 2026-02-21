
package Control;

import Modelo.Dias;
import javax.swing.JOptionPane;


public class Arreglo_Dias {
    private Dias [][] arreglo = new Dias[15][5];
    private int i =0;
    
   public void Registrar(Dias dato) {
        if(Buscar(dato.getDias()) == -1) {
        arreglo[i][0] = dato;
        i++;
        
        }else {
            JOptionPane.showMessageDialog(null, "El Dia ya esta registrado");
        }
        
    }
    public int Buscar(String Dias) {
    for (int j = 0; j < i; j++) {
        if (arreglo[j][0].getDias().equals(Dias)) {
            return j; 
        }
    }
    return -1; 
   }
}
