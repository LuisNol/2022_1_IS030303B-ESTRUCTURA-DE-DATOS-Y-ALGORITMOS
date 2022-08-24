/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_04;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Ejercicio_05 {
    
          
       
    public static void main(String[] args) {
    
         int vect[]=new int[15],max,min;
         
         max=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingre el valor maximo del numero aleotrorio"));
         min=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingre el valor minimo del numero aleotrorio"));
        
         //int vec2[] ={5,8,7,9,7,1};
        
         rellenar(vect,max,min);
         mostrar(vect);
    }
    
    private static void rellenar(int [] vect,int max,int min) {
        
             Random random = new Random();
        
        for (int i = 0; i < vect.length; i++) {
                  System.out.print((i+1)+". Digite un numero: ");
                  
                System.out.println((  vect[i]=random.nextInt(20 + 1) + 1));
                  System.out.println((  vect[i]=random.nextInt(max + min) + min));
        
        }
        
    }
    private  static void mostrar(int [] vect ) {
          System.out.print("\nEl  arreglo es  : ");
        for(int i=0;i<vect.length;i++){
            System.out.print(vect[i]+" ");
        }
        
        System.out.println();
         JOptionPane.showMessageDialog(null,"\nEl  arreglo  es  :   "+Arrays.toString(vect));
          
           
    }
}
