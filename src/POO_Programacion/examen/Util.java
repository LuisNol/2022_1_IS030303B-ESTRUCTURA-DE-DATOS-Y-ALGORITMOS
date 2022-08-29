
package POO_Programacion.examen;

/**
 *
 * @author LUIS
 */
public class Util   extends Producto{
    
    private int existencia;

    public Util(String nombre, String descripcion, float precio,int existencia) {
        super(nombre, descripcion, precio);
        this.existencia = existencia;
    }

    
    
    
      void _print(){
          System.out.println( "\n\n  Util:  " + getNombre() +" Descripcion: " +   getDescripcion());
              System.out.println( " Total en existencia: " + this.existencia  +"  precio: " +  getPrecio() );
              System.out.println("\n");
   }
    
        
        }
        
    
    
}
