
package Control;

import Modelo.Usuarios;
import java.util.ArrayList;


public class Arreglo_Usuarios {
     private ArrayList<Usuarios> arreglo = new ArrayList<Usuarios>();
       public void Agregar(Usuarios dato){
        arreglo.add(dato);
        
    }
          public Usuarios getDato(int pos){
        return arreglo.get(pos);
    }
            public void Eliminar(int pos){
        arreglo.remove(pos);
    }
             public void Reiniciar(){
        arreglo = new ArrayList<Usuarios>();
    }
              public Usuarios BuscarCodigo(int COdusuario){
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if(COdusuario == arreglo.get(pos).getIdusuario()){
                return arreglo.get(pos);
            }
        }
        return null;
    }
}
