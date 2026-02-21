package Modelo;

public class Vehiculo {
    //Atributos
    private String propietario ;
    private Motor objMotor;
    private Rueda[] Lista_Ruedas = new Rueda [4];
    private int i =0;
    //Constructor
    
    //Metodos
   
    public Vehiculo() {
    }

    public Vehiculo(String propietario, Motor objMotor, Rueda objRueda01, Rueda objRueda02, Rueda objRueda03, Rueda objRueda04) {
        this.propietario = propietario;
        this.objMotor = objMotor;
        
        
        
        
        
    }
   /*setRueda*/ public void setRueda(Rueda dato,int pos ){
    Lista_Ruedas[pos]=dato;
      
    }
  /*getRueda*/public Rueda getRueda(int pos) {
 return Lista_Ruedas[pos];
 }
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Motor getObjMotor() {
        return objMotor;
    }

    public void setObjMotor(Motor objMotor) {
        this.objMotor = objMotor;
    }

    
           
    
}
