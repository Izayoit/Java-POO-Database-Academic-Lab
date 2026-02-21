
package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.constructor;


public class Arreglo {
    private constructor[] arreglo = new constructor[15];
    private int i=0;
    
    public void Registrar(constructor dato){
   if(buscar_nombre(dato.getNombre())==-1){
       arreglo[i]=dato;
    i++;
   
   }else{JOptionPane.showMessageDialog(null, "nombre ya a fue registrado");}
    }
    
    public constructor getDato(int pos) {
        return arreglo[pos];
    }
    public int buscar_nombre(String nombre ) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombre().equals(nombre)) {
                return pos;
            }

        }
        return -1;
    }

    public void Listar(JTable control) {
        String[] cabezera = {"nombre", "apellido"};
        DefaultTableModel ModTabla = new DefaultTableModel(cabezera, 0);
        control.setModel(ModTabla);
        for (int pos = 0; pos < i; pos++) {
            ModTabla.addRow(arreglo[pos].getRegistro());

        }
}
}