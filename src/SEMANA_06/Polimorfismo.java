package SEMANA_06;

import java.util.Vector;

class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;

    }

    public String mostrarDatos() {
        return "Matricula : " + matricula + "\nMarca : " + marca + "\nModelo : " + modelo+"\n";
    }
}

class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getNPuertas() {
        return nPuertas;
    }

    @Override
          public String mostrarDatos() {
            return "Matricula : "+ matricula + "\nMarca : "+marca + "\nModelo : "+modelo + "\n Numeros de Puertas : "+nPuertas+"\n"; 
         }
}

class VehiculoDeportivo extends Vehiculo{
    private int celindrada;

    public VehiculoDeportivo(String matricula , String marca, String modelo, int celindrada){
        super(matricula, marca, modelo );
        this.celindrada = celindrada;


    }

    public int getCelindrada() {
        return celindrada;
    }
    @Override
    public String mostrarDatos() {
        return "Matricula : "+ matricula + "\nMarca : "+marca + "\nModelo : "+modelo + "\n Numero deCelindrada : "+celindrada + "\n";
    }
}

class VehiculoFurgoneta extends Vehiculo {
     private int carga;
    public VehiculoFurgoneta(String matricula, String marca, String modelo ,    int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula : "+ matricula + "\nMarca : "+marca + "\nModelo : "+modelo+ "\nCarga : "+carga + "\n";
    }
}

public class Polimorfismo {

public static void main(String[] args) {
    //Vector<ILoadRecursoPersistente> lrp = new Vector<ILoadRecursoPersistente>();
      
    //Vehiculo mVehiculo[] = new Vehiculo[1];
      Vector<Vehiculo> miVehiculo = new Vector<>();

       miVehiculo.add(new Vehiculo("GH4", "Ferrary", "A56")) ;
       miVehiculo.add(new VehiculoTurismo("12GB","Ferrari","A8",4));
       miVehiculo.add(new VehiculoDeportivo("12GB","Ferrari","A8",500));
       miVehiculo.add(new VehiculoFurgoneta("12GB","Ferrari","A8",2000));

       for (Vehiculo vehiculo : miVehiculo) {
           System.out.println(vehiculo.mostrarDatos());
           //System.out.println("");
       }
    

  }
}
