
package modelo;


public class profesor extends usuario{
    protected String docente;

    public profesor(String docente, String nombre, String idUsuario) {
        super(nombre, idUsuario);
        this.docente = docente;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    

    @Override
   public String MostrarDatos(){
   return "nombre: "+nombre+" \nIdUsiario: "+idUsuario+"\ndocente: "+docente;
   }
    
    
}
