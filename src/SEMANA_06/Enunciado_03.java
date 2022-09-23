/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_06;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

class Base {

}

interface interface1{
     public void  interface1Mostrar();
}

interface interface2{
     public void  interface2Mostrar();
}

interface interface3{
      public void  interface3Mostrar();
}


class Derivada   extends Base implements interface1, interface2,interface3  {

    @Override
    public void interface1Mostrar() {
        System.out.println("hola  interface1");
    }

    @Override
    public void interface2Mostrar() {
      System.out.println("hola  interface2");
    }

    @Override
    public void interface3Mostrar() {
         System.out.println("hola  interface3");
    }
}
public class Enunciado_03 {
    public static void main(String[] args) {
        
        Derivada s = new Derivada();
        
        s.interface1Mostrar();
        s.interface2Mostrar();
        s.interface3Mostrar();
        
    }

}
