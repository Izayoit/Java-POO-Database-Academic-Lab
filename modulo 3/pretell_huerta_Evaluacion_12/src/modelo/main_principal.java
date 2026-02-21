
package modelo;


public class main_principal {

   
    public static void main(String[] args) {
       
        comida objcomida = new carne(0, "altas", 0);
        comida objcomida2 = new tuberculo(0, "bajas", 0);
        
        System.out.println("se esta comprando una amburguesa"+objcomida.comer());
        System.out.println("se esta comprando un bistec " + objcomida2.comer());
}
    
}
