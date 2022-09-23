

package SEMANA_06;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
*
 */


abstract  class Figura{
     protected double x;
     protected double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
     
     public abstract  double area();
}

class Circulo extends Figura{

        private double radio ;

    public Circulo( double x, double y ,double radio) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double area() {
           return Math.PI*Math.pow(radio, 2);
    }
    
        
}

class Cuadrado extends Figura{
       private double lado;

    public Cuadrado( double x, double y,double lado) {
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(lado, 2);
    }

}
public class Enunciado_04 {
    public static void main(String[] args) {
        
       Circulo f1= new  Circulo(2,2,3);
        System.out.println("El area del circulo es  :"+f1.area());
       
       
            Cuadrado f2 = new Cuadrado(2,2,3);
            
            System.out.println("El area del cuadrado es : "+f2.area());
            
        
    }
}
