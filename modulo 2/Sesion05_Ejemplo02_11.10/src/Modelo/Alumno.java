
package Modelo;


public class Alumno {
    private String Apellidos, Nombres;
    private asistencia objAsistencia01, objAsistencia02,objAsistencia03,objAsistencia04;

    public Alumno() {
       Apellidos =Nombres = "";
       objAsistencia01 = new asistencia();
       objAsistencia02 = new asistencia();
       objAsistencia03 = new asistencia();
       objAsistencia04 = new asistencia();
    }
  public Alumno(String Apellidos ,String Nombres){
  
  this.Apellidos = Apellidos;
  this.Nombres  =  Nombres; 
       objAsistencia01 = new asistencia();
       objAsistencia02 = new asistencia();
       objAsistencia03 = new asistencia();
       objAsistencia04 = new asistencia();
       
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

    public asistencia getObjAsistencia01() {
        return objAsistencia01;
    }

    public void setObjAsistencia01(asistencia objAsistencia01) {
        this.objAsistencia01 = objAsistencia01;
    }

    public asistencia getObjAsistencia02() {
        return objAsistencia02;
    }

    public void setObjAsistencia02(asistencia objAsistencia02) {
        this.objAsistencia02 = objAsistencia02;
    }

    public asistencia getObjAsistencia03() {
        return objAsistencia03;
    }

    public void setObjAsistencia03(asistencia objAsistencia03) {
        this.objAsistencia03 = objAsistencia03;
    }

    public asistencia getObjAsistencia04() {
        return objAsistencia04;
    }

    public void setObjAsistencia04(asistencia objAsistencia04) {
        this.objAsistencia04 = objAsistencia04;
    }

    
    
    
    
    
    
    
}
