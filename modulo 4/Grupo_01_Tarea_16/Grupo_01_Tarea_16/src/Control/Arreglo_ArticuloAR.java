
package Control;

import Modelo_mantenimiento.articulos;
import java.util.ArrayList;


public class Arreglo_ArticuloAR {
    
   private ArrayList<articulos> arreglo = new ArrayList<articulos>();
    
    public void Agregar(articulos dato){
        arreglo.add(dato);
    }
    
    public articulos getDato(int pos){
        return arreglo.get(pos);
    }
    
    public void Eliminar(int pos){
        arreglo.remove(pos);
    }
    
    public void Reiniciar(){
        arreglo = new ArrayList<articulos>();
    }
    
    public articulos BuscarCodigo(int id_articulos){
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if(id_articulos == arreglo.get(pos).getIdArticulos()){
                return arreglo.get(pos);
            }
        }
        return null;
    }
    
}
