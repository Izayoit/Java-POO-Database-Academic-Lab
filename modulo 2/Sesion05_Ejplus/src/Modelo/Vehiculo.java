package Modelo;

public class Vehiculo {
    //Atributos
    private String propitario;
    private Motor objMotor;
    private Rueda[] lista_Ruedas = new Rueda[4];
    private int i = 0;
    //Constructor
    public Vehiculo() {
    }
    public Vehiculo(String propitario, Motor objMotor) {
        this.propitario = propitario;
        this.objMotor = objMotor;
    }    
    //Metodos
    
    public Rueda getRueda(int pos){
        return lista_Ruedas[pos];
    }
    
    public void setRueda(Rueda dato, int pos){
        lista_Ruedas[pos] = dato;
    }
    
    public String getPropitario() {
        return propitario;
    }
    
    public void setPropitario(String propitario) {
        this.propitario = propitario;
    }

    public Motor getObjMotor() {
        return objMotor;
    }

    public void setObjMotor(Motor objMotor) {
        this.objMotor = objMotor;
    }

    

   

    
           
    
}
