
package modelo;


public class VehiculoDeportivo extends vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
   
    public String mostrardatos() {
        return "matricula: "+matricula+
                "\nmarca: " + marca+
                "\nmodelo: " + modelo+
                "\ncilindrada:" +cilindrada
                
                ;
    }
    
}
