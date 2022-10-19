/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_05;

/**
 *
 * @author LUIS
 */
 class Operaciones{
        private  int numeroA;
        private   int numeroB;

        public Operaciones(int numeroA, int numeroB){
            this.numeroA=numeroA;
            this.numeroB=numeroB;
        }
        public void mostrar_datos(){
            System.out.println("El valor de A es : " + numeroA);
            System.out.println("El valor de B es : " + numeroB);
        }

    }
public class Ejercicio_01 {
     
    public static void main(String[] args) {
        Operaciones    prueba1 =  new    Operaciones (4, 8);
        prueba1.mostrar_datos();
            
        }
}
