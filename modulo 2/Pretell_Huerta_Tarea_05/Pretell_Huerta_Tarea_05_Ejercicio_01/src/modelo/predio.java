    
package modelo;

public class predio {
    private int codigo;
    private String direccion;
 private propietario objpropietario01;

    public predio() {
        objpropietario01 = new  propietario();
        
        
    }
 
    public predio(int codigo, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
       objpropietario01 = new  propietario();
    }

    public propietario getObjpropietario01() {
        return objpropietario01;
    }

    public void setObjpropietario01(propietario objpropietario01) {
        this.objpropietario01 = objpropietario01;
    }

    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    
    
    
}
