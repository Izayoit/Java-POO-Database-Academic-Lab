package Control;

import Modelo.Empleado;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArregloEmpleado {
    private Empleado[] arreglo = new Empleado[15];
    private int i = 0;
    
    public void Registrar(Empleado dato) {
        arreglo[i] = dato;
        i++;
    }
    
    public Empleado getDato(int pos) {
        return arreglo[pos];
    }
    
    public int Buscar_DNI(String dni) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getDni().equals(dni)) {
                return pos;
            }
        }
        return -1;
    }
    
    public void Listar(JTable control) {
        String[] cabecera = {"DNI", "Nombres", "Apellidos"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        for (int pos = 0; pos < i; pos++) {
            modTabla.addRow(arreglo[pos].getRegistro());
        }
    }
}


