
package Control;

import Modelo_mantenimiento.categoria;


public class Arreglo_categoriaNA {
    private categoria[] arreglo;
    private int i = 0;
    
    public Arreglo_categoriaNA(int size){
        arreglo = new categoria[size];
    }
    
    public void Agregar(categoria dato){
        arreglo[i] = dato;
        i++;
    }
    
    public categoria getDato(int pos){
        return arreglo[pos];
    }
    
    public categoria BuscarCodigo(int idcategoria){
        for (int pos = 0; pos < i; pos++) {
            if(idcategoria == arreglo[pos].getIdcategoria()){
                return arreglo[pos];   
            }
        }
        return null;
    }
}
