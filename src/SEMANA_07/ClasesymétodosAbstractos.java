/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_07;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */
abstract  class  SerVivo{

         public abstract  void alimentarse();
}

class Planta  extends SerVivo{

    @Override
    public void alimentarse() {
        System.out.println("La planta se alimeta  de la fotosintisis");
    }

}

abstract class Animal extends SerVivo{

}

class Carnivoro extends Animal {
     @Override
     public void alimentarse() {
        System.out.println("El animal carnivoro se alementa de carne ");
    }
}

class Hirvivoro extends Animal{

    @Override
    public void alimentarse() {
         System.out.println("El animal  hervivoro  se alimenta de hierva ");
    }

}

public class ClasesymétodosAbstractos {
    public static void main(String[] args) {
       //    SerVivo p = new SerVivo();
       Planta planta = new  Planta();
       planta.alimentarse();
       
       Carnivoro animalc= new  Carnivoro();
       animalc.alimentarse();
    }

}
