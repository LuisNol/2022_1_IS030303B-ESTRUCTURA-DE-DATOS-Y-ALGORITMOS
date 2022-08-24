
package POO_Programacion.Ejersicio_03;

/**
 
    Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca,
    modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberán leer por
    teclado las características de cada vehículo y crear una clase que represente a cada uno de 
    ellos.

 * @author LUIS
 */
public class Vehiculo {
           private  String marca;
           private String modelo;
           private float  precio;
 

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
    }
           
           
}
