/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Programacion.Ejercicio_08;

/**
 *
 * @author LUIS
 */
public class Paquete {

    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad; // 0=normal, 1=alta, 2=express

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
    
    public String mostrarDatosPaquete(){
        return "Numero Paquete: "+numeroPaquete   +"\nDNI: "+dni+"\nPeso: "+peso    +"\nPrioridad: "+prioridad;
    }
    
    
}
