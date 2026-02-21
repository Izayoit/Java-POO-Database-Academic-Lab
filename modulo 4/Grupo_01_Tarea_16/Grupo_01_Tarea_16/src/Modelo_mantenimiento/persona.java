
package Modelo_mantenimiento;


public class persona {
 private int idpersona;
    private String tipo_persona;
    private String nombre;
    private String tipo_documento;
    private int num_documento;
    private String direccion;
    private int telefono;
    private String email;

    public persona() {
    }
    
public persona(Object[] Registro){
   idpersona =Integer.parseInt(Registro[0].toString());
    tipo_persona = Registro[1].toString();
    nombre= Registro[2].toString();
    tipo_documento = Registro[3].toString();
    num_documento= Integer.parseInt(Registro[4].toString());
    direccion = Registro[5].toString();
    telefono = Integer.parseInt(Registro[6].toString());
    email = Registro[7].toString();
    
}
public Object[] getRegistro(){
    return new Object[] {idpersona,tipo_persona,nombre,tipo_documento,num_documento,direccion,telefono,email};
}

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(int num_documento) {
        this.num_documento = num_documento;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

