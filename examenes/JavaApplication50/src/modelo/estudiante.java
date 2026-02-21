
package modelo;


public class estudiante extends usuario{
  protected int ciclo;

    public estudiante(String nombre, String idUsuario, int ciclo) {
        super(nombre, idUsuario);
        this.ciclo = ciclo;
    }

    public int getMatricula() {
        return ciclo;
    }

    public void setMatricula(int matricula) {
        this.ciclo = matricula;
    }

  
  @Override
    public String MostrarDatos(){
     return "nombre: "+nombre+" \nIdUsiario: "+idUsuario+"\nCiclo: "+ciclo;
    
    }
  
   
}
