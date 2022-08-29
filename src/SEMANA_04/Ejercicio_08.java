package SEMANA_04;

import POO_Programacion.Ejersicio_03.Vehiculo;
import java.util.Scanner;

class Cuenta {

    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }

    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }

   
    public String mostrarDatosCuentas() {
        return "NumeroCuenta: " + numeroCuenta + "\n Saldo : " + saldo ;
    }

    
   

}

class Cliente {

    private String nombre;
    private String apelliddo;
    private String dni;

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

    public double consultar_saldo(int n) {
        return cuentas[n].getSaldo();
    }

    public void ingresar_dinero(int n, double cantidad) {
        cuentas[n].ingresarDinero(cantidad);

    }

    public void retirar_dinero(int n, double cantidad) {
        cuentas[n].retirarDinero(cantidad);

    }

 
    public String mosatarDatos() {
        return "Cliente{" + "Nombre : " + nombre + ",\n Apelliddo: " + apelliddo + ",\n Dni: " + dni + ", Cuentas:" + cuentas + '}';
    }
    
}

public class Ejercicio_08 {

    private static int menorSaldoCuentas(Cuenta cuentas[]) {
        float precio;
        int indice = 0;

        precio = (float) cuentas[0].getSaldo();

        for (int i = 1; i < cuentas.length; i++) {
            if (cuentas[i].getSaldo() < precio) {
                precio = (float) cuentas[i].getSaldo();
                indice = i;
            }

        }
        return indice;

    }

    public static int buscarNumeroCuenta(int n, Cuenta cuentas[]) {
        //Búsqueda secuencial
        int i = 0, indice = 0;
        boolean encontrado = false;

        while ((i < cuentas.length) && (encontrado == false)) {
            if (cuentas[i].getNumeroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, dni;
        
        int numeroCuentas, opcion, numeroCuenta, indiceCuenta, indicuentaMenorSaldo;
        Cliente cliente;
        Cuenta cuentas[];
        double saldo, cantidad;

        System.out.print("Digite el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el apellido del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("Digite el dni del cliente: ");
        dni = entrada.nextLine();
        System.out.print("Digite el numero de cuentas del cliente: ");
        numeroCuentas = entrada.nextInt();

        cuentas = new Cuenta[numeroCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("\nDigite los datos de la cuenta " + (i + 1) + ":");
            System.out.print("Digite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Digite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {
            System.out.println("\t.:MENU:.");
            System.out.println("1. Ingresar dinero en cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar dinero de la cuenta");
            System.out.println("4. Consultar la cuenta con menor dinero ");
            System.out.println("5. Consultar la cuenta con menor dinero ");
            System.out.println("6. Salir");
            System.out.print("Digite la opcion de menu: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(numeroCuenta, cuentas);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl numero de cuenta no existe");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a ingresar: ");
                        cantidad = entrada.nextDouble();

                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println("\nDinero Ingresado correctamente");
                        System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                case 2:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(numeroCuenta, cuentas);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl numero de cuenta no existe");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero retirar: ");
                        cantidad = entrada.nextDouble();

                        if (cantidad > cliente.consultar_saldo(indiceCuenta)) {
                            System.out.println("\nSaldo Insuficiente");
                        } else {
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println("\nDinero retirado correctamente");
                            System.out.println("Saldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                        }
                    }
                    break;
                case 3:
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(numeroCuenta, cuentas);

                    if (indiceCuenta == -1) {
                        System.out.println("\nEl numero de cuenta no existe");
                    } else {
                        System.out.println("\nSaldo disponible: " + cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                case 4:
                    indicuentaMenorSaldo =menorSaldoCuentas(cuentas);
                    System.out.println("\nLa cuenta con menor saldo  es : ");
                    System.out.println(cuentas[indicuentaMenorSaldo ].mostrarDatosCuentas());
                case 5:
                    break;
                default:
                    System.out.println("Se equivoco de opcion de menu");
            }
            System.out.println("");
        } while (opcion != 4);
    }
}
