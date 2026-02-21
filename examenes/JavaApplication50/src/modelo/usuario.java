
package modelo;

public class usuario {
    protected String nombre;
    protected String idUsuario;

    public usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    public String MostrarDatos(){
    return "nombre:"+nombre+"\nIdUsiario:"+idUsuario;
        
    }
}
