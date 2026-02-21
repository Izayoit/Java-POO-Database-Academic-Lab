package Control;

import Modelo.Precio;

public class Arreglo_Precio {
     Precio[] arreglo = new Precio[15];
    int mayorPrecio = 0;
    int i = 0;
    
    public void Registrar(Precio dato){
        
            arreglo[i] = dato;
            i++;
        
    }
}
