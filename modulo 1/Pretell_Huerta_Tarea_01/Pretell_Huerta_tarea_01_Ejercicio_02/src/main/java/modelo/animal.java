
package modelo;

public class animal {
    String especie;
    String nombre;
    boolean domestico;
    String color;
    String genero;

    public animal(String especie, String nombre, boolean domestico, String color, String genero) {
        this.especie = especie;
        this.nombre = nombre;
        this.domestico = domestico;
        this.color = color;
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
