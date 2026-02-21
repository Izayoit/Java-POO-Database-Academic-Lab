
package Control;

import Modelo_mantenimiento.persona;


public class Arreglo_PersonaNA {
    private persona[] arreglo;
    private int i = 0;
    
    public Arreglo_PersonaNA(int size){
        arreglo = new persona[size];
    }
    
    public void Agregar(persona dato){
        arreglo[i] = dato;
        i++;
    }
    
    public persona getDato(int pos){
        return arreglo[pos];
    }
    
    public persona BuscarCodigo(int idcategoria){
        for (int pos = 0; pos < i; pos++) {
            if(idcategoria == arreglo[pos].getIdpersona()){
                return arreglo[pos];   
            }
        }
        return null;
    }
}
