package Modelo;

public class Bosque {
    private Arbol objArbol01;
    private Arbol objArbol02;
    private Arbol objArbol03;
    
    public Bosque(){
        objArbol01 = new Arbol("Árbol 01");
        objArbol02 = new Arbol("Árbol 02");
        objArbol03 = new Arbol("Árbol 03");
    }

    public Arbol getObjArbol01() { return objArbol01; }
    public Arbol getObjArbol02() { return objArbol02; }
    public Arbol getObjArbol03() { return objArbol03; }        
}
