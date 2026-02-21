package Control;

import Modelo.Control_Arreglos;
import Modelo.Docente;
import Modelo.Empleado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Docente implements Control_Arreglos {
    
    private Docente[] arreglo = new Docente[20];
    private int i = 0;

    @Override
    public void Registrar(Empleado dato) {
        if (Buscar_Nombre(dato.getNombre()) == null) {
            arreglo[i] = (Docente) dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "El nombre ya ha sido registrado");
        }
    }

    @Override
    public void Listar(DefaultTableModel modControl) {
        modControl.setRowCount(0); // Establece las filas en 0
        for (int pos = 0; pos < i; pos++) { // Añade filas nuevas
            Docente docente = arreglo[pos];
            modControl.addRow(new Object[]{docente.getNombre(), docente.getApellidos(), docente.getSueldo(),
                docente.getCategoria(), docente.getNumero_horas()});
        }
    }

    @Override
    public Empleado Buscar_Nombre(String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if(arreglo[pos].getNombre().equals(nombre)){
                return arreglo[pos];
            }
        }
        return null;
    }
    
    public Empleado getDato(int pos) {
        return arreglo[pos];
    }
    
}
