
package Modelo;


public class Usuarios {
   private int idusuario;
   private String nombre_usuario;
   private String email_usuario;
   private String password_usuario;
   
   public Usuarios(){
   }
        public Usuarios(Object[] Registro){
        idusuario = Integer.parseInt(Registro[0].toString());
        nombre_usuario = Registro[1].toString();
        email_usuario= Registro[2].toString();
        password_usuario = Registro[3].toString();
        }
         public Object[] getRegistro(){
           return new Object[]{idusuario, nombre_usuario, email_usuario, password_usuario};
         }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }
         
}
