/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_11;

/**
 *
 * @author sumaran
 */

class Metodo{
   int sumatoria(int n ){
      if(n==0){
          return 0;
      }
      else{
          return n+(sumatoria(n-1));
         
      }
   }
   
   int sumatoriaIterativa(int n ){
      int prod=0;
       for (int i = 0; i <=n; i++) {
           prod +=i;
       }
       
       return prod;
   }
}
   
public class Ejercicio_02 {
    public static void main(String[] args) {
        Metodo m1= new Metodo();
        
        System.out.println(m1.sumatoria(5));
        System.out.println(m1.sumatoriaIterativa(5)); 
    }
}
