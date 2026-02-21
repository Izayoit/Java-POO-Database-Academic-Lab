
package modelo;


public class Empleado {
    private int CodigoEmpleado;
   private String nombreEmpleado , apellidoEmpleado;

    public Empleado() {
       
        
    }
  

    public Empleado(int CodigoEmpleado, String nombreEmpleado, String apellidoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public int getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(int CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
   
    
    
}
