package Modelo;

public class Producto {
    private int Codigo;
    private String Descripcion;
    private double Precio;
    
        public Producto(Object[] Registro){
        Codigo = Integer.parseInt(Registro[0].toString());
        Descripcion = Registro[1].toString();
        Precio = Double.parseDouble(Registro[2].toString());
    }
    
    public Object[] getRegistro(){
        //return new Object[]{Codigo,Descripcion,Precio};
        Object[] Registro = {Codigo,Descripcion,Precio};
        return Registro;
        
    }
    
    
public String getCadena(){
 String cadena = Codigo +","+Descripcion + ","+Precio;
 return cadena;
}
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}
