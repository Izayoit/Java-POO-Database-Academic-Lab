
package modelos;


public class empresaRepartidora extends empresa {
    
    private String nombre;

    public empresaRepartidora(String nombre, int ingresoMensual, String Direccion, int Ntrabajadores) {
        super(ingresoMensual, Direccion, Ntrabajadores);
        this.nombre = nombre;
    }
    

    
    
public void Mostrardatos(){
    System.out.println("Direccion: "+getDireccion()+
            "\ninreso mensual: "+ getIngresoMensual()+
            "\ntrabajadores: "+ getNtrabajadores()+
            "\nnombre: "+nombre);
}
   
}
