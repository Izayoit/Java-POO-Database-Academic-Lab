
package Control;

import Modelo.Categorias;
import java.util.ArrayList;


public class Arreglo_Categorias {
     private Categorias[] arreglo;
    private int i = 0;
      public Arreglo_Categorias(int size){
        arreglo = new Categorias[size];
    }
        public void Agregar(Categorias dato){
        arreglo[i] = dato;
        i++;
    }
         public Categorias getDato(int pos){
        return arreglo[pos];
    }
   
          public Categorias BuscarCodigo(int COdcategoria){
        for (int pos = 0; pos < i; pos++) {
            if(COdcategoria == arreglo[pos].getIdcategoria()){
                return arreglo[pos];
            }
        }
        return null;
    }
}
