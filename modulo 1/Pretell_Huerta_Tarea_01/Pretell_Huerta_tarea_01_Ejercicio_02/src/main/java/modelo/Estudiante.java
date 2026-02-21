
package modelo;

public class Estudiante {
    //atributos de la clase 
    String nombre_completo;
    int num_dni;
    String genero;
    int edad ;
    int num_telf;

    public Estudiante(String nombre_completo, int num_dni, String genero, int edad, int num_telf) {
        this.nombre_completo = nombre_completo;
        this.num_dni = num_dni;
        this.genero = genero;
        this.edad = edad;
        this.num_telf = num_telf;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getNum_dni() {
        return num_dni;
    }

    public void setNum_dni(int num_dni) {
        this.num_dni = num_dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum_telf() {
        return num_telf;
    }

    public void setNum_telf(int num_telf) {
        this.num_telf = num_telf;
    }

    
    

  
        
        
    
    }
    
  
    

