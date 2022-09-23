

package SEMANA_06;



/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

interface interfaceA{
       public  void  mostrarDatosA ();
}

interface interfaceB{
   public  void  mostrarDatosB ();
}
      

class A {
    
}

 class  B  extends A  implements interfaceA,interfaceB{

    @Override
    public void mostrarDatosA() {
        
        System.out.println("hola como etsas a");
        
    }

    @Override
    public void mostrarDatosB() {
        System.out.println("hola como estas  b");
    }
 
 
 }
public class Enunciado_01 {
    public static void main(String[] args) {
            B  s  =  new  B();
            
     
            s.mostrarDatosA();
            s.mostrarDatosB();
          //  System.out.println("La suma es  : "+s.sumar());
          
            
    }
}
