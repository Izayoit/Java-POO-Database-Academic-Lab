
package modelo_reportes;

import java.util.ArrayList;


public class Arreglo_ConComprasAR {
     
   private ArrayList<consulta_compras> arreglo = new ArrayList<consulta_compras>();
    
    public void Agregar(consulta_compras dato){
        arreglo.add(dato);
    }
    
    public consulta_compras getDato(int pos){
        return arreglo.get(pos);
    }
    
    public void Eliminar(int pos){
        arreglo.remove(pos);
    }
    
    public void Reiniciar(){
        arreglo = new ArrayList<consulta_compras>();
    }
    
    public consulta_compras BuscarCodigo(int id_ConCompras){
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if(id_ConCompras == arreglo.get(pos).getId_detalle_compra()){
                return arreglo.get(pos);
            }
        }
        return null;
    }
}
