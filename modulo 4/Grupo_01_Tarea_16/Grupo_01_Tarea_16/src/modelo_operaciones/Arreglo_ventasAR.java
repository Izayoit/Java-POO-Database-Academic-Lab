
package modelo_operaciones;

import java.util.ArrayList;


public class Arreglo_ventasAR {
    // Declaración del ArrayList para almacenar objetos de tipo Compra
    private ArrayList<ventas> arreglo = new ArrayList<ventas>();

    // Método para agregar un objeto Compra al arreglo
    public void Agregar(ventas dato) {
        arreglo.add(dato);
    }

    // Método para obtener un objeto Compra en una posición específica
    public ventas getDato(int pos) {
        return arreglo.get(pos);
    }

    // Método para eliminar un objeto Compra en una posición específica
    public void Eliminar(int pos) {
        arreglo.remove(pos);
    }

    // Método para reiniciar (limpiar) el arreglo
    public void Reiniciar() {
        arreglo = new ArrayList<ventas>();
    }

    // Método para buscar una Compra por su ID (idingreso)
    public ventas BuscarCodigo(int idVentas) {
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if (idVentas == arreglo.get(pos).getIdVentas()) {
                return arreglo.get(pos);
            }
        }
        return null; // Retorna null si no encuentra el objeto
    }

    // Método para obtener el tamaño del arreglo
    public int getTamaño() {
        return arreglo.size();
    }
    
}
