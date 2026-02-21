
package Modelo;


public class Doctor {
    private String Doctor;

    public Doctor(String Doctor) {
        this.Doctor = Doctor;
    }
    public Object[]Registro(){
        Object[] registrar={Doctor};
        return registrar;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }
    
    
}
