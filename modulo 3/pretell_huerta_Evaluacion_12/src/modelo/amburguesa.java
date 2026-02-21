
package modelo;

import javax.swing.JOptionPane;


public class amburguesa extends carne{

    public amburguesa(double grsGrasa, String colesterol, String zona, double precio, String calorias, double peso) {
        super(grsGrasa, colesterol, zona, precio, calorias, peso);
    }
    
    public String picar(){
    
        JOptionPane.showMessageDialog(null, "picando amburguesa");
        return null;
    
    
    }
}
