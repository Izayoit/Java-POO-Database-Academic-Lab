
package Modelo;


public class Horas {
    private String Horas;

    public Horas(String Horas) {
        this.Horas = Horas;
    }
    public Object[]Registro(){
        Object[] registrar={Horas};
        return registrar;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String Horas) {
        this.Horas = Horas;
    }
    
}
