
package modelo;


public class visitante extends usuario{
    protected String motivo;

    public visitante(String motivo, String nombre, String idUsuario) {
        super(nombre, idUsuario);
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
   
    
    
    @Override
    public String MostrarDatos(){
        return "nombre: "+nombre+" \nIdUsiario: "+idUsuario+"\nmotivo: "+motivo;
    
    }
}
