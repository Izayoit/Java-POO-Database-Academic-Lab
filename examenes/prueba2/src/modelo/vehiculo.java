
package modelo;

public class vehiculo {
    
   protected String matricula;
   protected String marca;
   protected String modelo;

    public vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
   
   public String mostrardatos (){
       return "matricula: "+ matricula+
               "\nmarca: " + marca+
               "\nmodelo " + modelo
               
               ;
       
   }
          
    
    
    
    
}
