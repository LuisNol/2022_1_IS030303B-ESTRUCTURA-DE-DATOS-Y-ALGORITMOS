/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_10;

import javax.swing.JFrame;

/**
 *
 * @author sumaran
 */

class ventana extends JFrame{
   public ventana(){
      super("Mi Registro");
   }
   
   void ejecutar(){
       
     this.setSize(400,400);
     this.setVisible(true);
   }
}
public class Ejercicio_03 {
    public static void main(String[] args) {
         new ventana().ejecutar();
         
         
    }
    
}
