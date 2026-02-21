
package Modelo;


public class Paciente {
    private String Paciente;

    public Paciente(String Paciente) {
        this.Paciente = Paciente;
    }

    
    public Object[]Registro(){
        Object[] registrar={Paciente};
        return registrar;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    
    

    
    
}
