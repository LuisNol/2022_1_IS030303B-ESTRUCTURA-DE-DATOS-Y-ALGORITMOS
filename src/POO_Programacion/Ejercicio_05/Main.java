package POO_Programacion.Ejersicio_05;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Main {

    private static double mayorArea(Triangulo_Isoseles triangulos[]) {

        double area;
        area = triangulos[0].obtenerArea();

        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }

        }

        return area;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int ntriangulos;

        ntriangulos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de triangulos a ingresar"));

        Triangulo_Isoseles triangulos[] = new Triangulo_Isoseles[ntriangulos];

        for (int i = 0; i < triangulos.length; i++) {

            JOptionPane.showMessageDialog(null, "Ingrese los datos del  triangulo  : " + (i + 1) + "");
            base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresesa la base :  "));
            lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresesa el lado :  "));

            triangulos[i] = new Triangulo_Isoseles(lado, base);

        }

        for (int i = 0; i < triangulos.length; i++) {

            //JOptionPane.showMessageDialog(null,"El perimetro del triangulo es :  "+triangulos[i].optenerPerimetro());
            // JOptionPane.showMessageDialog(null,"El area  del triangulo es :  "+triangulos[i].obtenerArea());
            //  "Ingrese los datos del  triangulo  : "+(i+1)+"")
            System.out.println("Mostrando  el pereimetro y el  area  : " + (i + 1) + "");
            System.out.println("El perimetro del triangulo es :  " + triangulos[i].optenerPerimetro());
            System.out.println("El area  del triangulo es :  " + triangulos[i].obtenerArea());
            System.out.println("\n");

        }
        
        JOptionPane.showMessageDialog(null,"El area del  triangulo   de mayor superficie es : "+mayorArea(triangulos));
    }

}
