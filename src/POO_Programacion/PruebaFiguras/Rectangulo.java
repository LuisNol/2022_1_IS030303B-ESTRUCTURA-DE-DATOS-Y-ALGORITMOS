/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Programacion.PruebaFiguras;

/**
 *
 * @author LUIS
 */
public class Rectangulo {

    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    double calculArea() {

        return base * altura;
              
    }
    
    double  calcularPerimetro(){
        
          return (2*base +2*altura);
      
    }

}
