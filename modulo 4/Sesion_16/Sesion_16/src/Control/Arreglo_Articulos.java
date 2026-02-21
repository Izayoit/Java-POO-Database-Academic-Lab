package Control;

import Modelo.Articulos;
import java.util.ArrayList;

public class Arreglo_Articulos {

   /* private Articulos[] arreglo;
    private int i = 0;

    public Arreglo_Articulos(int size) {
        arreglo = new Articulos[size];
    }

    public void Agregar(Articulos dato) {
        arreglo[i] = dato;
        i++;
    }

    public Articulos getDato(int pos) {
        return arreglo[pos];
    }

    public Articulos BuscarCodigo(int CodArticulo) {
        for (int pos = 0; pos < i; pos++) {
            if (String.valueOf(CodArticulo).equals(arreglo[pos].getCodigo_articulo())) {
                return arreglo[pos];
            }
        }
        return null;
    }*/
 private ArrayList<Articulos> arreglo = new ArrayList<Articulos>();
    
    public void Agregar(Articulos dato){
        arreglo.add(dato);
    }
    
    public Articulos getDato(int pos){
        return arreglo.get(pos);
    }
    
    public void Eliminar(int pos){
        arreglo.remove(pos);
    }
    
    public void Reiniciar(){
        arreglo = new ArrayList<Articulos>();
    }
    
    public Articulos BuscarCodigo(int codarticulo){
        for (int pos = 0; pos < arreglo.size(); pos++) {
            if(codarticulo == arreglo.get(pos).getIdarticulo()){
                return arreglo.get(pos);
            }
        }
        return null;
    }
}
