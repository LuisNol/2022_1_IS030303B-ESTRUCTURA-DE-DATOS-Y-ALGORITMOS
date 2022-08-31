
package POO_Programacion.EjemploCso_POOH;

import java.util.Scanner;

/**
 *
 * @author LUIS
 */
class Persona {

    private String Nombre;
    private int edad;
    private String sexo;
    private String fechaNacimiento;

    public Persona(String Nombre, int edad, String sexo, String fechaNacimiento) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

}

class Policia extends Persona {

    private String gradoMilitar;
    private double sueldo;

    public Policia(String Nombre, int edad, String sexo, String fechaNacimiento, String gradoMilitar, double sueldo) {
        super(Nombre, edad, sexo, fechaNacimiento);
        this.gradoMilitar = gradoMilitar;
        this.sueldo = sueldo;
    }

    public String infomacionPolicia() {
        return "\nNombre :   " + this.getNombre() + "\nEdad  :  " + this.getEdad() + "\nSexo  :  " + this.getSexo() + "\nFecha Nacimiento :  " + this.getFechaNacimiento()
                + "\nGradoMilitar  : " + gradoMilitar + ",\n Sueldo  : " + sueldo;

        //System.out.println("Datos de Policia{" +"\nNombre :   "+this.getNombre()+"\nEdad:  "+this.getEdad()+"\nSexo:  "+this.getSexo()+"\nFecha Nacimiento "+this.getFechaNacimiento()+
        //     "\nGradoMilitar=" + gradoMilitar + ",\n Sueldo=" + sueldo + '}');
        //  System.out.println("\n");
    }

}

class Mecanico extends Persona {

    private String especialidad;

    public Mecanico(String Nombre, int edad, String sexo, String fechaNacimiento, String especialidad) {
        super(Nombre, edad, sexo, fechaNacimiento);
        this.especialidad = especialidad;
    }

    public String infomacionMecanico() {
        
         return "\nNombre :   " + this.getNombre() + "\nEdad  :  " + this.getEdad() + "\nSexo  :  " + this.getSexo() + "\nFecha Nacimiento :  " + this.getFechaNacimiento()
                + "\nEspecialidad : " +especialidad ;
     //   System.out.println("Datos de Mecanico{" + "\nNombre :   " + this.getNombre() + "\nEdad:  " + this.getEdad() + "\nSexo:  " + this.getSexo() + "\nFecha Nacimiento " + this.getFechaNacimiento()
       //         + "\nEspicialidad=" + espicialidad + '}');
        //System.out.println("\n");
    }
}

class Profesor extends Persona {

    private String titulo;
    private double sueldo;

    public Profesor(String Nombre, int edad, String sexo, String fechaNacimiento, String titulo, double sueldo) {
        super(Nombre, edad, sexo, fechaNacimiento);
        this.titulo = titulo;
        this.sueldo = sueldo;
    }

    public String informacionProfesor() {
         return "\nNombre :   " + this.getNombre() + "\nEdad  :  " + this.getEdad() + "\nSexo  :  " + this.getSexo() + "\nFecha Nacimiento :  " + this.getFechaNacimiento()
                + "\nTitulo  : " +titulo+ "\nSueldo :  "+sueldo ;
   //     System.out.println("Datos de Mecanico{" + "\nNombre  :  " + this.getNombre() + "\nEdad  :  " + this.getEdad() + "\nSexo : " + this.getSexo() + "\nFecha Nacimiento  :  " + this.getFechaNacimiento()
      //          + "\nTitulo :  " + titulo + "\nSueldo  :  " + sueldo + '}');
      //  System.out.println("\n");
    }

}

public class Practico_01 {

