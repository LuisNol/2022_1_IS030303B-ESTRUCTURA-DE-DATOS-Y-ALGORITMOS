
package POO_Programacion.PruebaFiguras;

/**
 *
 * @author LUIS
 */
public class Cuadrado {
     private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
     
     
     double  calcularArea(){
           return lado*lado;
     }
     
     double calcularPerimetro(){
           return  4*lado;
     }
}
