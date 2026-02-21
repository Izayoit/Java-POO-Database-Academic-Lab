package Modelo;

public class Vehiculo {
    //Atributos
    private String propietario ;
    private Motor objMotor;
    private Rueda objRueda01, objRueda02 , objRueda03,objRueda04;
    //Constructor
    
    //Metodos
   
    public Vehiculo() {
    }

    public Vehiculo(String propietario, Motor objMotor, Rueda objRueda01, Rueda objRueda02, Rueda objRueda03, Rueda objRueda04) {
        this.propietario = propietario;
        this.objMotor = objMotor;
        this.objRueda01 = objRueda01;
        this.objRueda02 = objRueda02;
        this.objRueda03 = objRueda03;
        this.objRueda04 = objRueda04;
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

    public Rueda getObjRueda01() {
        return objRueda01;
    }

    public void setObjRueda01(Rueda objRueda01) {
        this.objRueda01 = objRueda01;
    }

    public Rueda getObjRueda02() {
        return objRueda02;
    }

    public void setObjRueda02(Rueda objRueda02) {
        this.objRueda02 = objRueda02;
    }

    public Rueda getObjRueda03() {
        return objRueda03;
    }

    public void setObjRueda03(Rueda objRueda03) {
        this.objRueda03 = objRueda03;
    }

    public Rueda getObjRueda04() {
        return objRueda04;
    }

    public void setObjRueda04(Rueda objRueda04) {
        this.objRueda04 = objRueda04;
    }
    
           
    
}
