
package modelo;


public class pais {
    String pais ;
    int nume_poblacion;
    boolean mar;
    int num_departamentos;
    String continente;

    public pais(String pais, int nume_poblacion, boolean mar, int num_departamentos, String continente) {
        this.pais = pais;
        this.nume_poblacion = nume_poblacion;
        this.mar = mar;
        this.num_departamentos = num_departamentos;
        this.continente = continente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNume_poblacion() {
        return nume_poblacion;
    }

    public void setNume_poblacion(int nume_poblacion) {
        this.nume_poblacion = nume_poblacion;
    }

    public boolean isMar() {
        return mar;
    }

    public void setMar(boolean mar) {
        this.mar = mar;
    }

    public int getNum_departamentos() {
        return num_departamentos;
    }

    public void setNum_departamentos(int num_departamentos) {
        this.num_departamentos = num_departamentos;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    
}
