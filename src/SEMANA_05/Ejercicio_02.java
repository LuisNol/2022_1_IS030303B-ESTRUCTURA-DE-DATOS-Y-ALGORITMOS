package SEMANA_05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
class Alumno {

    private int cedula;
    private String nombre;
    private int edad;
    private String grado;

    public Alumno(int cedula, String nombre, int edad, String grado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGrado() {
        return grado;
    }

}

class Nota extends Alumno {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Nota(int cedula, String nombre, int edad, String grado, double nota1, double nota2, double nota3, double nota4) {
        super(cedula, nombre, edad, grado);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    //  public  double calularPromedio(){

    public double calularPromedio() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String estado() {
        String estado;
        estado = (calularPromedio() > 10.5) ? "APROBADO" : "DESAPROBADO";
        return estado;
    }

    String mostrarInformacion() {
        return "Cedula : " + this.getCedula() + ", \nNombre  : " + this.getNombre() + ", \nEdad :  " + this.getEdad() + ", \nGrado  :  " + this.getGrado()
                + "\nnota1:   " + nota1 + ", \nnota2:  " + nota2 + "\nnota3 : " + nota3 + "\nnota4:  " + nota4;
    }

}

public class Ejercicio_02 {

    public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cedula, edad, opcion, indice = 0,indice1=0;
        String nombre, grado;
        double nota1, nota2, nota3, nota4, promedio;

        Nota notas[] = new Nota[2];
        
                

        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ingresar Datos");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Alumno mayor promedio ");
            System.out.println("4. Alumno menor promedio ");
            System.out.println("5. Salir");
            System.out.print("Difite la opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < notas.length; i++) {
                        entrada.nextLine();
                        System.out.println("Ingrese Datos Del  Alumno  N " + (i + 1) + ": ");
                        System.out.print("Ingresa  la cedula :   ");
                        System.out.print(cedula = aletorioEntero(1, 1000));
                        System.out.print("\nIngresesa el  Nombre   :   ");
                        nombre = entrada.nextLine();
                        System.out.print("Ingrese  la Edad :    ");
                        System.out.print(edad = aletorioEntero(1, 25));
                        System.out.print("\nIngrese  el grado :    ");
                        grado = entrada.nextLine();
                        System.out.print(" Ingrese la nota1  :    ");
                        System.out.print(nota1 = aletorioEntero(1, 20));
                        System.out.print("\n Ingrese la nota2  :    ");
                        System.out.print(nota2 = aletorioEntero(1, 20));
                        System.out.print("\n Ingrese la nota3:    ");
                        System.out.print(nota3 = aletorioEntero(1, 20));
                        System.out.print("\n Ingrese la nota4  :    ");
                        System.out.print(nota4 = aletorioEntero(1, 20));
                                       System.out.println("\n");
                        notas[i] = new Nota(cedula, nombre, edad, grado, nota1, nota2, nota3, nota4);
            
                    }
                

                    break;

                case 2:
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("\nMostrando datos de la Alumno N°" + (i + 1) + ":");
                        System.out.println(notas[i].mostrarInformacion());
                        System.out.println("El promedio:  " + notas[i].calularPromedio());
                        System.out.println("Estado :    " + notas[i].estado());
                    }
                    break;

                case 3:

                    promedio = notas[0].calularPromedio();

                    for (int i = 1; i < notas.length; i++) {
                        if (notas[i].calularPromedio() > promedio) {
                            promedio = notas[i].calularPromedio();
                            indice = i;
                        }
                    }

                    System.out.println("El alumno con mayor promedio  :  ");
                    System.out.println(notas[indice].mostrarInformacion());
                    System.out.println("El promedio :  " + notas[indice].calularPromedio());
                    System.out.println("Estado :    " + notas[indice].estado());

                    break;

                case 4:

                    promedio = notas[0].calularPromedio();

                    for (int i = 1; i < notas.length; i++) {
                        if (notas[i].calularPromedio() < promedio) {
                            promedio = notas[i].calularPromedio();
                            indice1= i;
                        }
                    }

                    System.out.println("El alumno con menor  promedio  :  ");
                    System.out.println(notas[indice1].mostrarInformacion());
                    System.out.println("El promedio :  " + notas[indice1].calularPromedio());
                    System.out.println("Estado :    " + notas[indice1].estado());

                    break;

                default:
                    System.out.println("Se equivoco de opcion de menu");
                    break;

            }

        } while (opcion != 5);

    }

}
