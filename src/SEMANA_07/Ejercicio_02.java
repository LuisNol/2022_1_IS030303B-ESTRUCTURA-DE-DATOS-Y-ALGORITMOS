

package SEMANA_07;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

abstract  class Animal{
    abstract void comer();
}

class Perro  extends Animal{
    
    void comer(){
        System.out.println("Come ricocang");
    }
}

class Gato  extends Animal{
   void comer(){
       System.out.println("Come carne ");
   }
}
public class Ejercicio_02 {
    public static void main(String[] args) {
         Animal  perro1 = new  Perro();
         Animal gato1 = new  Gato();
         
         perro1.comer();
         gato1.comer();
    }

}
