/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_10;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author chris
 */
class ventana extends JFrame{
    public ventana(){
        super("Mi registro");
    }
    void ejecutar(){
        JLabel name=new JLabel();
        name.setText("Christian");
        this.setSize(400, 400);
        this.setVisible(true);
        this.add(name);
    }
}
public class ejer02 {
    public static void main(String[] args) {
        new ventana().ejecutar();
    }
}
