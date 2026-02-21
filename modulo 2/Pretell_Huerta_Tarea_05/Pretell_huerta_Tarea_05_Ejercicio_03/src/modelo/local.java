
package modelo;
public class local {
    private int numero ;
   
    private String direccion;

    public local() {
        
        
    }

    public local(int numero , String direccion) {
        this.numero = numero;
        
        this.direccion = direccion;
    }

  

   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    
    
    
}
