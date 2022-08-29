
package POO_Programacion.PruebaFiguras;

/**
 *
 * @author LUIS
 */
public class PruebaFiguras {
    public static void main(String[] args) {
         Circulo figura1 = new Circulo(2.1f);
       Rectangulo figura2 = new Rectangulo(1,2);
       Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        System.out.println("El area del circulo  es :  " + figura1.calcularPerimetro() );
        System.out.println("El perimetro  de  circulo : " + figura1.calularArea());
        
        
        System.out.println(" El area del triangulo   es  " +figura4.calcularArea() );
         System.out.println(" El area del triangulo  es  " +figura4.calcularPerímetro());
         figura4.determinarTipoTriángulo();
    }
}
