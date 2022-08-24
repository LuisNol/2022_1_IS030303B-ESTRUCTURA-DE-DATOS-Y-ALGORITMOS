package POO_Programacion.Ejercicio_07;

/**
 *
 * @author LUIS
 */
public class Cliente {
       private String nombre;
       private String apelliddo;
       private  String dni;
       
       Cuenta cuentas[];

    public Cliente(String nombre, String apelliddo, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apelliddo = apelliddo;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelliddo() {
        return apelliddo;
    }

    public String getDni() {
        return dni;
    }
       
       public double  consultar_saldo (int n ){
            return  cuentas[n].getSaldo();
       }
       
      public void ingresar_dinero(int n ,double cantidad ){
            cuentas[n].ingresarDinero(cantidad);
          
      }
      
      public void retirar_dinero(int n ,double cantidad ){
            cuentas[n].retirarDinero(cantidad);
          
      }
}
