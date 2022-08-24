package POO_Programacion.Ejersicio_03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Main {

    private static int indicaChocheBarato( Vehiculo  coche[]){
        float precio;
        int indice=0;
        
        precio = coche[0].getPrecio();
        
        for (int i = 1; i < coche.length; i++) {
             if (coche[i].getPrecio()<precio) {
                  precio= coche[i].getPrecio();
                  indice=i;
            }
            
            
        }
        return indice;
        
    }
    
    
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;

        int cantidadVehiculo,indiceBarato;
        cantidadVehiculo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa  La cantidad ded Vehiculo : "));

        Vehiculo coches[] = new Vehiculo[cantidadVehiculo];

        for (int i = 0; i < coches.length; i++) {

            JOptionPane.showMessageDialog(null, "\nDatos del Vehiculo " + (i + 1) + ":");
            marca = JOptionPane.showInputDialog(null, "Introduzca marca");
            modelo = JOptionPane.showInputDialog(null, "\"Introduzca modelo:");
            precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduzca precio: "));

            coches[i] = new Vehiculo(marca, modelo, precio);

        }
        
        indiceBarato= indicaChocheBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());

    }

}
