
package modelo;


public class evento {
    private int codigo,costo;
    private String tipo;
   private local objlocal;
    private cliente objcliente;
    

    public evento() {
        objlocal = new local();
        objcliente = new cliente();
        
        
    }

    public evento(int codigo, int costo) {
        this.codigo = codigo;
        this.costo = costo;
         objlocal = new  local();
        objcliente = new  cliente();
        
    }

    public local getObjlocal() {
        return objlocal;
    }

    public void setObjlocal(local objlocal) {
        this.objlocal = objlocal;
    }

    public cliente getObjcliente() {
        return objcliente;
    }

    public void setObjcliente(cliente objcliente) {
        this.objcliente = objcliente;
    }

    

  

    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    
    
    
    
    
}
