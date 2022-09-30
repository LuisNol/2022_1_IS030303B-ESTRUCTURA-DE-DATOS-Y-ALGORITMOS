/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_08;

import java.util.Vector;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
interface  Estado{
      void  mostrarEstado();

}

interface   LugarProducto{
     void   mostrarLlugar ();
}


        
class Productos  implements Estado,LugarProducto {

    private String nombre;
    private float precio;
    private String descripcion;

    public Productos(String nombre, float precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + '}';
    }

    public float calcular(int cantidad_productos) {

        float fin = precio * cantidad_productos;
        setPrecio(fin);
        return fin;
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El producto esta en buen estado ");
    }

    @Override
    public void mostrarLlugar() {
           System.out.println("El producto se  trasporto de Huanuco");
        
    }

}

class ClaveP extends Productos {

    private int clave;

    public ClaveP(int clave, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "producto_largo tiempo {" + "clave=" + clave + '}';
    }

    public float calcular(int cantidad_productos) {
        System.out.println("Tiempo  largo de vencimiento ");
        float fin = getPrecio() * cantidad_productos;
        setPrecio(fin);
        return fin;
    }

}

class TiempoDuracion extends Productos {

    private int dias_para_caducar;

    public TiempoDuracion(int dias_para_caducar, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.dias_para_caducar = dias_para_caducar;

    }

    @Override
    public String toString() {
        return "Dias_para_caducar=" + dias_para_caducar + '}';
    }

    public int getDias_para_caducar() {
        return dias_para_caducar;
    }

    public void setDias_para_caducar(int dias_para_caducar) {
        this.dias_para_caducar = dias_para_caducar;
    }

    float precio_total = 0;

    public float calcular(int cantidad_productos) {
        System.out.println("Tiempo corto de  vencimiento");
        float precio_final = super.calcular(cantidad_productos);
        System.out.println("Precio total:" + precio_final + " \n * Aplicando descuento por caducidad...");
        if (getDias_para_caducar() == 5) {
            precio_total = precio_final - (precio_final / 4);
            setPrecio(precio_total);
        } else if (getDias_para_caducar() == 15) {
            precio_total = precio_final - (precio_final / 3);
            setPrecio(precio_total);
        } else if (getDias_para_caducar() == 30) {
            precio_total = precio_final - (precio_final / 2);
            setPrecio(precio_total);
        }
        return precio_total;
    }

}

public class Archivo_01 {

    //N   O  L  B  E R  T  O     8                                     4 classes
    // S  U   M   A  R  A  N    7       Abarrotes         4 inteface
    public static void main(String[] args) {
       // Vector<Vehiculo> miVehiculo = new Vector<>();
      // Vector < Productos> productos  = new  Vector();
        //Productos[] productos = new Productos[6];
       // productos.add( new TiempoDuracion(5, "Capsu", 25, "Jugo rojo agridulce"));
     //   productos.add(new TiempoDuracion(15, "Paleta", 12, "Dulce rojo"));
       // productos.add(new TiempoDuracion(30, "Dulce 2", 28, "Dulce 2 tambien"));
       // productos.add( new ClaveP(12, "Churrumais", 12, "Palitos de maiz"));
     //   productos.add(new ClaveP(32, "Galletitas", 29, "Galletita abuelita"));
      //  productos[5] = new ClaveP(69, "Marias", 36, "Galletas marias");
      
      Productos[] productos = new Productos[6];
        productos[0] = new TiempoDuracion(5, "Capsu", 25, "Jugo rojo agridulce");
        productos[1] = new  TiempoDuracion(15, "Paleta", 12, "Dulce rojo");
        productos[2] = new TiempoDuracion(30, "Dulce 2", 28, "Dulce 2 tambien");
        productos[3] = new ClaveP(12, "Churrumais", 12, "Palitos de maiz");
        productos[4] = new ClaveP(32, "Galletitas", 29, "Galletita abuelita");
        productos[5] = new ClaveP(69, "Marias", 36, "Galletas marias");
        
    
      
       
            for (int i = 0; i < productos.length; i++) {
            System.out.println("Precio del producto " + (i + 1) + " es " + productos[i].getPrecio() + " x  5 productos ");
            System.out.println("* Total a pagar: " + productos[i].calcular(5));
        }
    }
}

