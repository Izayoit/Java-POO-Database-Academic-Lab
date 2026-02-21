package Control;

public class Arreglo_Jugadores {

    private String[][] lista_Jugadores;
    private int i = 0;

    public Arreglo_Jugadores() {
        lista_Jugadores = new String[9][2];
    }

    public boolean agregarJugadores(String nombre, String apellido) {
        if (i < lista_Jugadores.length) {            
                 lista_Jugadores[i][0] = nombre;
                 lista_Jugadores[i][1] = apellido;
                 i++;
                 return true; 
        }
        return false;
}
    public String[][] obtenerJugadores(){
     return lista_Jugadores;
}
    public int getCantidadJugadores() {
        return i; 
    }
}
       
