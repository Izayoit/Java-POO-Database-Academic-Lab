
package Control;

import Modelo_mantenimiento.usuario;


public class Arreglo_usuarioNA {
     private usuario[] arreglo;
    private int i = 0;
    
    public Arreglo_usuarioNA(int size){
        arreglo = new usuario[size];
    }
    
    public void Agregar(usuario dato){
        arreglo[i] = dato;
        i++;
    }
    
    public usuario getDato(int pos){
        return arreglo[pos];
    }
    
    public usuario BuscarCodigo(int idusuario){
        for (int pos = 0; pos < i; pos++) {
            if(idusuario == arreglo[pos].getIduser()){
                return arreglo[pos];   
            }
        }
        return null;
    }
}
