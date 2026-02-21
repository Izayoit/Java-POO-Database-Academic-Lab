package Control;

import Modelo_mantenimiento.persona;

import java.util.ArrayList;

public class Arreglo_personaAR {

    private ArrayList<persona> arreglo = new ArrayList<persona>();

    public void Agregar(persona dato) {
        arreglo.add(dato);
    }

    public persona getDato(int pos) {
        return arreglo.get(pos);

    }

    public void Eliminar(int pos) {
        arreglo.remove(pos);
    }

    public persona BuscarPersona(int idpersona) {
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if (idpersona == arreglo.get(pos).getIdpersona()) {
                return arreglo.get(pos);
            }
        }
        return null;
    }

}
