
package Modelo;


public class Proveedor {
     private int idproveedor;
   private String proveedor;
   private String nombre_proveedor;
   private String documento_proveedor;
   private String num_doc_proveedor;
   private String direccion_proveedor;
   private String telefono_proveedor;
   private String email_proveedor;

    public Proveedor() {
    }
    public Proveedor(Object[] Registro){
      idproveedor= Integer.parseInt(Registro[0].toString());
    proveedor = Registro[1].toString();
    nombre_proveedor = Registro[2].toString();
    documento_proveedor = Registro[3].toString();
    num_doc_proveedor = Registro[4].toString();
    direccion_proveedor = Registro[5].toString();
    telefono_proveedor= Registro[6].toString();
    email_proveedor = Registro[7].toString();
    }
    public Object[] getRegistro(){
    return new Object[]{idproveedor, proveedor, nombre_proveedor, documento_proveedor, num_doc_proveedor, direccion_proveedor, telefono_proveedor, email_proveedor};
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDocumento_proveedor() {
        return documento_proveedor;
    }

    public void setDocumento_proveedor(String documento_proveedor) {
        this.documento_proveedor = documento_proveedor;
    }

    public String getNum_doc_proveedor() {
        return num_doc_proveedor;
    }

    public void setNum_doc_proveedor(String num_doc_proveedor) {
        this.num_doc_proveedor = num_doc_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }

    public String getEmail_proveedor() {
        return email_proveedor;
    }

    public void setEmail_proveedor(String email_proveedor) {
        this.email_proveedor = email_proveedor;
    }
    
}
