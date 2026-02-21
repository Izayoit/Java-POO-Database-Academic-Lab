package Modelo;

public class Alumno {
    private String Apellidos, Nombres;
    private Asistencia objAsistencia01, objAsistencia02, objAsistencia03, objAsistencia04;

    public Alumno() {
        Apellidos = Nombres = "";
        objAsistencia01 = new Asistencia();
        objAsistencia02 = new Asistencia();
        objAsistencia03 = new Asistencia();
        objAsistencia04 = new Asistencia();
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Asistencia getObjAsistencia01() {
        return objAsistencia01;
    }

    public void setObjAsistencia01(Asistencia objAsistencia01) {
        this.objAsistencia01 = objAsistencia01;
    }

    public Asistencia getObjAsistencia02() {
        return objAsistencia02;
    }

    public void setObjAsistencia02(Asistencia objAsistencia02) {
        this.objAsistencia02 = objAsistencia02;
    }

    public Asistencia getObjAsistencia03() {
        return objAsistencia03;
    }

    public void setObjAsistencia03(Asistencia objAsistencia03) {
        this.objAsistencia03 = objAsistencia03;
    }

    public Asistencia getObjAsistencia04() {
        return objAsistencia04;
    }

    public void setObjAsistencia04(Asistencia objAsistencia04) {
        this.objAsistencia04 = objAsistencia04;
    }

    
}
