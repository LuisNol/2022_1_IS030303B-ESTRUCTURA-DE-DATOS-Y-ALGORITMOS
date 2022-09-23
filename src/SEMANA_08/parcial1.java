/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_08;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */


public class parcial1{
        
    public static void mostrarMenor(double vector[]){
         
          System.out.print("Los numeros pares son : ");
        for (int i = 0; i < vector.length; i++) {
            
                if (vector[i]%2==0) {
      
                    System.out.println(vector[i]);   
            }
        }
          
    }
    public static void acumuladoPromedio(double vector[]){
            double acumulado = 0;
            double promedio=0;
             for (int i = 0; i < vector.length; i++) {         
                     acumulado =   acumulado+vector[i];
        }
             promedio= acumulado /6;
             
          System.out.println("El acumulado es : "+ acumulado );
          System.out.println("El promedio es : "+ promedio );
        
    }
    
   // Hallar el acumulado y promedio
             public static void operacion(double  vector[]){
                   
           
                    double[]  operacion  =  new  double[6];   // Declaramos   un nuevo vector para almacenar   la operacion 
                            
                    System.out.println("Mostar el  vector original : ");     //Mostramos lel vector original
                    for (int i = 0; i < vector.length; i++) {
                           System.out.print(" Numero  "+(i+1)+":");
                        System.out.println(vector[i] );
                 }
                        
                    
                    ////Hacemos la operacion 
                 for (int i = 0; i < vector.length; i++) {
                          operacion[i]=Math.pow(vector[i], 8)+vector[i];
                 }
                 
                 ///mostramos  el vector operacion 
                      System.out.println("El vector   Operacion :  ");
                 for (int i = 0; i < operacion.length; i++) {
                      
                        System.out.print("La operacion   "+(i+1)+":");
                        System.out.println(operacion[i] );
                 }
                 
                 
                 
             }
            
    public static void  ordenar(double numeros[]){
           double   aux ;
           //Ordenamos con el método Burbuja
        for(int i=0;i<(numeros.length-1);i++){
            for(int j=0;j<(numeros.length-1);j++){            ///mayor a menor
                if(numeros[j]<numeros[j+1]){ //Número actual > Número siguiente - Cambio
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
       }
    
     public static void mostrarVector(double vector[]){
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector [i]+" - ");
        }
     }
    
    
    public static void main(String[] args) {
       // N  O  L   B   E R  T  O
              double vector[]={8,7,9,3,4,7};
              mostrarMenor( vector); //mandamos  el  vector
              acumuladoPromedio(vector);  //mandamos  el  vector
             System.out.println("\n");
              operacion(vector);   //mandamos  el  vector
              
              ordenar(vector);
              
              System.out.println("\nEL vector  ordenado de mayor a  menor es ; ");
              mostrarVector(vector);

    }

}
