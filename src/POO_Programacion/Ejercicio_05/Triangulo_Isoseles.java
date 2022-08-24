/*
    Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para ello 
    defina los atributos necesarios que se requieren, proporcione métodos de consulta, un
    método constructor e implemente métodos para calcular el perímetro y el área de un
    triángulo, además implementar un método que a partir de un arreglo de triángulos 
    devuelva el área del triángulo de mayor superficie.
*/
package POO_Programacion.Ejersicio_05;

/**
 *
 * @author LUIS
 */
public class Triangulo_Isoseles {
     private   double   lado;
     private double base;

    public Triangulo_Isoseles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }
     
     public double optenerPerimetro(){
            double perimetro =2*lado+base;
      return perimetro;
     }
     
     
     public double   obtenerArea(){
         
         double area = (base*Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2))/4))/2;
         
         return area;
     }
     
     public     String   mostrarDatos(){
     
         return  "Baese :  "+base +"  \n lado :   "+lado+ " \n Perimetro  :  "+optenerPerimetro()+" \n Area :  "+ obtenerArea();
     }
     
}
