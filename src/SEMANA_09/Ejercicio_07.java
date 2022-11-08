package SEMANA_09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */



class Alumno{
    
       public String name;

    public Alumno(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
       
}

class Registro extends Alumno{
    
    public String estado;

    public Registro() {
        super(null);
        this.n1 = 0;
        this.n2 = 0;
        this.n3 = 0;
    }
    private  int n1;
    private  int n2;
    private int n3;
    
    public Registro(String name, int nota1, int nota2, int nota3) {
        super(name);
        this.n1 = nota1;
        this.n2 = nota2;
        this.n3 = nota3;
    }
   
    public Float Promedio() {
        float pr= (float)(n1+n2+n3)/3;
        return pr;
    }
    
    public String Estado() {
        String est;
        est = ( Promedio()>=10.5) ? "APROBADO" : "DESAPROBADO";
        
        return est;
    }
    
    String Informacion() {
        return  "\nNombre: " + this.getName()+ "\nnota 1: " + n1 + "\nnota 2: " + n2 +
                "\nnota 3: " + n3+"\nESTADO:  "+this.Estado() ;
    }
    
     String dato(){
        return this.getName()+","+n1+"-"+n2+"-"+n3+"\t"+this.Estado();
    }
}


class metodo{
    ArrayList<Registro> lista=new ArrayList<>();
    File arch = new File("REGISTRO.txt"); // CREANDO TXT
    
    void escribir()throws IOException{   //ESCRIBE EL OBJETO EN EL TXT
        if(!arch.exists()){
            arch.createNewFile();
        }
        PrintWriter pw=new PrintWriter(arch);
        for(Registro s: lista){
            pw.println(s.dato());
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
            lista.add(new Registro( cad2[0],
                    Integer.parseInt(cad2[1]), Integer.parseInt(cad2[2]),Integer.parseInt(cad2[3]))  );
        }
    }
    
    void ingresar(Registro p){        //INGRESAR ESTUDIANTE A LA LISTA
        lista.add(p);
    }
    
    void mostrar(){                                // MOSTRAR EN CONSOLA
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).Informacion());
        }
    }
    
}

public class Ejercicio_07 {
         static int aletorioEntero(int min, int max) {
        Random rd = new Random();
        int r = rd.nextInt((max - min) + 1) + min;
        return r;
    }
    public static void ingresar_Datos(metodo x,int n){
   
        int nota1,nota2,nota3;
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("\nALUMNO "+(i+1));
            System.out.print("Nombre : ");String name = entrada.nextLine();           
            System.out.print(" Ingrese la nota1  : ");
            System.out.print(nota1 = aletorioEntero(1,20));
            System.out.print("\n Ingrese la nota2  :");
            System.out.print(nota2 = aletorioEntero(1, 20));
            System.out.print("\n Ingrese la nota3:  ");
           System.out.print(nota3 = aletorioEntero(1, 20)); 
            x.ingresar(new Registro(name,nota1,nota2,nota3));   
            entrada.nextLine();
        
        }
    }
    
    public static void main(String[] args) throws IOException {
        metodo met=new metodo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("NUMERO DE ALUMNOS A INGRESAR: ");
        int n= entrada.nextInt();
        ingresar_Datos(met,n);
       
        met.escribir(); //ESCRIBE EN EL TXT
        met.mostrar(); //MUESTRA EN PANTALLA

    }
}