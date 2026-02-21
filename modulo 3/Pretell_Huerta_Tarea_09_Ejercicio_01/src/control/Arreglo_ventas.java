package control;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Ventas;

public class Arreglo_ventas {
    public void restar(){
    
    
    }

    public Ventas[] getArreglo() {
        return Arreglo;
    }

    public void setArreglo(Ventas[] Arreglo) {
        Arreglo_ventas.Arreglo = Arreglo;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        Arreglo_ventas.i = i;
    }

    private static Ventas[] Arreglo = new Ventas[200];
    private static int i = 0;

    public void listar(JTable control) {

        String[] cabezera = {"N_boleto", "Origen", "Destino", "precio", "Nombre_p", "asiento", "fecha", "turno"};
        DefaultTableModel ModTable = new DefaultTableModel(cabezera, 0);
        control.setModel(ModTable);
        for (int pos = 0; pos < i; pos++) {
            ModTable.addRow(Arreglo[pos].getRegistro());

        }

    }

    public void Registrar(String boleto, String TipoOrigen, String TipoDestino, int precio, String nombre, String asientos, String TipoFecha, String turno) {
        try {

            Object[] Registro = {boleto, TipoOrigen, TipoDestino, precio, nombre, asientos, TipoFecha, turno};

            Arreglo[i] = new Ventas(Registro);
            i++;
        } catch (ArrayIndexOutOfBoundsException e) {
             
            JOptionPane.showMessageDialog(null, "paso el limite");
        }
    }

    public void Registrar(Object[] registro) {
        Arreglo[i] = new Ventas(registro);
        i++;
    }

    public void Eliminar() {
        i = 0;
    }
    public void Disminuir(){
    
    
    }
  
}
