
package modelo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo {
    private  Object[][]lista_productos;
    private int i =0;

    public Arreglo() {
        lista_productos = new Object[10][3];
        
    }
public void listar(JTable control){
String[] cabezera ={"codigo","nombre","tiempo"};
    DefaultTableModel modTable = new DefaultTableModel(cabezera, 0);
    control.setModel(modTable);
    for (int pos = 0; pos < i; pos++) {
        modTable.addRow(lista_productos[pos]);
    }
    
}
public void Agregar(int codigo, String nombre,int tiempo){
   
    if(i<lista_productos.length){
   lista_productos[i][0]=codigo;
   lista_productos[i][1]=nombre;
   lista_productos[i][2]=tiempo;
   i++;
   
    }else{JOptionPane.showMessageDialog(null, "se paso el limite");}
}
public void Elimianr(int pos){

    for (int j =pos ; j < i-1; j++) {
        lista_productos[j]=lista_productos[j+1];
    }
    i--;
}


}
