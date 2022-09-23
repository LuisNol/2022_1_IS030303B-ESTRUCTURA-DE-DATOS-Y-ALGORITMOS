

package SEMANA_06;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

interface Nomina{
     public static final String EMPRESA = "Patito, S. A.";
 public void detalleDeEmpleado( int  obj);
 
}

class Empleado  implements Nomina{
      private String  n;
      
      int a;

    @Override
    public void detalleDeEmpleado(int obj) {
         a  =obj;
    }
    
    public void printStates() {
        System.out.println("speed: " + a);
    }
  
}


public class Enunciado_02 {
    public static void main(String[] args) {
      
         Empleado  p =new  Empleado();
         p.detalleDeEmpleado(3);
         p.printStates();
         
    
    
    }
}
