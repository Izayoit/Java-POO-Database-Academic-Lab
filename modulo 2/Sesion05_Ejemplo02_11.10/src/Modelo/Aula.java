
package Modelo;


public class Aula {
    
   /* private Alumno[] arreglo;
    
    public Aula (int cantidad){
     arreglo = new Alumno[cantidad];
    } */
    private Alumno objAlumno01,objAlumno02,objAlumno03,objAlumno04;

    public Aula() {
    objAlumno01 = new Alumno("","");
    objAlumno02 = new Alumno("Paredes","Luis");
    objAlumno03 = new Alumno("","");
    objAlumno04 = new Alumno("","");
    }

    public Alumno getObjAlumno01() {
        return objAlumno01;
    }

    public void setObjAlumno01(Alumno objAlumno01) {
        this.objAlumno01 = objAlumno01;
    }

    public Alumno getObjAlumno02() {
        return objAlumno02;
    }

    public void setObjAlumno02(Alumno objAlumno02) {
        this.objAlumno02 = objAlumno02;
    }

    public Alumno getObjAlumno03() {
        return objAlumno03;
    }

    public void setObjAlumno03(Alumno objAlumno03) {
        this.objAlumno03 = objAlumno03;
    }

    public Alumno getObjAlumno04() {
        return objAlumno04;
    }

    public void setObjAlumno04(Alumno objAlumno04) {
        this.objAlumno04 = objAlumno04;
    }
    
    
}
