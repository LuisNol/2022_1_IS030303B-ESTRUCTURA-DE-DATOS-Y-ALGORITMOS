

package SEMANA_09;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */
class Fruta{
    private String name;

    public Fruta(String name) {
        this.name = name;
    }
    String informacion(){
        return this.name;
    }
}
class cesta{
    Queue<Fruta> lista=new LinkedList<Fruta>();
    void meter(Fruta p){
        lista.add(p);
    }
    void sacar(){
        lista.poll();
    }
    void mostrar(){
        for (Fruta x : lista) {
            System.out.println(x.informacion());
        }
    }
}
public class Ejercicio_02 {
    public static void main(String[] args) {
        Fruta f1=new Fruta("Pera");
        Fruta f2=new Fruta("Uva");
        Fruta f3=new Fruta("Manzana");
        Fruta f4=new Fruta("Melon");
        Fruta f5=new Fruta("Sandia");
        Fruta f6=new Fruta("Mango");
        cesta canasta=new cesta();
        canasta.meter(f1);
        canasta.meter(f2);
        canasta.meter(f3);
        canasta.meter(f4);
        canasta.meter(f5);
        canasta.meter(f6);
        canasta.mostrar();
        System.out.println("Retiramos un fruta");
        canasta.sacar();
        canasta.sacar();
        canasta.sacar();
        System.out.println(canasta.lista.peek().informacion());
    }
}

