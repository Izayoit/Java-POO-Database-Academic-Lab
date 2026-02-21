
package Control;

import Modelo_mantenimiento.articulos;


public class Arreglo_ArticuloNA {
    
     private articulos[] arreglo;
    private int i = 0;
    
    public Arreglo_ArticuloNA(int size){
        arreglo = new articulos[size];
    }
    
    public void Agregar(articulos dato){
        arreglo[i] = dato;
        i++;
    }
    
    public articulos getDato(int pos){
        return arreglo[pos];
    }
    
    public articulos BuscarCodigo(int idarticulo){
        for (int pos = 0; pos < i; pos++) {
            if(idarticulo == arreglo[pos].getIdArticulos()){
                return arreglo[pos];   
            }
        }
        return null;
    }
}
