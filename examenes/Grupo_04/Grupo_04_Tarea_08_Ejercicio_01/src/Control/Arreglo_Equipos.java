package Control;

public class Arreglo_Equipos {
    private Arreglo_Jugadores[] equipos;
    private final int maxEquipos = 4;
    
  public Arreglo_Equipos() {
        equipos = new Arreglo_Jugadores[maxEquipos]; 
        for (int i = 0; i < maxEquipos; i++) {
            equipos[i] = new Arreglo_Jugadores(); 
        }
    }

    public boolean agregarJugadoraequipo(String nombre, String apellido, int indiceEquipo) {
        if (indiceEquipo >= 0 && indiceEquipo < maxEquipos) { 
            return equipos[indiceEquipo].agregarJugadores(nombre, apellido); 
        }
        return false; 
    }
    
    public boolean jugadorInscrito(String nombre, String apellido) {
        for (Arreglo_Jugadores equipo : equipos) {
            String[][] jugadores = equipo.obtenerJugadores();
            for (String[] jugador : jugadores) {
                if (jugador[0] != null && jugador[0].equals(nombre) && jugador[1] != null && jugador[1].equals(apellido)) {
                    return true; 
                }
            }
        }
        return false; 
    }

    
    public String[][] listarJugadoresDeEquipo(int indiceEquipo) {
        if (indiceEquipo >= 0 && indiceEquipo < maxEquipos) {
            return equipos[indiceEquipo].obtenerJugadores(); 
        }
        return new String[0][0]; 
    }
}    

