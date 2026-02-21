package Modelo;

public class Producto {
    private int codigo;

    public Producto(int codigo) {
        this.codigo = codigo;
    }
    
    public Object[] Registro(){
        Object[] registrar = {codigo};
        return registrar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
