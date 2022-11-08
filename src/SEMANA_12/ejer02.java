/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_12;

/**
 *
 * @author chris
 */
class perro{
    String name;
    public perro(String n){
        this.name=n;
    }
    String informacion(){
        return this.name;
    }
}
class nodo{
    perro dato;
    nodo sgte;
    public nodo(String n){
        dato=new perro(n);
        this.sgte=null;
    }
}
class metodo{
    nodo origen=null;
    void ingresar(String n){
        nodo newnodo=new nodo(n);
        if(origen==null){
            origen=newnodo;
        }else{
            newnodo.sgte=origen;
            origen=newnodo;
        }
    }
    void mostrar(){
        nodo temp=origen;
        while(temp!=null){
            System.out.print(temp.dato.informacion()+"--->");
            temp=temp.sgte;
        }
    }
    
    
}
public class ejer02 {

    public static void main(String[] args) {
        metodo m=new metodo();
        m.ingresar("Dito");
        m.ingresar("Popo");
        m.ingresar("Fido");
        m.ingresar("Taz");
        m.mostrar();
    }
}
