/*
 Crear un clase perro (name, sexo) y almacenarlo en un vector de tamaño 10, se pide llenar los datos con valores aleatorios y mostrar en pantalla.
 */
package SEMANA_03;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
class Perro {

    private String name;
    private String sexo;

    public Perro(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String informacion() {
        return "Perro{" + "Name:  " + name + ",\n Sexo:  " + sexo + '}';
    }

}

public class Enunciado_03 {

    

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre,sexo;
        int n;
        String listaNombre[] = {"  Odie", " Snoopy", "    Slinky ", "Toto", "  Balto", " Marley", " Bolt Golfo", "Pongo ", "Beethoven", "    Hachiko ", "Benji", "    Scooby ", "Clifford",
             " Astro ", "Goofy", "Chip", " Einstein", "  Fang ", "Frank", " Rin Tin Tin", " Milo", "Truman ", "Uggie", " Bingo", " Blue", "  Cometa ", "Krypto", "Max ", "Huesos"};
           
      //  Random rd = new Random();
   //     int r = rd.nextInt((29 - 0) + 1) + 0;
         Perro perros[] = new Perro[10];
         
         for (int i = 0; i < perros.length; i++) {
             System.out.println(" Digite los datos de Perro : "+ (i + 1) +":");
             System.out.print("Ingrese el nombre : ");
              System.out.print(( nombre=listaNombre[aletorioEntero(0,29)]));
              System.out.println("\nIngresa el sexo : ");
             sexo= entrada.next();
             
           
              
              perros[i] = new Perro ( nombre,sexo);
        }
         
         System.out.println("\nDotos de los peros :");
         for (int i = 0; i < perros.length; i++) {
             
              System.out.println(perros[i].informacion());
            
        }
           System.out.println("\n");
         
              
    }
    
  
      public static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }


}

