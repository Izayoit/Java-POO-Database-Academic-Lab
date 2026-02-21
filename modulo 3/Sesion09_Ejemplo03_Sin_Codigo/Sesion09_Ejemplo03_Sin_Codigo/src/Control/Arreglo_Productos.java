package Control;

import Modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Productos {
    //private String[][] Arreglo = new String[2][3];
    private Producto[] Arreglo = new Producto[2];
    private int i = 0;

    public Producto[] getArreglo() {
        return Arreglo;
    }

    public int getI() {
        return i;
    }
    
       
    public void Listar(JTable control){
        String[] Cabecera = {"Código","Descripción","Precio"};
        DefaultTableModel modTabla = new DefaultTableModel(Cabecera, 0);
        control.setModel(modTabla);
        try {
            
        
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(Arreglo[pos].getRegistro());
        }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "la lista tiene elementos nulos");
        }
    }
     public void Registrar(int Codigo, String Descripcion, double Precio){
        Object[] Registro = {Codigo,Descripcion,Precio};
        Arreglo[i] = new Producto(Registro);
        i++;
    }
    
    public void Registrar(Object[] Registro){
        Arreglo[i] = new Producto(Registro);
        i++;                    
    }

    public void Totalizar(JTextField control){
        double suma = 0;
        for (int pos = 0; pos < i; pos++) {
            suma = suma + Arreglo[pos].getPrecio();
        }
        control.setText(suma + "");
    }
    
    
    
    
    
}
