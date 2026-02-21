
package modelo_operaciones;


public class Arreglo_comprasNA {
    private compras[] arreglo;
    private int i = 0;
    
    public Arreglo_comprasNA(int size){
        arreglo = new compras[size];
    }
    
    public void Agregar(compras dato){
        arreglo[i] = dato;
        i++;
    }
    
    public compras getDato(int pos){
        return arreglo[pos];
    }
    
    public compras BuscarCodigo(int idcategoria){
        for (int pos = 0; pos < i; pos++) {
            if(idcategoria == arreglo[pos].getIdIngreso()){
                return arreglo[pos];   
            }
        }
        return null;
    }
    
   
    
}
