
package modelo;


public class Vehiculofurgoneta extends vehiculo{
    
    private int carga ;

    public Vehiculofurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    public String mostrardatos() {
       return  "matricula: "+matricula+
                "\nmarca: " + marca+
                "\nmodelo: " + modelo+
                "\ncarga: " + carga
                
                ;}
}
