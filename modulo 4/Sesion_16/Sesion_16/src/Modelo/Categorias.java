package Modelo;

public class Categorias {

    private int idcategoria;
    private String nombre_categoria;
    private String descripcion_categoria;
    private String condicion_categoria;

    public Categorias() {
    }

    public Categorias(Object[] Registro) {
        idcategoria = Integer.parseInt(Registro[0].toString());
        nombre_categoria = Registro[1].toString();
        descripcion_categoria = Registro[2].toString();
        condicion_categoria = Registro[3].toString();
    }

    public Object[] getRegistro() {
        return new Object[]{idcategoria, nombre_categoria, descripcion_categoria, condicion_categoria};
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    public String getCondicion_categoria() {
        return condicion_categoria;
    }

    public void setCondicion_categoria(String condicion_categoria) {
        this.condicion_categoria = condicion_categoria;
    }

}
