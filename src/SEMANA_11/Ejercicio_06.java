/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_11;

import java.util.Random;

/**
 *
 * @author sumaran
 */

class Metodo{
      public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
      
   void llenar(int vec[]){
       for (int i = 0; i < vec.length; i++) {
            System.out.print((i+1)+". Digite un numero: ");
             System.out.println((vec[i]=aletorioEntero(0 ,20)));
       }
   }
   
   int sumar(int vec[]){
      
   }
   
   void mostrar(int vec[]){
       for (int i : vec) {
           System.out.println(""+i);
       }
   }
       
}
public class Ejercicio_06 {
    
    public static void main(String[] args) {
        Metodo m = new Metodo();
        
        int vector[] = new int[10];
        m.llenar(vector);
    }
    
}
