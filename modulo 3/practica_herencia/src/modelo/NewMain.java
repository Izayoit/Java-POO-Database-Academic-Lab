
package modelo;


public class NewMain {

    public static void main(String[] args) {
        vehiculo a = new auto("AW42");
        vehiculo b = new moto("GFA4");
        vehiculo c = new camion("F8JW", 3);
        System.out.println("informacion de auto");
        a.mostrarInformacion();
        System.out.println(a.calcularpasaje());
        System.out.println("informacion de moto");
        b.mostrarInformacion();
        System.out.println(b.calcularpasaje());
        System.out.println("informacion de camion");
        c.mostrarInformacion();
        System.out.println(c.calcularpasaje());
        
      
    }
    
}
