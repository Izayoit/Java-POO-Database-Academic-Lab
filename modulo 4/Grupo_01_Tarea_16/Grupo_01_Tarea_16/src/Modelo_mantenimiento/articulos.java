
package Modelo_mantenimiento;


public class articulos {
    private int idArticulos;
    private int idcategoria;
    private String codigo;
    private String nombre;
    private int Stock;
    private String descripcion;
    private String imagen;
    private String estado;
 
public articulos(){}
    public articulos(int idArticulos, String codigo, String nombre, int Stock, String descripcion, String imagen, String estado, int idcategoria) {
        this.idArticulos = idArticulos;
        this.codigo = codigo;
        this.nombre = nombre;
        this.Stock = Stock;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estado = estado;
        this.idcategoria = idcategoria;
    }
    public articulos(Object[] Registro) {
        idArticulos = Integer.parseInt(Registro[0].toString());  
        idcategoria = Integer.parseInt(Registro[1].toString());
        codigo = Registro[2].toString();
        nombre = Registro[3].toString();
        Stock = Integer.parseInt(Registro[4].toString());
        descripcion = Registro[5].toString();
        imagen = Registro[6].toString();
        estado = Registro[7].toString();
     
    
}
    public Object[] getRegistro(){
        return new Object[]{idArticulos,codigo,nombre,Stock,descripcion,imagen,estado,idcategoria};
    }

    public int getIdArticulos() {
        return idArticulos;
    }

    public void setIdArticulos(int idArticulos) {
        this.idArticulos = idArticulos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

   
    
    
}