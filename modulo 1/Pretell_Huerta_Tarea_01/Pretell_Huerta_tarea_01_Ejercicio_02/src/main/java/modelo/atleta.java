
package modelo;


public class atleta {
    String tipo_sangre;
    int N_dni;
    String genero;
    String nombre_completo;
    int N_telefono;

    public atleta(String tipo_sangre, int N_dni, String genero, String nombre_completo, int N_telefono) {
        this.tipo_sangre = tipo_sangre;
        this.N_dni = N_dni;
        this.genero = genero;
        this.nombre_completo = nombre_completo;
        this.N_telefono = N_telefono;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public int getN_dni() {
        return N_dni;
    }

    public void setN_dni(int N_dni) {
        this.N_dni = N_dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getN_telefono() {
        return N_telefono;
    }

    public void setN_telefono(int N_telefono) {
        this.N_telefono = N_telefono;
    }
    
    
}
