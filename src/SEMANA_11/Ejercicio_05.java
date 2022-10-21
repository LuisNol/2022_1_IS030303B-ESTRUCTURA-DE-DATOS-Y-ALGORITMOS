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
   int mcd(int x , int y){
       if (y==0) {
           return x;
       }else if (x==0) {
            return y;
       }else if (x>=y) {
           return  mcd(x-y, y);
       }else{
          return mcd(x,y-x);
       }
 
     
   }
}
          
//suma de numeros  en vector 
public class Ejercicio_05 {
     public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    public static void main(String[] args) {
        Metodo m1 = new Metodo();
        //System.out.println("El producto de dos numeros es : "+  m1.mcd(aletorioEntero(1,20),aletorioEntero(1,20)));
        System.out.println(m1.mcd(12, 18));
    }
}
