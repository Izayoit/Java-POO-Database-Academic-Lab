
package modelos;

public class empresa {
    
    private  int ingresoMensual ;
    private String Direccion ;
    private int Ntrabajadores;

    public empresa(int ingresoMensual, String Direccion, int Ntrabajadores) {
        this.ingresoMensual = ingresoMensual;
        this.Direccion = Direccion;
        this.Ntrabajadores = Ntrabajadores;
    }

    public int getIngresoMensual() {
        return ingresoMensual;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getNtrabajadores() {
        return Ntrabajadores;
    }
    

    
   
    
}
