
package modelo_reportes;

import java.util.ArrayList;


public class Arreglo_ConVentasAR {
     private ArrayList<consulta_ventas> arreglo = new ArrayList<consulta_ventas>();
    
    public void Agregar(consulta_ventas dato){
        arreglo.add(dato);
    }
    
    public consulta_ventas getDato(int pos){
        return arreglo.get(pos);
    }
    
    public void Eliminar(int pos){
        arreglo.remove(pos);
    }
    
    public void Reiniciar(){
        arreglo = new ArrayList<consulta_ventas>();
    }
    
    public consulta_ventas BuscarCodigo(int id_ConVentas){
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if(id_ConVentas == arreglo.get(pos).getId_detalle_venta()){
                return arreglo.get(pos);
            }
        }
        return null;
    }
}
