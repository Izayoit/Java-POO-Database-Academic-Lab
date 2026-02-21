
package modelo;


public class zoologico {
    int N_animales;
    int  N_especies;
    String pais;
    boolean medidadas_seguridad;
    int N_trabajadores;

    public zoologico(int N_animales, int N_especies, String pais, boolean medidadas_seguridad, int N_trabajadores) {
        this.N_animales = N_animales;
        this.N_especies = N_especies;
        this.pais = pais;
        this.medidadas_seguridad = medidadas_seguridad;
        this.N_trabajadores = N_trabajadores;
    }

    public int getN_animales() {
        return N_animales;
    }

    public void setN_animales(int N_animales) {
        this.N_animales = N_animales;
    }

    public int getN_especies() {
        return N_especies;
    }

    public void setN_especies(int N_especies) {
        this.N_especies = N_especies;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isMedidadas_seguridad() {
        return medidadas_seguridad;
    }

    public void setMedidadas_seguridad(boolean medidadas_seguridad) {
        this.medidadas_seguridad = medidadas_seguridad;
    }

    public int getN_trabajadores() {
        return N_trabajadores;
    }

    public void setN_trabajadores(int N_trabajadores) {
        this.N_trabajadores = N_trabajadores;
    }

    

   
    
}
