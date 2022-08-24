/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_04;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor de A : "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor de B: "));
        
        if (a==b) {
            
            JOptionPane.showMessageDialog(null,"Son iguales ");
            
        } else if (a>b)     {
             JOptionPane.showMessageDialog(null,a+"   a  es mayor   b  "+b);
              
        }else { JOptionPane.showMessageDialog(null,b+" b  es mayor   a   "+a);}

     }

}
