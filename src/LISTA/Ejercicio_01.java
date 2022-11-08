
package LISTA;

import java.io.File;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author sumaran
 */

class nodo{
    int dato;
    nodo sgte;
    public nodo(int n){
        this.dato=n;
        this.sgte=null;
    }

    
}
class metodo{
    nodo origen=null;
    void ingresar(int n){
         nodo  newnodo=new nodo(n);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
        
    }
    void mostrar(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato+"-->\t");
            temp=temp.sgte;
        }
        System.out.println("");
    }
    void buscarLista( int n)
	{
		boolean band = false;
                 nodo temp3=origen;
		nodo actual =this.origen;
		actual = temp3;

		while ((actual != null) && (actual.dato <= n))
		{
			if (actual.dato == n){
				band = true;
			}
			actual = actual.sgte;
		}
		if (band == true){
			System.out.print("Elemento ");
			System.out.print(n);
			System.out.print(" SI a sido encontrado\n ");
		}
		else{
			System.out.print("Elemento ");
			System.out.print(n);
			System.out.print(" No a sido encontrado\n");
		}

	}
    
     
     void calcularMayorMenor()
	{
             nodo temp1=origen;
		int mayor = 0;
		int menor = 99999;

		while ( temp1!= null)
		{ //mientras no sea el final de la lista
			if ((temp1.dato) > mayor)
			{ //Comprobamos el numero mayor
				mayor = temp1.dato;
			}
			if ((temp1.dato) < menor)
			{ //Comprobamos el numero menor
				menor = temp1.dato;
			}
			temp1 = temp1.sgte; //Avanzamos en la lista
		}
		System.out.print("\n\nEl mayor numero es: ");
		System.out.print(mayor);
		System.out.print("\n");
		System.out.print("El menor numero es: ");
		System.out.print(menor);
		System.out.print("\n");
	}
     
     
}

public class Ejercicio_01
{
       static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
          public static void main(String[] args) {
        metodo met=new metodo();
       
  
         // ArrayList<metodo> met=new ArrayList<>();
        // Vector<metodo> met = new Vector<>();
        char rpt;
        int opcion,numero,numerobus,numeroEli;
   
        Scanner entrada = new Scanner(System.in);
       
        
        do {
                        System.out.println("\t.:MENU:.");
                        System.out.println("1. Ingresar datos");
                        System.out.println("2. Mostrar datos");
                        System.out.println("3. Calcular Mayor Y  menor");
                        System.out.println("4.Buscar un elemento en la lista");
                        System.out.println("5.Eliminar un nodo en la lista");
                        System.out.println("6. Salir ");
                        System.out.print("Difite la opcion: ");
                        opcion=entrada.nextInt();
                       
                switch (opcion) {
                case 1 -> {
                    
                    do{
                        System.out.print("Ingrese un numero : ");
                        System.out.print(( numero=aletorioEntero(0,100)));
               
                        met.ingresar(numero);
                        System.out.println("\nDesea agregar mas Numero (s/n): ");
                        rpt=entrada.next().charAt(0);
                    }while( rpt== 'S' || rpt == 's');
                  }
                case 2 -> {
                        met.mostrar();
                  }
                case 3 ->{
                        met.calcularMayorMenor();
                }
                
                case 4 -> {
                       System.out.print("Ingrese un numero : ");
                       numerobus=entrada.nextInt();
                      met.buscarLista(numerobus);
                }
                
                case 5 ->{
                    System.out.print("Ingrese un numero : ");
                       numeroEli=entrada.nextInt();
                      met.eliminarNodo(numeroEli);
                
                }
                default -> System.out.println("Se equivoco de opcion de menu");
            }
        } while (opcion !=6);
    }
}
