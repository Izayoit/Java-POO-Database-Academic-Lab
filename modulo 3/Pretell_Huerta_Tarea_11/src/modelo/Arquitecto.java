
package modelo;

import java.text.DecimalFormat;


public class Arquitecto extends constructor {
    private int num_proyectos;
    private String cargo;
    
    private static int contador;

    public Arquitecto(String codigo, String apellido, String nombre, String cond_contrato, String especialidad, String afiliacion) {
        super(codigo, apellido, nombre, cond_contrato, especialidad, afiliacion);
    }

    public Arquitecto(int num_proyectos, String cargo, String codigo, String apellido, String nombre, String cond_contrato, String especialidad, String afiliacion) {
        super(codigo, apellido, nombre, cond_contrato, especialidad, afiliacion);
        this.num_proyectos = num_proyectos;
        this.cargo = cargo;
    }

   

    public int getNum_proyectos() {
        return num_proyectos;
    }

    public void setNum_proyectos(int num_proyectos) {
        this.num_proyectos = num_proyectos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arquitecto.contador = contador;
    }

    @Override
    public double sueldo_base() {
        if(getCond_contrato().equals("Estable")&&getEspecialidad().equals("restauracion y rehabilitacion")){
        return 4600;
        }else if(getCond_contrato().equals("Estable")&&getEspecialidad().equals("material de construccion")){
        return 7500;
        }else if(getCond_contrato().equals("Estable")&&getEspecialidad().equals("paisajismo y jardineria")){
        return 4860;
        }else if(getCond_contrato().equals("contratado")&&getEspecialidad().equals("restauracion y rehabilitacion")){
        return 3980;
        }else if(getCond_contrato().equals("contratado")&&getEspecialidad().equals("material de construccion")){
        return 4600;
        }else {
        return 4600;
        }
    }

    @Override
    public double descuento() {
    if(getAfiliacion().equals("AFP")){
    return sueldo_base()*afp;
    
    }else{return sueldo_base();}
    }

    @Override
    public double bonificacion() {
      if(cargo.equals("Director de obras")){
      return sueldo_base()*0.25;
      }else{
      return sueldo_base()*0.29;
      }
    }
    public String generarCodigo() {
      
        return String.format("ARQ%05d", Integer.valueOf(getCodigo()));
        
    }
 
    @Override
    public String MostrarInfo() {
        DecimalFormat df = new DecimalFormat("##0.00");
        return "\nNombres \t\t: " + getNombre()
                + "\nApellidos \t\t: " + getApellido()
                + "\nIngresos \t\t: " + df.format(sueldo_base())
                + "\ncodigo \t\t: " + generarCodigo()
                + "\nBonificaciones\t\t: " + df.format(bonificacion())
                + "\nDescuento\t\t: " + df.format(descuento())
                + "\nSueldo bruto\t\t: " + df.format(sueldo_bruto())
                + "\nSueldo neto\t\t: " + df.format(sueldo_neto())
                + "\nNum. proyectos\t\t: " + num_proyectos;
    }
    
    
}
