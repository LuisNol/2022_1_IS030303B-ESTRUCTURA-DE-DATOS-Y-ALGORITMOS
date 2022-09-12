/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_06;

/**
 *
 * @author LUIS
 */
public class Ejercicio_01 {

    public static void main(String[] args) {
        int acu = 0;
    //    long inicio = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
//             acu +=i;
//           
//        }
        long  vector[] = new long[100];
        for (int i = 0; i < vector.length; i++) {
                long inicio = System.currentTimeMillis();
            int j= 0;
            while (j< 100000000) {
                acu += j;
                j++;
            }
               long fin = System.currentTimeMillis();
               vector[i]=(fin-inicio);
        }
        int p=0;
        long men=1000,may=0;
        long acul =0 ;
        for (long x : vector) {
              if (p==10) {
                  System.out.print("\n");
                  p=0;
            }
              System.out.print("\t "+x);
              if (x<men) {
                  men=x;
            }else   if (x>may) {
                 may=x;
            }
              acul+=x;
              p++;
              
            
        }
          System.out.println("\nEl menor es : "+men);
              System.out.println("ELmayor es :  "+may);
              System.out.println("El promedio es :  "+acul/100);
        System.out.println("\n");
//        int i = 0;
//        while (i < 100000000) {
//            acu += i;
//            i++;
//        }
       // long fin = System.currentTimeMillis();
    //    System.out.println("Tiempo  de inicio  :  " + inicio);
     //   System.out.println("Tiempo de ejecucion es : " + (fin - inicio));

       // System.out.println("Lo acumulado es :  " + acu);

    }

}
