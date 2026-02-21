
package modelo;

import javax.swing.JOptionPane;


public class carne extends comida{

    private double grsGrasa;
    private String colesterol;
    private String zona;

    public carne(double grsGrasa, String colesterol, String zona, double precio, String calorias, double peso) {
        super(precio, calorias, peso);
        this.grsGrasa = grsGrasa;
        this.colesterol = colesterol;
        this.zona = zona;
    }

    public carne(double precio, String calorias, double peso) {
        super(precio, calorias, peso);
    }

    public double getGrsGrasa() {
        return grsGrasa;
    }

    public void setGrsGrasa(double grsGrasa) {
        this.grsGrasa = grsGrasa;
    }

    public String getColesterol() {
        return colesterol;
    }

    public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
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
        JOptionPane.showMessageDialog(null, "se come carne");
       return null;
    }
    public String cortar(){
    
       JOptionPane.showMessageDialog(null, "se corta y se pela");
    
      return null;
    
    }
    public String empanar(){
    
       JOptionPane.showMessageDialog(null, "se corta y se pela");
    
      return null;
    
    }
    
}
