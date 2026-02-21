
package modelo;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class precios {
   
    private static int Tabla_precios;
    
    public int[][]Lista_precios={
        {0,7,14,12,20},
        {7,0,20,18,25},
        {14,20,0,5,12},
        {12,18,5,0,8},
        {20,25,12,8,0}
    };
    private static String[]ciudades ={ "huacho","barranca","Huaral","chancay","lima"};
    public void Listar(JTable control){
   
     String[]cabezera = {"origen/destino","huacho","barranca","Huaral","chancay","lima"};
        DefaultTableModel ModTable = new  DefaultTableModel(cabezera, 0);
        control.setModel(ModTable);
        for (int pos = 0; pos < Lista_precios.length; pos++) {
            String[] fila = new String[Lista_precios[pos].length+1];
            fila[0] = ciudades[pos];
            for (int j = 0; j < Lista_precios[pos].length; j++) {
                fila[j+1] = Lista_precios[pos][j]+"";
                
            }
            ModTable.addRow(fila);
        }
    
    }
    
    
    
         
    
}
