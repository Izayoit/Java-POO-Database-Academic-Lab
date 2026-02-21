
package Modelo;


public class Clientes {
   private int idcliente;
   private String cliente;
   private String nombre_cliente;
   private String documento_cliente;
   private String num_doc_cliente;
   private String direccion_cliente;
   private String telefono_cliente;
   private String email_cliente;

    public Clientes() {
    }
   
    public Clientes(Object[] Registro){
    idcliente= Integer.parseInt(Registro[0].toString());
    cliente = Registro[1].toString();
    nombre_cliente = Registro[2].toString();
    documento_cliente = Registro[3].toString();
    num_doc_cliente = Registro[4].toString();
    direccion_cliente = Registro[5].toString();
    telefono_cliente = Registro[6].toString();
    email_cliente = Registro[7].toString();
    
    }
    
    public Object[] getRegistro(){
    return new Object[]{idcliente, cliente, nombre_cliente, documento_cliente, num_doc_cliente, direccion_cliente, telefono_cliente, email_cliente};
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDocumento_cliente() {
        return documento_cliente;
    }

    public void setDocumento_cliente(String documento_cliente) {
        this.documento_cliente = documento_cliente;
    }

    public String getNum_doc_cliente() {
        return num_doc_cliente;
    }

    public void setNum_doc_cliente(String num_doc_cliente) {
        this.num_doc_cliente = num_doc_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
   
}
