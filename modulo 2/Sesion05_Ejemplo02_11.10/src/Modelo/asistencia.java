
package Modelo;


public class asistencia {
    private int lunes, martes, miercoles, jueves, viernes;

    public asistencia() {
        lunes = martes = miercoles = jueves = viernes =0;
    }
 public asistencia(int valor) {
        lunes = martes = miercoles = jueves = viernes =valor;
    }
    public int getLunes() {
        return lunes;
    }

    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    public int getMartes() {
        return martes;
    }

    public void setMartes(int martes) {
        this.martes = martes;
    }

    public int getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    public int getJueves() {
        return jueves;
    }

    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    public int getViernes() {
        return viernes;
    }

    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    
    
    
            
    
}
