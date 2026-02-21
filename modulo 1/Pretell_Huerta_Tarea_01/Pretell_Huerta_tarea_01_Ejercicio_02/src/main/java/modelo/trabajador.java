
package modelo;

public class trabajador {
    String usuario;
    int pago_mensual;
    int edad;
    int dni;
    int num_telf;
    String direccion;
    String genero;
    String experiencia_lab;

    public trabajador(String usuario, int pago_mensual, int edad, int dni, int num_telf, String direccion, String genero, String experiencia_lab) {
        this.usuario = usuario;
        this.pago_mensual = pago_mensual;
        this.edad = edad;
        this.dni = dni;
        this.num_telf = num_telf;
        this.direccion = direccion;
        this.genero = genero;
        this.experiencia_lab = experiencia_lab;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPago_mensual() {
        return pago_mensual;
    }

    public void setPago_mensual(int pago_mensual) {
        this.pago_mensual = pago_mensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNum_telf() {
        return num_telf;
    }

    public void setNum_telf(int num_telf) {
        this.num_telf = num_telf;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getExperiencia_lab() {
        return experiencia_lab;
    }

    public void setExperiencia_lab(String experiencia_lab) {
        this.experiencia_lab = experiencia_lab;
    }
    

    
    
    
    
}
