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

    public int buscar_Dni(String dni) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getDni().equals(dni)) {
                return pos;
            }

        }
        return -1;
    }

    public Empleado getDato(int pos) {
        return arreglo[pos];
    }

    public void Listar(JTable control) {
        String[] cabezera = {"dni", "nombre", "apellidos"};
        DefaultTableModel ModTabla = new DefaultTableModel(cabezera, 0);
        control.setModel(ModTabla);
        for (int pos = 0; pos < i; pos++) {
            ModTabla.addRow(arreglo[pos].getRegistro());

        }

    }

}
