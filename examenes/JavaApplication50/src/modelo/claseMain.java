
package modelo;

public class claseMain {

  
    public static void main(String[] args) {
     usuario Arreglo_usuarios[] = new usuario[3];
     Arreglo_usuarios[1] = new estudiante("fabrizio", 75523250+"", 1);
     Arreglo_usuarios[2] = new profesor("contratado", "dominguez", 51231+"");
     Arreglo_usuarios[3]= new visitante("leer libros", "marco", 523141421+"");
    for( usuario MisUsuarios: Arreglo_usuarios){
        System.out.println(MisUsuarios.MostrarDatos());
        System.out.println("");
        
       
        
    }
    
    }
    
}
