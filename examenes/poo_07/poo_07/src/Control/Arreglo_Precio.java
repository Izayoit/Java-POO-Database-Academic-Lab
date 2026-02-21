package Control;

import Modelo.Precio;

public class Arreglo_Precio {
    private Precio[] arreglo = new Precio[15];
    private int mayorPrecio = 0;
    private int i = 0;
    
    public void Registrar(Precio dato){
        try{
            arreglo[i] = dato;
            i++;
        }catch(Exception e){
        }
    }
}
