
package SEMANA_13;

class nodo{
    int dato;
    nodo ant;
    nodo sgte;
    public nodo(int x){
        this.dato=x;
        this.ant=this.sgte=null;
    }
    int informacion(){
        return this.dato;
    }
}
class metodo{
    nodo origen, fin;
    public metodo(){
        this.origen=null;
        this.fin=null;
    }
    void ingresar(int x){
        nodo newnodo=new nodo(x);
        if(origen==null){
            fin=origen=new nodo(x);
        }else{
            newnodo.sgte=origen;
            origen.ant=newnodo;
            origen=newnodo;
        }
    }
    void mostrarp(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.informacion()+"\t");
            temp=temp.sgte;
        }
    }
    void mostrarc(){
        nodo temp=fin;
        while(temp!=null){
            System.out.print(temp.informacion()+"\t");
            temp=temp.ant;
        }
    }
}

public class ejer01_ {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar(5);
        m.ingresar(7);
        m.ingresar(8);
        m.ingresar(2);
        m.ingresar(3);
        System.out.println("Por Pila");
        m.mostrarp();
        System.out.println("\nPor cola");
        m.mostrarc();
                
    }
}
