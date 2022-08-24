
package SEMANA_04;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
          int suma=0,cont=1,n;
          
          n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese  numero a sumar : "));
         //while(cont ! =n+1 )
       while (cont<=n){
           
           suma +=cont;
           cont++;
           
       
       }
       
        JOptionPane.showMessageDialog(null,"La suma es : "+ suma);
          
          
          
    }
    
}
