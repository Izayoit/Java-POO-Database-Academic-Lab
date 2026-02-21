
package control;

import javax.swing.DefaultListModel;
import javax.swing.JList;
             
import javax.swing.JOptionPane;


public class Arreglo_Nombres {
    protected String [] Lista_nombres;
    protected int i = 0;

    public void Listar(JList control){
        DefaultListModel modLista = new DefaultListModel();
        control.setModel(modLista);
        for (int pos = 0; pos <i; pos++) {
            modLista.addElement(Lista_nombres[pos]);
        }
    
    }
    public void agregar (String dato){
         if(Buscar(dato)==-1){
          if(i<Lista_nombres.length){
        Lista_nombres[i] = dato ;
    i++;
        }else{JOptionPane.showMessageDialog(null, "error");
          }
        
         }else {JOptionPane.showMessageDialog(null, "no se puede repetir");} 
        
        
        
    }
    public void editar (String dato, int pos){
    Lista_nombres[pos] = dato ;
    }
    public void eliminar(int pos_eliminar){
        for (int pos = pos_eliminar; pos < Lista_nombres.length-1; pos++) {
            Lista_nombres[pos] = Lista_nombres[pos+1];
            
        }
    i--;
    }
    public void eliminar_todo (){
    i=0;
    }
    public int Buscar(String dato){
    
        for (int pos = 0; pos < i; pos++) {
            if(Lista_nombres[pos].equals(dato)){
            return pos;
            }
        }
        return -1;
    }
    
}
