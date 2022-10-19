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
   int producto(int x ,int y){
       if (y==0) {
           return 0;
       }else{
          return x+producto(x,y-1);
       }
   }
}

public class Ejercicio_03 {
    
    public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    public static void main(String[] args) {
        Metodo m1 = new Metodo();
        System.out.println("El producto de dos numeros es : "+  m1.producto(aletorioEntero(1,20),aletorioEntero(1,20)));
    }
}
