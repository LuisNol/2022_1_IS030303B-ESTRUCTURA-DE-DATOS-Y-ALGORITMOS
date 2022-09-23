/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_06;

import java.util.Random;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

interface  Figura{
     public  double area();
}

class Circulo  implements  Figura {
    private double radio ;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
       return Math.PI*Math.pow(radio, 2);
    }  
}

class Cuadrado  implements Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return  Math.pow(lado, 2);
    }

}

public class Enunciado_05 {
    
     public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    
     public static void main(String[] args) {
         
         Circulo f1 = new  Circulo( aletorioEntero(1,30));
           System.out.println("El area del circulo es  :"+f1.area());
         Cuadrado f2 = new Cuadrado(aletorioEntero(1,30));
          System.out.println("El area del cuadrado es : "+f2.area());
        
    }
}
