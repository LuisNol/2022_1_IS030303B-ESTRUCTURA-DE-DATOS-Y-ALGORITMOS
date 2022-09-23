package SEMANA_04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
interface costante {

    int n = 100;
}

class Fruta {

    private String name;
    private float price;

    public Fruta(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    String informacion() {
        return "Nombre :  " + this.name + "Precio :  " + this.price;
    }

}

class Canasta implements costante {

    String listaFrutas[] = {"Platano", "Naranja", "Sandia", "Mango", "Lima Limon", "Fresa", "Manzana", "Melon", "Mandarina", "Papaya", "Pera", "Chirimoya"};
    Fruta lista[] = new Fruta[n];
    int cont = 0;
    float acumulador = 0;
    float promedio;

    void rrellenar() {
     //   Fruta p = new Fruta(listaFrutas[aletorioEntero(0, 11)], aletorioEntero(0, 11));
        lista[cont]=new Fruta(listaFrutas[aletorioEntero(0, 11)], aletorioEntero(0, 11));
    //    lista[cont] = p;
        cont++;
    }

    void mostrar() {
        int i = 0;
        do {
            System.out.println(lista[i].informacion());
            this.acumulador += lista[i].getPrice();
            i++;
        } while (cont != i);
        promedio = acumulador / cont;
        System.out.println("Informacion: Acumulado: " + this.acumulador
                + " Total de elementos: " + this.cont + " Promedio: " + this.promedio + "\n");
    }

    int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }

    void MayorPromedio() {
        int i = 0;
        do {
            if (lista[i].getPrice() > promedio) {
                System.out.println(lista[i].informacion());
            }
            i++;
        } while (cont != i);
    }

    void MenorPromedio() {
        int i = 0;
        do {
            if (lista[i].getPrice() <= promedio) {
                System.out.println(lista[i].informacion());
            }
            i++;
        } while (cont != i);
    }
}

public class Ejercicio_09 {

    public static void main(String[] args) {
        Canasta canasta1 = new Canasta();
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Ingrese el numero de frutas:  ");
            n = sc.nextInt();
        } while (n > 100);

        for (int i = 0; i < n; i++) {
            canasta1.rrellenar();
        }
        canasta1.mostrar();

        boolean band = true;
        while (band) {
            System.out.println("\nQue deseas hacer: \n[1]mostrar productos mayor al promedio"
                    + "\n[2]Mostrar productos menores al promedio\n[0]salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    canasta1.MayorPromedio();
                    break;
                case 2:
                    canasta1.MenorPromedio();
                    break;
                case 0:
                    band = false;
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Caracter no identificado!!");
            }
        }
    }

}
