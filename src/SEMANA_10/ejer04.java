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
 * @author chris
 */
class ventana extends JFrame{
    public ventana(){
        super("Mi registro");
    }
    void ejecutar(){
        JButton btnname=new JButton("Aceptar");
        Container conteiner=this.getContentPane();
        conteiner.add(new JButton("Arriba"),BorderLayout.NORTH);
        conteiner.add(new JButton("IZQ"),BorderLayout.EAST);
        conteiner.add(new JButton("CENTRO"),BorderLayout.CENTER);
        conteiner.add(new JButton("DER"),BorderLayout.WEST);
        conteiner.add(new JButton("Abajo"),BorderLayout.SOUTH);
        //name.setText("Christian");
        this.setSize(400, 400);
        this.setVisible(true);        
        //this.add(btnname);
    }
}
public class ejer04 {
    public static void main(String[] args) {
        new ventana().ejecutar();
    }
}
