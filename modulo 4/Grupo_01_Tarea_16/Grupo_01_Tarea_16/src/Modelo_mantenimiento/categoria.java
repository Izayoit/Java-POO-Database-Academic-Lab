package Modelo_mantenimiento;

public class categoria {

    private int idcategoria;
    private String nombre;
    private String descripcion;
    private int condicion; //transformar a int

    public categoria() {
    }

    public categoria(Object[] Registro) {
        idcategoria = Integer.parseInt(Registro[0].toString());
        nombre = Registro[1].toString();
        descripcion = Registro[2].toString();
        condicion = Integer.parseInt(Registro[3].toString());
    }

    public Object[] getRegistro() {
        return new Object[]{idcategoria, nombre, descripcion, condicion};
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

}
