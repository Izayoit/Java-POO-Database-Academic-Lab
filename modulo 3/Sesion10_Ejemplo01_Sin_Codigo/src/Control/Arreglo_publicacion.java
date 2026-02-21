
package Control;

import Modelo.Libro;
import Modelo.Publicacion;
import Modelo.Revista;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_publicacion {
    private Publicacion[] arreglo = new Publicacion[10];
    private int i=0;
    
    public void Registrar(Publicacion dato){
    arreglo[i] = dato;
    i++;
    
    }
 public void Listar(JTable control,int tipo){
     DefaultTableModel ModTable = null;
     switch (tipo) {
         case 1:ModTable = new DefaultTableModel(Libro.getcabezera(), 0);
             break;
         case 2:ModTable = new DefaultTableModel(Revista.getCabezera(), 0);
             break;
     }
 for (int pos = 0; pos < i; pos++) {
     switch (tipo) {
         case 1:
             if(arreglo[pos] instanceof
                     Libro){
              //Libro dato = (Libro)arreglo[pos];
             ModTable.addRow(arreglo[pos].getRegistro());
             }
             break;
         case 2:
             if(arreglo[pos] instanceof Revista){
             
             ModTable.addRow(arreglo[pos].getRegistro());
             }
             break;
        
     }
                 
             }
 
 control.setModel(ModTable);
 }
        
        
}
