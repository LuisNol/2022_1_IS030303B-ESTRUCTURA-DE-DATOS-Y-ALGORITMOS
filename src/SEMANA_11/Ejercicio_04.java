
package SEMANA_11;

import java.util.Random;

/**
 *
 * @author sumaran
 */

class Metodo{
   int exponente(int x ,int y){
       if (y==0) {
           return 1;
       }else{
          return x* exponente(x,y-1);
       }
   }
}

public class Ejercicio_04 {
    public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    public static void main(String[] args) {
        Metodo m1 = new Metodo();
        
        System.out.println("El resultado de la potencia es : "+  m1.exponente(aletorioEntero(1,20),aletorioEntero(1,20)));
        //System.out.println("El resultado de  potencia es "+m1.exponente(2, 3));
    }
}
