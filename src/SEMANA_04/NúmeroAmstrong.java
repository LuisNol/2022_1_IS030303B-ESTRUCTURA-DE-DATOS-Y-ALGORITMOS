package SEMANA_04;

/**
 *
 * @author LUIS
 */
public class NúmeroAmstrong {

    public static void main(String args[]) {
        int numeroOriginal, ultimoDigito;
        /* Variables para el número
original y su último dígito */
        double digitos; // Cantidad de dígitos que tiene el número
        double suma = 0;
        /* Variable que sumará los dígitos elevados a su
cantidad de dígitos */
        int numero = 371;
        /* Número a determinar si es un número de
Amstrong */
        numeroOriginal = numero;
        /* Copia el valor del número para su
procesamiento */
        digitos = Math.floor(Math.log10(numero)) + 1;
        /* Calcula el total
de dígitos del número */
// Calcula la suma de potencia de digitos
        while (numero > 0) {
            ultimoDigito = numero % 10; // Extrae el último dígito
// Calcula la suma de potencias del último dígito
            suma = suma + Math.pow(ultimoDigito, digitos);
            numero = numero / 10; // Elimina el último dígito
        }
        /*  Verifica si es un número de Armstrong si la suma obtenida es igual al número */
        if (numeroOriginal == suma) {
            System.out.println(numeroOriginal + "   es un número deAmstron           ");
        } else {
            System.out.println(numeroOriginal + "   no es un número de Amstron");
        }
    }
}
