
/*
    Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el 
    siguiente menú:
        1. Sumar dos números complejos
        2. Multiplicar 2 números complejos
        3. Comparar 2 números complejos (iguales o no)
        4. Multiplicar un número complejos por un entero
 */
package POO_Programacion.Ejercicio_06;

/**
 *
 * @author LUIS
 */
public class numeroComplejo {

    private double a; //parte real
    private double b; //Parte imaginaria

    public numeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /*
        numero1 = 3 + 5i
        numero2 = 2 + 6i
        suma = 5 + 11i
    
        NumeroComplejo numero1 = new NumeroComplejo(3,5);
        numero1.calcularSuma(2,6);
     */
    public numeroComplejo calcularSuma(numeroComplejo c) {
        numeroComplejo suma = new numeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /*
        numero1 = 3 + 5i
        numero2 = 2 + 6i
        mult = (3*2 - 5*6) + (3*6 + 5*2)i
     */
    public numeroComplejo calcularProducto(numeroComplejo c) {
        numeroComplejo mult = new numeroComplejo((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return mult;
    }

    /*
        numero1 = 3 + 5i
        numero2 = 2 + 6i
     */
    public boolean comprobarIgualdad(numeroComplejo c) {
        boolean igualdad = false;
        if ((a == c.getA()) && (b == c.getB())) {
            igualdad = true;
        }

        return igualdad;
    }

    /*
        numeroComplejo = 4 + 2i
        entero = 3;
    
        resultado = (3*4) + (3*2)i
     */
    public numeroComplejo multicarPorEntero(int x) {
        numeroComplejo resultado = new numeroComplejo(x * a, x * b);
        return resultado;
    }

}
