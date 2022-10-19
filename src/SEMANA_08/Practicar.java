
package SEMANA_08;
/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
interface  Personal {
    public void AreaTtabajo(String area);
    public void codigoTrabajo(String codigo);
    

}
class Persona{
    protected String dni;
   protected String fechaNacimiento;
    protected String apellidoPaterno;
    protected String apellidoMateno;
   protected String  nombres;

    public Persona(String dni, String fechaNacimiento, String apellidoPaterno, String apellidoMateno, String nombres) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMateno = apellidoMateno;
        this.nombres = nombres;
    }

 
    public String mostrarDatos() {
        return  "Dni :  " + dni + "\nFecha  Nacimiento  : " + fechaNacimiento + "\nApellido  Paterno :  " + apellidoPaterno + "\n Apellido Mateno  : " + apellidoMateno + "\n Nombres=" + nombres ;
    }
}
class Docente extends Persona implements    Personal{
    private String  profesio;
    private double  horas_por_Semana;
    String area1,codigo1;


    public Docente(String dni, String fechaNacimiento, String apellidoPaterno, String apellidoMateno, String nombres,String profesio, double horas_por_Semana) {
        super(dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres);
        this.profesio = profesio;
        this.horas_por_Semana = horas_por_Semana;
    }

 public void enseñar(){
        System.out.println("El docente esta enseñando en el aula.");
    }
   public void calificar(){
        System.out.println("El docente califica los examenes de medio curso.");
    }
    @Override
    public   String mostrarDatos(){
                  return  "Dni :  " + dni + "\nFecha  Nacimiento  : " + fechaNacimiento + "\nApellido  Paterno :  " + apellidoPaterno + 
                    "\n Apellido Mateno  :  " + apellidoMateno + "\nNombres : " + nombres  +"\nProfesion  :  "+profesio +"\nHoras trabajadas po Semana  :  "+ horas_por_Semana+
                          "\nEl  area del  trabajador  es  "+ area1 +"\nEl codigo  del  trabajador es  "+codigo1+"\n"; 
    }

    @Override
    public void AreaTtabajo(String area) {
        area1= area;
    }

    @Override
    public void codigoTrabajo(String codigo) {
        codigo1=codigo;
    }
    
}

   class  Administrativo extends  Persona  implements Personal{
       private String cargo;
       private double   horas_Por_Semana;
       String area2,codigo2;

    public Administrativo(String dni, String fechaNacimiento, String apellidoPaterno, String apellidoMateno, String nombres,String cargo, double horas_Por_Semana) {
        super(dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres);
        this.cargo = cargo;
        this.horas_Por_Semana = horas_Por_Semana;
    }
    
    public void usar_SIAF(){
    System.out.println("usar_SIAF");
}
public void procesar_gastos(){
    System.out.println("Los administrativos procesan los gastos");}
    
       @Override
     public   String mostrarDatos(){
                  return  "Dni :  " + dni + "\nFecha  Nacimiento  : " + fechaNacimiento + "\nApellido  Paterno :  " + apellidoPaterno + 
                          "\nApellido Mateno  :  " + apellidoMateno + "\nNombres  : " + nombres  +"\nCargo  :  "+cargo +"\nHoras trabajadas po Semana  :  "+ horas_Por_Semana+
                            "\nEl  area del  trabajador es  "+ area2 +"\nEl codigo  del  trabajador es  "+codigo2+"\n"; 
    }

  @Override
    public void AreaTtabajo(String area) {
        area2= area;
   
    }

    @Override
    public void codigoTrabajo(String codigo) {
        codigo2=codigo;
     
    }

    }
    
class Practicante extends Persona implements Personal{
      private String  especialidad;
      private double  horasTranajadasSemanas;
      String area1,area3,codigo3;
       String estado;

    public Practicante( String dni, String fechaNacimiento, String apellidoPaterno, String apellidoMateno, String nombres ,String especialidad, double horasTranajadasSemanas) {
        super(dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres);
        this.especialidad = especialidad;
        this.horasTranajadasSemanas = horasTranajadasSemanas;
    }
   public void digitar_datos(){
    System.out.println("Los practicantes digitan los datos.");
}
   public void controlAsistencia(String n) {
        
        estado = ( "y".equals(n)) ? "Asistio" : "No  Asistio";
      //  return estado;
    }

