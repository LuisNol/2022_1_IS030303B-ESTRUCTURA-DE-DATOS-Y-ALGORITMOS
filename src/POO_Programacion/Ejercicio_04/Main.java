
package POO_Programacion.Ejersicio_04;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Main {

    public static int indiceGanador(Atleta atletas[]) {
        float tiempoCarrera;
        int indice = 0;
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroAtleta, nAtletas,indiceAtletaGanador;
        float tiempoCarrera;

        nAtletas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de Atletas a participar    "));

        Atleta atletas[] = new Atleta[nAtletas];

        for (int i = 0; i < atletas.length; i++) {
          //  entrada.nextLine();
            
            JOptionPane.showMessageDialog(null, "\nDigite los datos para el atleta " + (i + 1) + ":");
            numeroAtleta =Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca número de atleta: "));
            nombre = JOptionPane.showInputDialog(null, "\"Introduzca nombre de Atleta: \"");
            tiempoCarrera = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca tiempoCarrera: "));
          //  System.out.println("\nDigite los datos para el atleta " + (i + 1) + ": ");
         //   System.out.print("Introduzca número de atleta: ");
           // numeroAtleta = entrada.nextInt();
           // entrada.nextLine();
         //   System.out.print("Introduzca nombre de Atleta: ");
        //    nombre = entrada.nextLine();
          //  System.out.print("Introduzca tiempoCarrera: ");
          //  tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }

        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador de la carrera es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());

    }

}
