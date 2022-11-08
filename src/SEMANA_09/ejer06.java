/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author chris
 */
class Persona{
    private String name;
    private int old;
    private char sex;

    public Persona(String name, int old, char sex) {
        this.name = name;
        this.old = old;
        this.sex = sex;
    }    
    String informacion(){
        return this.name+"\t"+this.old+"\t"+this.sex;
    }
    String dato(){
        return this.name+","+this.old+","+this.sex;
    }
}
class metodo{
    ArrayList<Persona> lista=new ArrayList<>();
    File arch=new File("ABC.txt");    
    void escribir()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        try (PrintWriter pw = new PrintWriter(arch)) {
            for(Persona p: lista){
                pw.println(p.dato());
            }
        }
        
    }
    void leer()throws IOException{
        if(!arch.exists()){
            arch.createNewFile();
        }
        BufferedReader br=new BufferedReader(new FileReader(arch));
        String cad;
        while((cad=br.readLine())!=null){
            String cad2[]=cad.split(",");
            lista.add(new Persona(cad2[0],
                    Integer.parseInt(cad2[1]), 
                    cad2[2].charAt(0)));
        }
    }
    void ingresar(Persona p){
        lista.add(p);
    }
    void mostrar(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).informacion());
        }
    }
    
    void actualizar(int p,Persona x){
        lista.set(p, x);
    }
    
    void eliminar(int p){
        lista.remove(p);
    }
}
public class ejer06 {
    
       static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    
    public static void main(String[] args) throws IOException{              
          metodo met=new metodo();
         // ArrayList<metodo> met=new ArrayList<>();
        // Vector<metodo> met = new Vector<>();

         char sex,rpt;
        int anio,opcion,busq;
        String nombre;
        Scanner entrada = new Scanner(System.in);
       
        
        do {
            System.out.println("\t.:MENU:.");
                        System.out.println("1. Ingresar datos :   ");
                        System.out.println("2. Mostrar datos :   ");
                         System.out.println("3. Actualizar Datos :   ");
                        System.out.println("4. Eliminar Datos ");
                        System.out.println("5. Salir ");
                        System.out.print("Difite la opcion: ");
                        opcion=entrada.nextInt();
                       
                switch (opcion) {
                case 1 -> {
                    
                    do{
                        String listaNombre[] = {"  Luis", " Elita", " Fanny ", "Lourdes", "Walter", "Karla","Nolberto"};
                        System.out.print("Ingrese el Nombre : ");
                        System.out.print(( nombre=listaNombre[aletorioEntero(0,6)]));
                        System.out.print(" \nIngrese el  anio  : ");
                        System.out.print(anio = aletorioEntero(1,100));
                        System.out.print("\n Ingrese el sexo :");sex= entrada.next().charAt(0);
                        met.ingresar(new Persona(nombre,anio, sex));
                        met.escribir();
                        
                        System.out.println("Desea agregar mas clientes(s/n): ");
                        rpt=entrada.next().charAt(0);
                    }while( rpt== 'S' || rpt == 's');
                  }
                case 2 -> {
                    met.leer();
                    met.mostrar();
                  }
                case 3 ->{
                     do{
                         System.out.print("Ingrese el numero de que va actualizar : ");busq=entrada.nextInt();
                        met.actualizar(busq, new Persona("Castillo",300,'M'));
                        met.escribir();
                        System.out.println("Desea actualizar otro dato(s/n): ");
                        rpt=entrada.next().charAt(0);
                    }while( rpt== 'S' || rpt == 's');
                     
                
                }
                default -> System.out.println("Se equivoco de opcion de menu");
            }
        } while (opcion !=5);
        
      //  met.ingresar(new Persona("Alan",45,'M'));
      //  met.ingresar(new Persona("Toledo",30,'M'));
       // met.ingresar(new Persona("Acuña",25,'M'));
      
//       
//   met.escribir();
//      met.leer();
//        met.ingresar(new Persona("Castillo",30,'M'));
//        met.ingresar(new Persona("Keiko",1000,'M'));
  //met.mostrar();
//        System.out.println("");
//        
//        met.actualizar(3, new Persona("Castillo",300,'M'));
//        
//        met.mostrar();
//        
//        System.out.println("");
//        met.eliminar(2);
//        
//        met.mostrar();
//        
//        met.escribir();
    }
    
    
}
