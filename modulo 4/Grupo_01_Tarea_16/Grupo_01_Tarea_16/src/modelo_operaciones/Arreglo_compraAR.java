
package modelo_operaciones;

import java.util.ArrayList;


public class Arreglo_compraAR {
    // Declaración del ArrayList para almacenar objetos de tipo Compra
    private ArrayList<compras> arreglo = new ArrayList<compras>();

    // Método para agregar un objeto Compra al arreglo
    public void Agregar(compras dato) {
        arreglo.add(dato);
    }

    // Método para obtener un objeto Compra en una posición específica
    public compras getDato(int pos) {
        return arreglo.get(pos);
    }

    // Método para eliminar un objeto Compra en una posición específica
    public void Eliminar(int pos) {
        arreglo.remove(pos);
    }

    // Método para reiniciar (limpiar) el arreglo
    public void Reiniciar() {
        arreglo = new ArrayList<compras>();
    }

    // Método para buscar una Compra por su ID (idingreso)
    public compras BuscarCodigo(int idIngreso) {
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if (idIngreso == arreglo.get(pos).getIdIngreso()) {
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
