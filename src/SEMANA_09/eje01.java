
package SEMANA_09;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author chris
 */
class Perro{
    String name;
    int old;
    public Perro(String name, int old) {
        this.name = name;
        this.old = old;
    }
    String informacion(){
        return "Nombre "+this.name+" Edad: "+this.old;
    }
}
class Metodo{
    List<Perro> lista=new LinkedList<>();
    void ingresar(Perro p){
        lista.add(p);
    }
    void mostrar(){
        java.util.ListIterator<Perro> var=lista.listIterator();
        while(var.hasNext()){
            System.out.println(var.next().informacion());
        }
    }
    void eliminar(int p){
        lista.remove(p);
    }
    void modificar(int p, Perro x){
        lista.set(p, x);
    }
}
public class eje01 {
    public static void main(String[] args) {
        Perro p1=new Perro("A",1);
        Perro p2=new Perro("B",2);
        Perro p3=new Perro("C",3);
        Perro p4=new Perro("D",4);
        Perro p5=new Perro("E",5);
        Metodo met=new Metodo();
        met.ingresar(p1);
        met.ingresar(p2);
        met.ingresar(p3);
        met.ingresar(p4);
        met.ingresar(p5);
        met.mostrar();
        System.out.println("Proceso Eliminar");
        met.eliminar(2);
        met.modificar(2, new Perro("X",5));
        met.mostrar();
    }
}
