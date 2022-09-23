/*
    Ejercicio 9: Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos)
    el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final
    mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 

    
 */
package POO_Programacion.Ejercicio_09;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
abstract class Poligono {

    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    //Sobre escritura del metodo toString() heredado de Object
    @Override
    public String toString() {
        return "Numero de lados=" + numeroLados;
    }

    //Declaracion del metodo abstracto area()
    public abstract double area();
}

class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() + "\nlado1=" + lado1 + ", lado2=" + lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

}

class Triangulo extends Poligono {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: \n" + super.toString() + "\nlado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3;
    }

    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
    }
}

public class Main {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

     public static  int NumeroAletorioEntero(int min,int max){
           Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r; 
    }
    public static void main(String[] args) {
        leerPoligonos();
        //Mostrar el area y los datos de cada poligono
        mostrarResultados();
    }

    public static void leerPoligonos() {
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite el tipo de poligono:\n"
                        + "1. Triangulo\n2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    leerTriangulos();
                    break;
                case 2:
                    leerRectangulos();
                    break;
            }

            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void leerTriangulos() {
        double lado1, lado2, lado3;

        System.out.println("\nDigite el lado1 del triangulo: "+  (lado1 =NumeroAletorioEntero(0,20)));
     //   lado1 = NumeroAletorioEntero(0,20);
        System.out.println("Digite el lado2 del triangulo: "+( lado2 =NumeroAletorioEntero(0,20)));
        //lado2 =NumeroAletorioEntero(0,20);
        System.out.println("Digite el lado3 del triangulo: "+(   lado3 = NumeroAletorioEntero(0,20)));
        //lado3 = NumeroAletorioEntero(0,20);

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        //Guardamos el triangulo dentro de nuestro arreglo de poligonos
        poligono.add(triangulo);
    }

    public static void leerRectangulos() {
        double lado1, lado2;

        System.out.println("\nDigite el lado1 del rectangulo: "+(   lado1 =NumeroAletorioEntero(0,20)));
  //      lado1 =NumeroAletorioEntero(0,20);
        System.out.println("Digite el lado2 del rectangulo: "+ (lado2 = NumeroAletorioEntero(0, 20)));
      //  lado2 = NumeroAletorioEntero(0, 20);

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        //Guardamos el rectangulo dentro de nuestro arreglo de poligonos
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        //Recorremos el arreglo para mostrar los resultados
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area= " + poli.area());
            System.out.println("");
        }
    }
}
