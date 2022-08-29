package POO_Programacion.examen;

/**
 *
 * @author LUIS
 */
public class Producto {

    private String nombre;
    private String descripcion;
    private float precio;

    public Producto(String nombre, String descripcion, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    

}
