
package modelo;

import java.security.Timestamp;


public class usuarios {
    private int id_usuario;
    private String Nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String fecha;
 
    public usuarios(){
        
    }
    
    public usuarios(Object[] Registro){
        id_usuario = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
        correo = Registro[2].toString();
        telefono =Registro[3].toString();
         direccion = Registro[4].toString();
         fecha = Registro[5].toString();
    }
    
    public Object[] getRegistro(){
        return new Object[]{id_usuario,Nombre,correo,telefono,direccion,fecha};
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
