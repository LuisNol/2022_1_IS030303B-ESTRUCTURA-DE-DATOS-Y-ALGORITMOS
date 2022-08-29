/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Programacion.PruebaFiguras;

/**
 *
 * @author LUIS
 */
public class Circulo {
    
    private  float  radio ;

    public Circulo(float radio) {
        this.radio = radio;
    }  
        double calularArea(){
          return Math.PI*Math.pow(radio, 2);
    
    }
        
        double  calcularPerimetro(){
             return 2*Math.PI+radio;
        }
    
    
    
}
