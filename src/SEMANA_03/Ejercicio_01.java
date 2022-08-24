
package SEMANA_03;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Ejercicio_01 {
       public static void main(String[] args) {
             int numero,fact=1;
             
             numero =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero a sacar el  Factorial"));
             
             for (int i = 1; i <= numero ; i++) {
                       fact *=i;
           }
             JOptionPane.showMessageDialog(null,"El factoeial del numero  es:   "+fact);
             
    }
}
