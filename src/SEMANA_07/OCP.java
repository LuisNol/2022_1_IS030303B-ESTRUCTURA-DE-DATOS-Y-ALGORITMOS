/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_07;

import java.util.Collection;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
interface Figura {

    void pinta();

    public double area();
}

class Cuadrado implements Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
 
    public void pinta() {
        System.out.println("Pintando al Cuadrado ");
    }

    @Override
    public double area() {
         return Math.pow(lado, 2);
    }
}

class Circulo implements Figura {
   private double redio;

    public Circulo(double redio ) {
        this.redio = redio;
       
    }
   
    
    public void pinta() {
        System.out.println("Pintando  el Circulo");
    }

    @Override
    public double area() {
          return Math.PI*Math.pow(redio, 2);
    }
}

public class OCP {

    public static void imprimir(Figura[] arrayFigura) {
        for (Figura figura : arrayFigura) {
            figura.pinta();
            System.out.println("El area  es : "+figura.area());
              System.out.println("\n");
        }
        
      
        
    }

    public static void main(String[] args) {

        Figura[] s = {new Cuadrado(2), new Circulo(2)};
        imprimir(s);

    }

}
