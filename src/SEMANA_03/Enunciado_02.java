/*
 Ordenar un vector de tamaño 10, utilizar datos aleatorios y mostrar en pantalla un antes y un después. 
 */
package SEMANA_03;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Enunciado_02 {
    
      public static  int     numeroAleatorioEntero(int min,int max){
           Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r; 
    }
    public static void main(String[] args) {
        int aux ;
           Scanner entrada = new Scanner(System.in);
       
         int tamanio=10;
        int numeros[] = new int[tamanio];
        
        for (int i = 0; i < numeros.length; i++) {
                 System.out.print((i+1)+". Digite un numero: ");
                  System.out.println(numeros[i]= numeroAleatorioEntero(0,100));
    
        }
        System.out.print("Arreglo  Original :  ");
          for (int i = 0; i < numeros.length; i++) {
              
                System.out.print(numeros[i]+" - ");
        }
          System.out.println("\n");
        
        //Ordenamos con el método Burbuja
        for(int i=0;i<(numeros.length-1);i++){
            for(int j=0;j<(numeros.length-1);j++){
                if(numeros[j]>numeros[j+1]){ //Número actual > Número siguiente - Cambio
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        
        //Por ultimo imprimimos el arreglo ordenado
        System.out.print("\nArreglo Ordenado cresiente : ");
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" - ");
        }
        System.out.println("");
        
        
        System.out.print("\nArreglo Ordenado Decresiente : ");
        for (int i = numeros.length-1; i >=0 ; i--) {
             System.out.print(numeros[i]+" - ");
        }
        System.out.println("");
        
        
        
    }
    
}
