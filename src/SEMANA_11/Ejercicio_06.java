
package SEMANA_11;

import java.util.Random;

/**
 *
 * @author sumaran
 */

class Metodo{
      public static int aletorioEntero(int min , int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
      
   void llenar(int vec[]){
       for (int i = 0; i < vec.length; i++) {
            System.out.print((i+1)+". Digite un numero: ");
             System.out.println((vec[i]=aletorioEntero(1 ,20)));
       }
   }
   
   int sumarR(int v[], int i){
        if(i==0) return v[i];
        else return v[i]+sumarR(v,i-1);
    }
   
    int sumarI(int v[]){
         int suma=0;
        for (int i = 0; i <v.length  ; i++) {
            suma +=v[i];
        }
        return suma;
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
        m.mostrar(vector);
        
          System.out.println("\nLa suma R: "+m.sumarR(vector,9));
           System.out.println("\nLa suma I: "+m.sumarI(vector));
    }
    
}
