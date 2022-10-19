/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_09;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
        PrintWriter pw=new PrintWriter(arch);
        for(Persona p: lista){
            pw.println(p.dato());
        }
        pw.close();
        
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
public class Ejercicio_06 {
    public static void main(String[] args) throws IOException{              
        metodo met=new metodo();
        /**met.ingresar(new Persona("Alan",45,'M'));
        met.ingresar(new Persona("Toledo",30,'M'));
        met.ingresar(new Persona("Acuña",25,'M'));**/
        //met.mostrar();
        //met.escribir();
        met.leer();
//        met.ingresar(new Persona("Castillo",30,'M'));
//        met.ingresar(new Persona("Keiko",1000,'M'));
        met.mostrar();
        System.out.println("");
        
        met.actualizar(3, new Persona("Castillo",300,'M'));
        
        met.mostrar();
        
        System.out.println("");
        met.eliminar(2);
        
        met.mostrar();
        
        met.escribir();
    }
    
    
}