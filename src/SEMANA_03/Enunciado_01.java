/*
Diseñar un algoritmo para la lectura de 20 números y que nos muestre la media de todos los números leídos y cuál ha sido el más pequeño.
 */
package SEMANA_03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LUIS
 */
public class Enunciado_01 {
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);
           Random random = new Random();
        int n,menor=999,suma=0;
        float media;
        
        System.out.println("Ingresa los numeros :_");
        for (int i = 0; i < 20; i++) {
               System.out.print("Ingresa un numero "+(i+1)+" : ");
               System.out.println(n=random.nextInt(100 + 1) + 1);
          //     n=entrada.nextInt();
               suma +=n;
               if (n<menor) {
                   menor =n;
            }
               
              
        }
        media =suma/20;
         System.out.println("\nEl numero mas queño es : "+menor);
         System.out.println("La media de los numeros   : "+media);
    }
     
    
   
    
}
