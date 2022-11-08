/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_11;

/**
 *
 * @author chris
 */
public class Cuadrado {
    float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    
    
    float area(){
        return this.lado*this.lado;
    } 
    float perimetro(){
        return 4*this.lado;
    }
    
}
