
package modelo;

import java.text.DecimalFormat;


public abstract class constructor implements descuento{
    private String codigo;
    private String apellido;
    private String nombre;
    private String cond_contrato;
    private String especialidad;
    private String afiliacion;

    public constructor(String codigo, String apellido, String nombre, String cond_contrato, String especialidad, String afiliacion) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cond_contrato = cond_contrato;
        this.especialidad = especialidad;
        this.afiliacion = afiliacion;
    }
  public Object[] getRegistro() {
        return new Object[]{ nombre, apellido};
    }
    
    
    public abstract double sueldo_base();
    
    public abstract double descuento();
    
    public abstract double bonificacion();
    
    public double sueldo_bruto(){
    return sueldo_base()+bonificacion();
    }
    
    public double sueldo_neto(){
    return sueldo_bruto()-descuento();
    }
   
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCond_contrato() {
        return cond_contrato;
    }

    public void setCond_contrato(String cond_contrato) {
        this.cond_contrato = cond_contrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
    
    public  abstract String MostrarInfo();
    
    
}