    public static void main(String[] args) {
        String nombre,sexo,fechaNacimiento,titulo,especialidad,gradoMilita, nombre2,sexo2,fechaNacimiento2,nombre1,sexo1,fechaNacimiento1;
           
        int edad,edad1,edad2;
        double sueldo,sueldo1;
        int opcion, cont1 = 0,cont2=0,cont3=0;;
        Scanner entrada = new Scanner(System.in);
        // Policia policia1 = new  Policia("Luis",20,"Masculino","1997/04/30","General",2000);
        // policia1.infomacionPolicia();

        //   Mecanico  mecanico1 =  new  Mecanico("Luis",20,"Masculino","1997/04/30","Automotriz");
        //mecanico1.infomacionMecanico();
        // Profesor  profesor1 =new Profesor("Luis",20,"Masculino","1997/04/30","Magister",200000);
        //   profesor1.informacionProfesor();
        Policia policias[] = new Policia[20];
        Mecanico mecanicos[] = new Mecanico[10];
        Profesor profesores[] = new Profesor[10];
        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Crear  Policia  ");
            System.out.println("2. Crear Mecanico");
            System.out.println("3. Crear  Profesor ");
            System.out.println("4. Salir ");
            System.out.print("Difite la opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    int opcion1;
                    //  int cont1 = 0;
                    do {
                        System.out.println("\t.:MENU:.");
                        System.out.println("1. Ingresar datos de Policia :   ");
                        System.out.println("2. Mostrar Datos de Policia ");
                        System.out.println("3. Salir ");
                        System.out.print("Difite la opcion: ");
                        opcion1 = entrada.nextInt();

                        switch (opcion1) {
                            case 1:
                                System.out.println("\nDatos de Policia  " + (cont1 + 1) + ":");
                                System.out.print("Ingresa el Nombre : ");
                                nombre = entrada.next();
                                System.out.print("Ingrese su Edad : ");
                                edad = entrada.nextInt();
                                System.out.print("Imgresa  el Sexo :  ");
                                sexo = entrada.next();
                                System.out.print("Ingrese Fecha de Nacimiento : ");
                                fechaNacimiento = entrada.next();
                                System.out.print("Ingresa  el  Grado  Melitar :  ");
                                gradoMilita = entrada.next();
                                System.out.print("Ingrese el  Sueldo : ");
                                sueldo = entrada.nextDouble();

                                policias[cont1] = new Policia(nombre, edad, sexo, fechaNacimiento, gradoMilita, sueldo);
                                cont1++;
                              
                                break;
                            case 2:
                                for (int i = 0; i < cont1; i++) {
                                    System.out.println("\nMostrando datos de la Policia  N°" + (i + 1) + ":");
                                    System.out.println(policias[i].infomacionPolicia());
                                }
                                break;
                            case 3:
                                break;

                            default:
                                System.out.println("Se equivoco de opcion de menu");
                                break;
                        }

                    } while (opcion1 != 3);

                case 2:
                                  int opcion2;
                    //  int cont1 = 0;
                    do {
                        System.out.println("\t.:MENU:.");
                        System.out.println("1. Ingresar datos de  Mecanico :   ");
                        System.out.println("2. Mostrar Datos de Mecanico ");
                        System.out.println("3. Salir ");
                        System.out.print("Difite la opcion: ");
                        opcion2 = entrada.nextInt();

                        switch (opcion2) {
                            case 1:
                                System.out.println("\nDatos de Policia  " + (cont2+ 1) + ":");
                                System.out.print("Ingresa el Nombre : ");
                                nombre1 = entrada.next();
                                System.out.print("Ingrese su Edad : ");
                                edad1 = entrada.nextInt();
                                System.out.print("Imgresa  el Sexo :  ");
                                sexo1= entrada.next();
                                System.out.print("Ingrese Fecha de Nacimiento : ");
                                fechaNacimiento1 = entrada.next();
                                System.out.print("Ingresa  la  Especialidad:  ");
                                especialidad = entrada.next();
    
                                mecanicos[cont2] = new   Mecanico(nombre1, edad1, sexo1, fechaNacimiento1,   especialidad);
                                cont2++;
                              
                                break;
                            case 2:
                                for (int i = 0; i < cont2; i++) {
                                    System.out.println("\nMostrando datos de la  Mecanico  N°" + (i + 1) + ":");
                                    System.out.println(mecanicos[i].infomacionMecanico());
                                }
                                System.out.println("\n");
                                break;
                            case 3:
                                break;

                            default:
                                System.out.println("Se equivoco de opcion de menu");
                                break;
                        }

                    } while (opcion2 != 3);
                    break;
                case 3:
                     int opcion3;
                    //  int cont1 = 0;
                    do {
                        System.out.println("\t.:MENU:.");
                        System.out.println("1. Ingresar datos de  Profesor :   ");
                        System.out.println("2. Mostrar Datos de Profesor");
                        System.out.println("3. Salir ");
                        System.out.print("Difite la opcion: ");
                        opcion3 = entrada.nextInt();

                        switch (opcion3) {
                            case 1:
                                System.out.println("\nDatos de Profesor  " + (cont3+ 1) + ":");
                                System.out.print("Ingresa el Nombre : ");
                                nombre2 = entrada.next();
                                System.out.print("Ingrese su Edad : ");
                                edad2 = entrada.nextInt();
                                System.out.print("Imgresa  el Sexo :  ");
                                sexo2 = entrada.next();
                                System.out.print("Ingrese Fecha de Nacimiento : ");
                                fechaNacimiento2 = entrada.next();
                                System.out.print("Ingresa  el Titulo:  ");
                                titulo = entrada.next();
                                System.out.println("Ingresa el Sueldo : ");;
                                sueldo1=entrada.nextDouble();
    
                                profesores[cont3] = new   Profesor(nombre2, edad2, sexo2, fechaNacimiento2, titulo,sueldo1);
                                cont3++;
                              
                                break;
                            case 2:
                                for (int i = 0; i < cont3; i++) {
                                    System.out.println("\nMostrando datos de la  Profesor N°" + (i + 1) + ":");
                                    System.out.println(profesores[i].informacionProfesor());
                                }
                                System.out.println("\n");
                                break;
                            case 3:
                                break;

                            default:
                                System.out.println("Se equivoco de opcion de menu");
                                break;
                        }

                    } while (opcion3 != 3);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Se equivoco de opcion de menu");
                    break;

            }

        } while (opcion != 4);

    }
}
