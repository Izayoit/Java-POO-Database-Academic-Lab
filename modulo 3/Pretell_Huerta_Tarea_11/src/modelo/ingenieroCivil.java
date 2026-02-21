package modelo;

import java.text.DecimalFormat;

public class ingenieroCivil extends constructor {

    private String tipo_actividad;
    private int Num_obras;
    private static int contador;

    public ingenieroCivil(String codigo, String apellido, String nombre, String cond_contrato, String especialidad, String afiliacion) {
        super(codigo, apellido, nombre, cond_contrato, especialidad, afiliacion);
    }

    public ingenieroCivil(String tipo_actividad, int Num_obras, String codigo, String apellido, String nombre, String cond_contrato, String especialidad, String afiliacion) {
        super(codigo, apellido, nombre, cond_contrato, especialidad, afiliacion);
        this.tipo_actividad = tipo_actividad;
        this.Num_obras = Num_obras;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public int getNum_obras() {
        return Num_obras;
    }

    public void setNum_obras(int Num_obras) {
        this.Num_obras = Num_obras;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        ingenieroCivil.contador = contador;
    }

    @Override
    public double sueldo_base() {
        if (getCond_contrato().equals("Estable") && tipo_actividad.equals("supervision de obras")) {
            return 4000;
        } else if (getCond_contrato().equals("Estable") && tipo_actividad.equals("supervision de vias")) {
            return 6000;
        } else if (getCond_contrato().equals("contratado") && tipo_actividad.equals("supervision de obras")) {
            return 2000;
        } else {
            return 4500;
        }

    }

    @Override
    public double descuento() {
        if (getAfiliacion().equals("AFP")) {
            return sueldo_base() * afp;
        } else {
            return sueldo_base() * Essalud;
        }

    }

    @Override
    public double bonificacion() {
        if (getEspecialidad().equals("Estructura")) {
            return sueldo_base() * 0.16;
        } else if (getEspecialidad().equals("recursos hidricos")) {
            return sueldo_base() * 0.18;
        } else {
            return sueldo_base() * 0.22;
        }

    }

    public String generarCodigo() {

        return String.format("ING%05d", Integer.valueOf(getCodigo()));

    }

    public double monto_movilidad() {
        if (Num_obras < 17) {
            return 300;
        } else {
            return 600;
        }
    }

    @Override
    public String MostrarInfo() {
        {
            DecimalFormat df = new DecimalFormat("##0.00");
            return "\nNombres \t\t: " + getNombre()
                    + "\nApellidos \t\t: " + getApellido()
                    + "\nIngresos \t\t: " + df.format(sueldo_base())
                    + "\ncodigo \t\t: " + generarCodigo()
                    + "\nBonificaciones\t\t: " + df.format(bonificacion())
                    + "\nDescuento\t\t: " + df.format(descuento())
                    + "\nSueldo bruto\t\t: " + df.format(sueldo_bruto())
                    + "\nSueldo neto\t\t: " + df.format(sueldo_neto())
                    + "\nmonto\t\t: " + df.format(monto_movilidad());

        }
    }

}
