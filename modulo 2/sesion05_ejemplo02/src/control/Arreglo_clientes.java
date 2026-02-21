
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_clientes {
    private String [][] Lista_clientes;
    private int i =0;
    
                 
    public void Listar (JTable control ){
    String[] cabecera = {"nombre","apellidos"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos <i; pos++) {
            modTabla.addRow(Lista_clientes[pos]);
            
        }
    }
    public void Agregar(String nombre, String apellidos){
        if(i<Lista_clientes.length){
        Lista_clientes [i][0] = nombre;
        Lista_clientes[i][1] = apellidos;
        }else{JOptionPane.showMessageDialog(null, "se excedio el limite");
        }
    
            i++;
    }
    public void Editar (String nombre , String apellidos, int pos){
    
    Lista_clientes[pos][0] =nombre;
    Lista_clientes[pos][1] =apellidos ;
    
    }
    public void Eliminar (int pos_eliminar){
        for (int pos =pos_eliminar; pos <Lista_clientes.length-1; pos++) {
            Lista_clientes[pos] = Lista_clientes[pos+1];
            
        }
    i--;
    
    }
    public void Eliminar_todo(){
    i=0;}
}
