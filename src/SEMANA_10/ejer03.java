/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_10;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;

/**
 *
 * @author chris
 */
class ventana extends JFrame{
    public ventana(){
        super("Mi registro");
    }
    void ejecutar(){
        JButton btnname=new JButton("Aceptar");
        //name.setText("Christian");
        this.setSize(400, 400);
        this.setVisible(true);        
        this.add(btnname);
    }
}
public class ejer03 {
    public static void main(String[] args) {
        new ventana().ejecutar();
    }
}
