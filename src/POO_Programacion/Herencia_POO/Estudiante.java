/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia_POO;

/**
 *
 * @author LUIS
 */
public class Estudiante  extends  Persona {
    
     private int codigoEstudiante ;
     private float  notaFinal;

    public Estudiante( String nombre, String apellido, int edad,int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

   
    public void  mostrarDatos() {
      //  System.out.println("Nombre : " + nombre + ", \nApellido:  " + apellido + "\nEdad:   " + edad+"\n codigoEstudiante:  " + codigoEstudiante + " \n  NotaFinal :  " + notaFinal);
        System.out.println("Nombre : " +  getNombre()+ ", \nApellido:  " +  getApellido() + "\nEdad:   " +  getEdad()+"\n codigoEstudiante:  " + codigoEstudiante + " \n  NotaFinal :  " + notaFinal);
    }
     
     
    
}
