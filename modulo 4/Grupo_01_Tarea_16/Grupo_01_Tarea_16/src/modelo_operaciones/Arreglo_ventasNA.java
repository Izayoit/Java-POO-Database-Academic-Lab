
package modelo_operaciones;


public class Arreglo_ventasNA {
    
     private ventas[] arreglo;
    private int i = 0;
    
    public Arreglo_ventasNA(int size){
        arreglo = new ventas[size];
    }
    
    public void Agregar(ventas dato){
        arreglo[i] = dato;
        i++;
    }
    
    public ventas getDato(int pos){
        return arreglo[pos];
    }
    
    public ventas BuscarCodigo(int idventas){
        for (int pos = 0; pos < i; pos++) {
            if(idventas == arreglo[pos].getIdVentas()){
                return arreglo[pos];   
            }
        }
        return null;
    }
    
    
    
    
    
}
