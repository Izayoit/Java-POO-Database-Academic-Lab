
package modelo;


public class libro {
    String autor;
    String titulo;
    int año_publicacion;

    public libro(String autor, String titulo, int año_publicacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.año_publicacion = año_publicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }
    
    
    
           
    
}
