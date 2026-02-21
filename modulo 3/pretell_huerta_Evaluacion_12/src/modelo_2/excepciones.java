
package modelo_2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class excepciones {

   
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese un numero");
            int dato1 = scanner.nextInt();
            System.out.println("ingrese un numero");
           int dato2 = scanner.nextInt();
           
        System.out.println( dato1/dato2 );
        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir entre 0");
        }

        
    } 
}
