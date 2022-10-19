/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_10;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
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
       JButton btnname = new JButton("Aceptar");
       Container conteiner=this.getContentPane();
       conteiner.add(new JButton("Arriba"),BorderLayout.NORTH);
       
     this.setSize(400,400);
    this.setVisible(true);
     this.add(btnname);
   }
}
public class Ejercicio_05 {
    public static void main(String[] args) {
        new ventana().ejecutar();
    }
    
}
