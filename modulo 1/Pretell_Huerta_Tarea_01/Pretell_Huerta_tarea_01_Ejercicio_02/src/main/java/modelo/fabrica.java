
package modelo;

public class fabrica {
  
    String nombre_fabrica;
    int N_trabajadores;
    boolean medidas_de_seguridad;
    String nombre_presidente ;
    int año_fundacion;

    public fabrica(String nombre_fabrica, int N_trabajadores, boolean medidas_de_seguridad, String nombre_presidente, int año_fundacion) {
        this.nombre_fabrica = nombre_fabrica;
        this.N_trabajadores = N_trabajadores;
        this.medidas_de_seguridad = medidas_de_seguridad;
        this.nombre_presidente = nombre_presidente;
        this.año_fundacion = año_fundacion;
    }

    public String getNombre_fabrica() {
        return nombre_fabrica;
    }

    public void setNombre_fabrica(String nombre_fabrica) {
        this.nombre_fabrica = nombre_fabrica;
    }

    public int getN_trabajadores() {
        return N_trabajadores;
    }

    public void setN_trabajadores(int N_trabajadores) {
        this.N_trabajadores = N_trabajadores;
    }

    public boolean isMedidas_de_seguridad() {
        return medidas_de_seguridad;
    }

    public void setMedidas_de_seguridad(boolean medidas_de_seguridad) {
        this.medidas_de_seguridad = medidas_de_seguridad;
    }

    public String getNombre_presidente() {
        return nombre_presidente;
    }

    public void setNombre_presidente(String nombre_presidente) {
        this.nombre_presidente = nombre_presidente;
    }

    public int getAño_fundacion() {
        return año_fundacion;
    }

    public void setAño_fundacion(int año_fundacion) {
        this.año_fundacion = año_fundacion;
    }
    

}