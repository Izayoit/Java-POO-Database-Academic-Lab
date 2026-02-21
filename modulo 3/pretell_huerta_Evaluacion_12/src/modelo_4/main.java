
package modelo_4;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class main {

  
    public static void main(String[] args) {
         
                  
        Scanner scanner = new Scanner(System.in);
     
        try {
               System.out.println("escriba numero");
        int pos = scanner.nextInt();  
                System.out.println("escriba otro numero");
        int pos2 = scanner.nextInt();
        for ( ; pos < pos2; pos++) {
            pos++;}
            
        System.out.println(pos);
        
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("error en el codigo");
        }
    }
    
}
