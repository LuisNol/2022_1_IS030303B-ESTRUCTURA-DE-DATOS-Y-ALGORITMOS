
package SEMANA_16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Casimiro
 */

class Nodo {
    private int dato;
    private Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public int getDato() {
        return dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.print(this.getDato()+" ");
    }
}

class Arbol {
    private Nodo raiz;

    public Arbol() {
        raiz=null;
    }


    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }

    private void preorden(Nodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(Nodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(Nodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
}
public class Examen_Final {
      static Scanner entrada = new Scanner(System.in);
     static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    public static void ingresar_Datos(Arbol x,int n){
        int numero ;
        for(int i=0;i<n;i++){
            System.out.println("Numero"+(i+1)+":"+(numero  = aletorioEntero(1,20)));
            x.insertar(numero);
        }
    }
        public static void main(String[] args) {
         Arbol arbol = new Arbol();
         int n;
         
         
            System.out.print("Ingrese el  tamaño del arbol :");
            n=entrada.nextInt();
            ingresar_Datos(arbol, n);
            
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("\nRecorriendo postorden:");
        arbol.postorden();
        System.out.println("\nRecorriendo preorden:");
        arbol.preorden();
       
    }
}
