
package SEMANA_07;

/**
 *
 * @author LUIS
 */
class Persona {
    private String name;
    private String  lastname;

    public Persona(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

//   
//    public String mostrarInformacion() {
//        return  "Name=" + name + ", Lastname=" + lastname ;
//    }

}

class Alumno  extends Persona{
  private int code ;

    public Alumno( String name, String lastname,int code) {
        super(name, lastname);
        this.code = code;
    }

   
    public String mostrarInformacionAlumno() {
            return  "Name=" + this.getName() + ",\nLastname=" + this.getLastname()+"\nCode  : "+  code;
    }
  
    
  
  
}

class Profesor   extends Persona{
  private String  code;

    public Profesor(String code, String name, String lastname) {
        super(name, lastname);
        this.code = code;
    }
  
       public String mostrarInformacionProfesor() {
            return  "Name=" + this.getName() + ",\nLastname=" + this.getLastname()+"\nCode  : "+  code;
            
    }
  
}
 
public class Ejercicio_01 {
    
    public static void main(String[] args) {
        Alumno  p  = new  Alumno("luis","sumaran",4);
        System.out.println( p.mostrarInformacionAlumno());
    }
    
    
}
