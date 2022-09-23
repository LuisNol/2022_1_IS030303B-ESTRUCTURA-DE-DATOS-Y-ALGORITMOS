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

class Animal{

    public void comer(){
        System.out.println("Estoy comiendo  ");
    }
}

class Persona extends Animal{
    
     @Override
     public void comer(){
        System.out.println("Estoy comiendo  sentado con cubiertos ");
    }
}

class Perro extends Animal{
      @Override
      public void comer(){
        System.out.println("Estoy comiendo  con el patito en el suelo");
    }
}
public class SobreEstructuradeMiembro {
    
    public static void main(String[] args) {
           Persona p = new Persona();
           Perro per = new Perro();
           
           p.comer();
           per.comer();
    }

}
