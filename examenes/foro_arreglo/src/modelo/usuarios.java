
package modelo;


public class usuarios {
  private String nombre;
  private String apellido;
  private int dni;
  private int edad;
  private String genero;
  private String region;
  private String tipo_de_internet;

    public usuarios(String nombre, String apellido, int dni, int edad, String genero, String region, String tipo_de_internet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.genero = genero;
        this.region = region;
        this.tipo_de_internet = tipo_de_internet;
    }
    public Object[] getRegistro(){
    Object[] dato ={getNombre(),getApellido(),getDni(),getEdad(),getGenero(),getRegion(),getTipo_de_internet()};
        return dato;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTipo_de_internet() {
        return tipo_de_internet;
    }

    public void setTipo_de_internet(String tipo_de_internet) {
        this.tipo_de_internet = tipo_de_internet;
    }
  
  
  
    
    
    
    
    
    
}
