
package SEMANA_13;

class perro{
    String name;
    int edad;
    public perro(String n, int e){
        this.name=n;
        this.edad=e;
    }
    String informacion(){
        return "Nombre: "+this.name+" Edad: "+this.edad;
    }
}
class nodo{
    perro dato;
    nodo sgte;
    public nodo( perro p){
        this.dato=p;
        this.sgte=null;
    }
}
class metodo{
    nodo origen, fin;
    public metodo(){
        this.fin=this.origen=null;
    }
    void ingresar( perro p){
        nodo newnodo=new nodo(p);
        //System.out.println("Entro");
        if(origen==null){
            origen=fin=newnodo;
            
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
            fin.sgte=origen;
        }
    }
    void mostrar(){
        nodo temp=origen;
        do{
            System.out.println(temp.dato.informacion());
            temp=temp.sgte;
        }while(temp!=origen);
    }
}
public class ejer03 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar(new perro("A", 10));
        m.ingresar(new perro("B", 20));
        m.ingresar(new perro("C", 5));
        m.ingresar(new perro("E", 15));
        m.ingresar(new perro("F", 0));
        m.mostrar();
    }
}
