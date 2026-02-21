
package modelo;


public class predio {
    private int codigo;
    private String Direccion;
    private propietario objpropietario;

    public predio() {
        objpropietario = new propietario();
        
    }
    
    public predio(int codigo, String Direccion) {
        this.codigo = codigo;
        this.Direccion = Direccion;
        objpropietario = new propietario();
         objpropietario = new propietario();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public propietario getObjpropietario() {
        return objpropietario;
    }

    public void setObjpropietario(propietario objpropietario) {
        this.objpropietario = objpropietario;
    }
    
    
    
    
}
