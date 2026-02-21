
package Arreglo_interface;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class arreglo {
    private persona[] arreglo = new persona[20];
    private int i =0 ;
    
    
    
    public void listar(JTable control){
    String[] cabezera = {"nombre","apellido","dinero","pension"};
        DefaultTableModel modtabla = new DefaultTableModel(cabezera, 0);
        for (int pos = 0; pos < i; pos++) {
            
            modtabla.addRow(arreglo[pos].getregistro());
            
        }
        control.setModel(modtabla);
    }
    
    public void registrar(persona dato){
    arreglo[i]=dato;
    i++;
    }
    public persona getDato(int pos){
    return arreglo[pos];
    }
   
    
    
    
}
