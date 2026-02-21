
package Modelo;


public class Hospital1 {
    private String PacienteArreglo,DoctorArreglo,EspecialidadArreglo,DiasArreglo,HorasArreglo;

    public Hospital1(String PacienteArreglo, String DoctorArreglo, String EspecialidadArreglo, String DiasArreglo, String HorasArreglo) {
        this.PacienteArreglo = PacienteArreglo;
        this.DoctorArreglo = DoctorArreglo;
        this.EspecialidadArreglo = EspecialidadArreglo;
        this.DiasArreglo = DiasArreglo;
        this.HorasArreglo = HorasArreglo;
    }
    public  Object [] registro(){
        Object[]registrar = {PacienteArreglo,DoctorArreglo,EspecialidadArreglo,DiasArreglo,HorasArreglo};
        return registrar;
    }

    public String getPacienteArreglo() {
        return PacienteArreglo;
    }

    public void setPacienteArreglo(String PacienteArreglo) {
        this.PacienteArreglo = PacienteArreglo;
    }

    public String getDoctorArreglo() {
        return DoctorArreglo;
    }

    public void setDoctorArreglo(String DoctorArreglo) {
        this.DoctorArreglo = DoctorArreglo;
    }

    public String getEspecialidadArreglo() {
        return EspecialidadArreglo;
    }

    public void setEspecialidadArreglo(String EspecialidadArreglo) {
        this.EspecialidadArreglo = EspecialidadArreglo;
    }

    public String getDiasArreglo() {
        return DiasArreglo;
    }

    public void setDiasArreglo(String DiasArreglo) {
        this.DiasArreglo = DiasArreglo;
    }

    public String getHorasArreglo() {
        return HorasArreglo;
    }

    public void setHorasArreglo(String HorasArreglo) {
        this.HorasArreglo = HorasArreglo;
    }
    
    
}