      @Override
     public   String mostrarDatos(){
                  return  "Dni  :  " + dni + "\nFecha  Nacimiento  : " + fechaNacimiento + "\nApellido  Paterno :  " + apellidoPaterno + 
                          "\nApellido Mateno  :  " + apellidoMateno + "\nNombres : " + nombres  +"\nEspecialidad  :  "+especialidad +"\nHoras trabajadas po Semana  :  "+ horasTranajadasSemanas+
                          "\nEl  area del  trabajador  es  "+ area3 +"\nEl codigo  del  trabajador  es  "+codigo3+"\nEl registo de asistencia : "+estado+"\n"; 
    }
     
     @Override
    public void AreaTtabajo(String area) {
        area3= area;
    }

    @Override
    public void codigoTrabajo(String codigo) {
        codigo3=codigo;
    }

}

public class Practicar {
       static Scanner entrada = new Scanner(System.in);
      public static void  registrarDatosDocente( Docente [] myPersona,int cont1){
             String dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres,profesion,areaT,codigoT;
              double horas_por_Semana;
                  System.out.println("\nDatos de Docente  " + (cont1+ 1) + ":");
                                   entrada.nextLine();
                                System.out.print("Ingresa el Dni : ");  dni= entrada.next();
                                System.out.print("Ingrese su fecha de nacimiento  : ");   fechaNacimiento = entrada.nextLine();
                                entrada.nextLine();
                                System.out.print("Ingresa  Apellido  paterno  :  ");   apellidoPaterno= entrada.nextLine();
                                System.out.print("Ingrese Apellido  Materno : "); apellidoMateno=entrada.nextLine();
                                System.out.print("Ingresa  su nombre completo:  ");   nombres = entrada.nextLine();
                                System.out.print("Ingrese su profecion :");     profesion=entrada.nextLine();
                                System.out.print("Ingrese la hora trabajda por semana : ");   horas_por_Semana= entrada.nextDouble();
                                entrada.nextLine();
                                System.out.print("Ingresa el area del Trabajo : ");   areaT=entrada.nextLine();
                                System.out.print("Ingresa  el  codigo del Trabajodor : ");codigoT=entrada.nextLine();
                                myPersona[cont1]= new Docente(dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres, profesion, horas_por_Semana);
                                myPersona[cont1].AreaTtabajo(areaT);
                                myPersona[cont1].codigoTrabajo(codigoT);
      }
        public static void  registrarDatosAdministrativo( Administrativo [] myPersona,int cont2){
             String dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres,cargo,areaT2,codigoT2;
              double horas_por_Semana;
                  System.out.println("\nDatos de Administrativo " + (cont2+ 1) + ":");
                                entrada.nextLine();
                                System.out.print("Ingresa el Dni : ");  dni= entrada.nextLine();
                                System.out.print("Ingrese su fecha de nacimiento  : ");   fechaNacimiento =entrada.nextLine();
                                entrada.nextLine();
                                System.out.print("Ingresa  Apellido  paterno  :  ");   apellidoPaterno= entrada.nextLine();
                                System.out.print("Ingrese Apellido  Materno : "); apellidoMateno=entrada.nextLine();
                                System.out.print("Ingresa  su nombre completo:  ");   nombres = entrada.nextLine();
                                System.out.print("Ingrese su Cargo :");     cargo=entrada.nextLine();
                                System.out.print("Ingrese la hora trabajda por semana : ");   horas_por_Semana= entrada.nextDouble();
                                entrada.nextLine();
                                 System.out.print("Ingresa el area del Trabajo : ");   areaT2=entrada.nextLine();
                                System.out.print("Ingresa  el  codigo del Trabajodor : ");codigoT2=entrada.nextLine();
                                myPersona[cont2]= new Administrativo(dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres, cargo, horas_por_Semana);
                                myPersona[cont2].AreaTtabajo(areaT2);
                                 myPersona[cont2].codigoTrabajo(codigoT2);
      }
           
