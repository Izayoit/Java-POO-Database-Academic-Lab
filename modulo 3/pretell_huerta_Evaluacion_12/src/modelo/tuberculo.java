
package modelo;

import javax.swing.JOptionPane;

public class tuberculo extends comida{
 private double grsFibra;
    private String temporada;
    private String zona;

    public tuberculo(double grsFibra, String temporada, String zona, double precio, String calorias, double peso) {
        super(precio, calorias, peso);
        this.grsFibra = grsFibra;
        this.temporada = temporada;
        this.zona = zona;
    }

    public tuberculo(double precio, String calorias, double peso) {
        super(precio, calorias, peso);
    }

    public double getGrsFibra() {
        return grsFibra;
    }

    public void setGrsFibra(double grsFibra) {
        this.grsFibra = grsFibra;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    
    @Override
    public String cocinar() {
        JOptionPane.showMessageDialog(null, "se cocina");
        return null;
    }

    @Override
    public String congelar() {
      JOptionPane.showMessageDialog(null, "se congela");
        return null;
    }

    @Override
    public String comer() {
     JOptionPane.showMessageDialog(null, "se come tuberculo");
        return null;
    }
    
    public String cortar(){
    
       
    return null;
    }
    public String pelar(){
    
       
    return null;
    }
}
