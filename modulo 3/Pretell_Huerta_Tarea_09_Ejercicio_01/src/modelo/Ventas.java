
package modelo;

import javax.swing.JOptionPane;

public class Ventas {
  private String N_boleto;
  private String Origen;
  private String Destino;
  private int precio;
  private String Nombre_p;
  private String fecha;
  private String turno;
private String asiento;
private int contador;
private int baja;
    public Ventas() {
        
    }

    public Ventas(int contador ){
        this.contador = contador;
    }


  

    

    public Ventas(Object[]Registro) {
        N_boleto = (String)Registro[0];
        Origen =  (String)Registro[1];
        Destino = (String)Registro[2];
        precio = (int)Registro[3];
        Nombre_p= (String)Registro[4];
        asiento = (String)Registro[5];
        fecha = (String)Registro[6];
        turno = (String)Registro[7];    
    }
    public void restrar(){

}
   //get = recibir
    public Object[] getRegistro(){
        
    Object[] registro = {N_boleto,Origen,Destino,precio,Nombre_p,asiento,fecha,turno};
    return registro;
    }
    public String getCadena(){
    String cadena = N_boleto+","+Origen+","+Destino+","+precio+","+Nombre_p+","+asiento+","+fecha+","+turno;
    return cadena;
    }

    public String getN_boleto() {
        return N_boleto;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setN_boleto(String N_boleto) {
        this.N_boleto = N_boleto;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_p() {
        return Nombre_p;
    }

    public void setNombre_p(String Nombre_p) {
        this.Nombre_p = Nombre_p;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    
   
  
  
  
    
}
