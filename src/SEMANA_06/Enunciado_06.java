

package SEMANA_06;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

interface Dibujable{
    public void  dibujar();

}

abstract class Figura{
     public abstract double area();
}

interface Rotable {
    public void rotar(double grados);
}

class Circulo extends Figura implements Dibujable{

     private double  radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
          return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("El circulo  se esta dibujando ");
    }

}

class Cuadrado extends Figura implements Dibujable,Rotable{
    double  grado;
    private double lado ;

    public Cuadrado(double lado) {
        this.lado = lado;
     //   this.grado=grado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("El cuadrado se esta dibujando ");
    }

    @Override
    public void rotar(double grados) {
            grado=grados;
    }

    public void Grado() {
             System.out.println("Esta rotando  en grado : "+grado);
    }
    
}

public class Enunciado_06 {
    
    public static void main(String[] args) {
        Circulo f1= new  Circulo(2);
        
          System.out.println("El area del circulo es : "+f1.area());
            f1.dibujar();
            System.out.println();
            
            Cuadrado f2 = new  Cuadrado(2);
            System.out.println("El area del circulo es :  "+f2.area());
            f2.dibujar();
           f2.rotar(45);
           f2.Grado();
    }
       

}
