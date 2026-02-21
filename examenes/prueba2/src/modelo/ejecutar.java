
package modelo;

public class ejecutar {

    
    public static void main(String[] args) {
         vehiculo misvehiculos[] = new vehiculo[4];
         
         misvehiculos[0] = new vehiculo("7GYT", "toyota", "40D");
         misvehiculos[1] = new VehiculoDeportivo(40, "7POH", "toyota", "40O");
         misvehiculos[2] = new VehiculoTurismo(4, "6BH7H", "nissan", "34D");
         misvehiculos[3] = new Vehiculofurgoneta(40, "7OPFR4", "auidi", "50F");
         
         for(vehiculo vehiculos : misvehiculos){
             System.out.println(vehiculos.mostrardatos());
             System.out.println("");
         }
    }
    
    
}