    public static void  registrarDatosPracticante( Practicante [] myPersona,int cont3){
             String dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres,especialidad,areaT3,codigoT3,estado;
              double horas_por_Semana;
                  System.out.println("\nDatos de Participante " + (cont3+ 1) + ":");
                              entrada.nextLine();
                                System.out.print("Ingresa el Dni : ");  dni=   entrada.nextLine();
                                System.out.print("Ingrese su fecha de nacimiento  : ");   fechaNacimiento = entrada.nextLine();
                                entrada.nextLine();
                                System.out.print("Ingresa  Apellido  paterno  :  ");   apellidoPaterno= entrada.nextLine();
                                System.out.print("Ingrese Apellido  Materno : "); apellidoMateno=entrada.nextLine();
                                System.out.print("Ingresa  su nombre completo:  ");   nombres =entrada.nextLine();
                                System.out.print("Ingrese su Especialidad :");     especialidad=entrada.nextLine();
                                System.out.print("Ingrese la hora trabajda por semana : ");   horas_por_Semana= entrada.nextDouble();
                                entrada.nextLine();
                                System.out.print("Ingresa el area del Trabajo : ");   areaT3=entrada.nextLine();
                                System.out.print("Ingresa  el  codigo del Trabajodor : ");codigoT3=entrada.nextLine();
                                System.out.print("Ingreses su asistencia    y o   n  : ");  estado=entrada.nextLine();
                                myPersona[cont3]= new Practicante(dni, fechaNacimiento, apellidoPaterno, apellidoMateno, nombres, especialidad, horas_por_Semana);
                                myPersona[cont3].AreaTtabajo(areaT3);
                                myPersona[cont3].codigoTrabajo(codigoT3);
                                myPersona[cont3].controlAsistencia(estado);
      }
      public static void   mostrarDatosDocente(Docente [] myPersona,int cont1){
            for (int i = 0; i <cont1 ; i++) {
                                 System.out.println("\nMostrando datos del docente  No  " + (i + 1) + ":");
                                    System.out.println(myPersona[i].mostrarDatos());
                                
                                }
      }
      
         public static void   mostrarDatosAdministrativo(Administrativo [] myPersona,int cont2){
            for (int i = 0; i <cont2 ; i++) {
                                 System.out.println("\nMostrando datos del Administrativo No  " + (i + 1) + ":");
                                    System.out.println(myPersona[i].mostrarDatos());
                                }
      }
         public static void   mostrarDatosPracticante(Practicante [] myPersona,int cont3){
            for (int i = 0; i <cont3 ; i++) {
                                 System.out.println("\nMostrando datos del Practicante No  " + (i + 1) + ":");
                                    System.out.println(myPersona[i].mostrarDatos());
                                }
      }
      
      
    public static void main(String[] args) {
      int opcion,cont1=0,cont2=0,cont3=0;
           Docente  docentes[]=  new  Docente[20];
           Administrativo administrativos[]= new Administrativo[20];
           Practicante practicantes[]= new Practicante[20];
           do {
                       System.out.println("\t.:MENU:.");
                        System.out.println("1. Ingresar datos del Docente :   ");
                        System.out.println("2. Ingresar datos Administrativo :   ");
                         System.out.println("3. Ingresar datos del  Practicante :   ");
                        System.out.println("4. Mostrar datos del Docente ");
                        System.out.println("5. Mostrar datos del Administrativo ");
                        System.out.println("6. Mostrar datos del Practicante ");
                        System.out.println("7. Salir ");
                        System.out.print("Difite la opcion: ");
        
                    opcion=entrada.nextInt();
           
           switch (opcion) {
            case 1 :
                   registrarDatosDocente(docentes,cont1);
               cont1++;
                break;
            case 2 :
                 registrarDatosAdministrativo(administrativos, cont2);
                 cont2++;
                   break;
            case 3 :
                  registrarDatosPracticante(practicantes, cont3);
                  cont3++;
                   break;
            case 4: 
                 mostrarDatosDocente(docentes,cont1);
                 break;
            case 5 :
                mostrarDatosAdministrativo(administrativos, cont2);
                break;
            case 6: 
                mostrarDatosPracticante(practicantes, cont3);
            default:
                
               System.out.println("Se equivoco de opcion de menu");
                    break;
        }
           
           } while (opcion !=7);
 
    }
}
