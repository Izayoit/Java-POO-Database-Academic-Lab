package Control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Productos {
    private String[][] Arreglo = new String[2][3];
    private int i = 0;
    
    public void Registrar(String Codigo,
                          String Descripcion, 
                          String Precio){
        Arreglo[i][0] = Codigo;
        Arreglo[i][1] = Descripcion;
        Arreglo[i][2] = Precio;
        i++;
    }
    
    public void Registrar(String[] Registro){
        Arreglo[i] = Registro;
        i++;                    
    }
    
    public void Listar(JTable control){
        String[] Cabecera = {"Código","Descripción","Precio"};
        DefaultTableModel modTabla = 
                new DefaultTableModel(Cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(Arreglo[pos]);
        }
    }
    
    public void Totalizar(JTextField control){
        double suma = 0;
        for (int pos = 0; pos < i; pos++) {
            suma = suma + Double.parseDouble(Arreglo[pos][2]);
        }
        control.setText(suma + "");
    }
}
