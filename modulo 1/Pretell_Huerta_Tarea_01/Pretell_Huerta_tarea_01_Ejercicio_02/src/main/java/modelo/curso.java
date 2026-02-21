
package modelo;

public class curso {
   
    String profesor_del_curso;
    String nombre_del_curso;
    int N_personas_inscritas;
    String local_y_lugar;
    int costos;
    String fecha;
    String Horario;

    public curso(String profesor_del_curso, String nombre_del_curso, int N_personas_inscritas, String local_y_lugar, int costos, String fecha, String Horario) {
        this.profesor_del_curso = profesor_del_curso;
        this.nombre_del_curso = nombre_del_curso;
        this.N_personas_inscritas = N_personas_inscritas;
        this.local_y_lugar = local_y_lugar;
        this.costos = costos;
        this.fecha = fecha;
        this.Horario = Horario;
    }

    public String getProfesor_del_curso() {
        return profesor_del_curso;
    }

    public void setProfesor_del_curso(String profesor_del_curso) {
        this.profesor_del_curso = profesor_del_curso;
    }

    public String getNombre_del_curso() {
        return nombre_del_curso;
    }

    public void setNombre_del_curso(String nombre_del_curso) {
        this.nombre_del_curso = nombre_del_curso;
    }

    public int getN_personas_inscritas() {
        return N_personas_inscritas;
    }

    public void setN_personas_inscritas(int N_personas_inscritas) {
        this.N_personas_inscritas = N_personas_inscritas;
    }

    public String getLocal_y_lugar() {
        return local_y_lugar;
    }

    public void setLocal_y_lugar(String local_y_lugar) {
        this.local_y_lugar = local_y_lugar;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
    
    
            
            
            
    
    
    
     
    
}
