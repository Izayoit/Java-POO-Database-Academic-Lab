
package Modelo;


public class Dias {
    private String Dias;

    public Dias(String Dias) {
        this.Dias = Dias;
    }
    public Object[]Registro(){
        Object[] registrar={Dias};
        return registrar;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String Dias) {
        this.Dias = Dias;
    }
    
    
}
