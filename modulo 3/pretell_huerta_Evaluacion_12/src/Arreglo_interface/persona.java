
package Arreglo_interface;


public class persona implements InterfacePersona{
   private int DineroAhorrado; 
   private int FondoPension;
   private String Nombres;
   private String apellido;

    public persona(int DineroAhorrado, int FondoPension, String Nombres, String apellido) {
        this.DineroAhorrado = DineroAhorrado;
        this.FondoPension = FondoPension;
        this.Nombres = Nombres;
        this.apellido = apellido;
    }

    public Object[] getregistro(){
    return new Object[]{Nombres,apellido,DineroAhorrado,FondoPension};
    
    }
            
    
    public int getDineroAhorrado() {
        return DineroAhorrado;
    }

    public void setDineroAhorrado(int DineroAhorrado) {
        this.DineroAhorrado = DineroAhorrado;
    }

    public int getFondoPension() {
        return FondoPension;
    }

    public void setFondoPension(int FondoPension) {
        this.FondoPension = FondoPension;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int calcularRiqueza() {
        return DineroAhorrado +FondoPension;
    }

    @Override
    public String getNombre() {
      return Nombres + apellido;
    }
   public String mostrardatos(){
   return   "nombre completo:"+Nombres+"\n"
           +"calcular riqueza:" +calcularRiqueza()+"\n";
           
   }
   
   
   
}
