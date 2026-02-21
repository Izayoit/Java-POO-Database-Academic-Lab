package Control;

import Modelo.Paciente;
import javax.swing.JOptionPane;


public class Arreglo_Paciente {
    private Paciente[][] arreglo = new Paciente[15][5];
    private int i =0;
    
    
    public void Registrar(Paciente dato) {
        if(Buscar(dato.getPaciente()) == -1) {
        arreglo[i][0] = dato;
        i++;
        
        }else {
        JOptionPane.showMessageDialog(null, "Paciente ya fue registrado");
        }
        
    }
    public int Buscar(String Paciente) {
    for (int j = 0; j < i; j++) {
        if (arreglo[j][0].getPaciente().equals(Paciente)) {
            return j; 
        }
    }
    return -1; 
   }
    /*public void Registrar(Paciente dato){
        if(Buscar(dato.getPaciente()).equals(-1)){
            arreglo[i][0] =dato;
            i++;
        }else{
            JOptionPane.showMessageDialog(null, "Paciente ya fue registrado");
        }
    }*/
    
    
    
    /*public String Buscar(String Paciente){
        
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                if(arreglo[j][0].getPaciente().equals(Paciente)){
               return k;
               return j;
            }
            }
        }
        return -1;
    }*/

   /*public void Registrar(String Paciente){
        for (int j = 0; j < i; j++) {
            if(arreglo[j].equals(Paciente)){
            JOptionPane.showMessageDialog(null, "El paciente ya está registrado");
            return;
            }
        }
    }*/

}
