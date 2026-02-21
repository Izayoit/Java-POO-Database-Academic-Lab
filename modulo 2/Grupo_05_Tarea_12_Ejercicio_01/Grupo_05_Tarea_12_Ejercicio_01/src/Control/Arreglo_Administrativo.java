package Control;

import Modelo.Administrativo;
import Modelo.Control_Arreglos;
import Modelo.Empleado;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Arreglo_Administrativo implements Control_Arreglos {

    private Administrativo[] arreglo = new Administrativo[20];
    private int i = 0;

    @Override
    public void Registrar(Empleado dato) {
        if (Buscar_Nombre(dato.getNombre()) == null) {
            arreglo[i] = (Administrativo) dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "El nombre ya ha sido registrado");
        }
    }

    @Override
    public void Listar(DefaultTableModel modControl) {
        modControl.setRowCount(0); // Establece las filas en 0
        for (int pos = 0; pos < i; pos++) { // Añade filas nuevas
            Administrativo administrativo = arreglo[pos];
            
            modControl.addRow(new Object[]{administrativo.getNombre(), administrativo.getApellidos(),
                administrativo.getSueldo(), administrativo.getJefatura(), administrativo.getCargo()});
        }
    }

    @Override

    public Empleado Buscar_Nombre(String nombre) {
        for (int pos = 0; pos < i; pos++) {
            if (arreglo[pos].getNombre().equals(nombre)) {
                return arreglo[pos];
            }
        }
        return null;
    }

    

}
