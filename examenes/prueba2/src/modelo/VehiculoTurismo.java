
package modelo;


public class VehiculoTurismo extends vehiculo{
    private int Npuertas;

    public VehiculoTurismo(int Npuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.Npuertas = Npuertas;
    }
    
    @Override
    public String mostrardatos(){
        
        return "matricula: "+ matricula+
               "\nmarca: " + marca+
               "\nmodelo " + modelo+
                "\nnumero puertas: " + Npuertas
                
        ;
    }
    
  
}
