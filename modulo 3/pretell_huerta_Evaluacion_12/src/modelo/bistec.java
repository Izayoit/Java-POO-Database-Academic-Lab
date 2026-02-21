
package modelo;

import javax.swing.JOptionPane;


public class bistec extends carne{
    
    public bistec(double grsGrasa, String colesterol, String zona, double precio, String calorias, double peso) {
        super(grsGrasa, colesterol, zona, precio, calorias, peso);
    }
    public String cortar(){
    
        JOptionPane.showMessageDialog(null, "cortando bistec");
        return null;
   
    
    }
}
