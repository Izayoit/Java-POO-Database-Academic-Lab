
package Modelo;


public class Articulos {
    private int idarticulo;
    private int idcategoria;
    private String codigo_articulo;
    private String nombre_articulo;
    private int Stock_articulo;
    private String descripcion_articulo;
    private String imagen_articulo;
    private String estado_artticulo;

    public Articulos() {
    }
    
    public Articulos(Object[] Registro){
    idarticulo = Integer.parseInt(Registro[0].toString());
    idcategoria = Integer.parseInt(Registro[1].toString());
    codigo_articulo = Registro[2].toString();
    nombre_articulo= Registro[3].toString();
    Stock_articulo= Integer.parseInt(Registro[4].toString());
    descripcion_articulo = Registro[5].toString();
    imagen_articulo=Registro[6].toString();
    estado_artticulo=Registro[7].toString();
    }
     public Object[] getRegistro(){
     return new Object[]{idarticulo, idcategoria, codigo_articulo, nombre_articulo, Stock_articulo, descripcion_articulo, imagen_articulo, estado_artticulo};
     }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCodigo_articulo() {
        return codigo_articulo;
    }

    public void setCodigo_articulo(String codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public String getNombre_articulo() {
        return nombre_articulo;
    }

    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }

    public int getStock_articulo() {
        return Stock_articulo;
    }

    public void setStock_articulo(int Stock_articulo) {
        this.Stock_articulo = Stock_articulo;
    }

    public String getDescripcion_articulo() {
        return descripcion_articulo;
    }

    public void setDescripcion_articulo(String descripcion_articulo) {
        this.descripcion_articulo = descripcion_articulo;
    }

    public String getImagen_articulo() {
        return imagen_articulo;
    }

    public void setImagen_articulo(String imagen_articulo) {
        this.imagen_articulo = imagen_articulo;
    }

    public String getEstado_artticulo() {
        return estado_artticulo;
    }

    public void setEstado_artticulo(String estado_artticulo) {
        this.estado_artticulo = estado_artticulo;
    }
     
     
}
