
package Modelo;


public class Especialidad {
    private String Especialidad;

    public Especialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public Object[]Registro(){
        Object[] registrar={Especialidad};
        return registrar;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    
}
