/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Programacion.Ejersicio_04;

/**
 *
 * @author LUIS
 */
public class Atleta {

    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    //Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador() {
        return "Numero Atleta: " + numeroAtleta + "\nNombre: " + nombre + "\nTiempo de Carrera: " + tiempoCarrera + "\n";
    }
}
