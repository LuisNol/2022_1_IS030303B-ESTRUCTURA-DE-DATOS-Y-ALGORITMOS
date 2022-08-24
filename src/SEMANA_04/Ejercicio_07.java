/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_04;

/**
 *
 * @author LUIS
 */
interface costante {

    int n = 5;

}

class fruta {

    private String name;
    private float price;

    public fruta(String name, float price) {
        this.name = name;
        this.price = price;

    }


    String Informacion() {
        return "fruta{" + "name=" + this.name + ", price=" + this.price + '}';
    }
    
}

    class Canasta implements costante {

        fruta lista[] = new fruta[n];
        int cont = 0;
        
    

        void rellenar(fruta p) {
            lista[cont] = p;

            cont++;
        }
    
        void mostrar() {
            int i = 0;
            do {

                System.out.println(lista[i].Informacion());
                i++;
            } while (cont != i);
        }
        }

    



public class Ejercicio_07 {

    public static void main(String[] args) {
          Canasta canasta1 = new  Canasta();
          
          canasta1.rellenar(new fruta("Platano ",12.5f));
          canasta1.mostrar(); 
    }

}
