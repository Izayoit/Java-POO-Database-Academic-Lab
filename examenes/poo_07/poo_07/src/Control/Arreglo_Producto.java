package Control;

import Modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Producto {
    private Producto[] arreglo = new Producto[15];
    private int i = 0;
    
    public void Agregar(Producto dato){
        if(Buscar(dato.getCodigo()) == -1){
            arreglo[i] = dato;
            i++;
        }else{
            JOptionPane.showMessageDialog(null, "Producto ya registrado");
        }
    }
    
    public int Buscar(int codigo){
        for(int j = 0; j < i; j++){
            if(arreglo[j].getCodigo() == codigo){
                return j;
            }
        }
        return -1;
    }
}
