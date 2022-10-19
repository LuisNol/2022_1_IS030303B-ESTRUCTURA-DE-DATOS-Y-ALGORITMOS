
package SEMANA_11;

/**
 *
 * @author LUIS
 */

class Metodo{
   int factorial(int n ){
      if(n==0){
          return 1;
      }
      else{
          return n*(factorial(n-1));
         
      }
   }
   
   int facroeialIterativo(int n ){
      int prod=1;
       for (int i = 1; i <=n; i++) {
           prod *=i;
       }
       
       return prod;
   }
}
public class Ejercicio_01 {
    public static void main(String[] args) {
        Metodo m1= new Metodo();
        
        System.out.println(m1.factorial(4));
        System.out.println(m1.facroeialIterativo(4));
    }
}
