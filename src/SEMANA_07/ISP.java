/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_07;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
interface Trabajar {

    void trabajar();
}

interface Comer {

    void comer();
}

interface Empleado extends Trabajar, Comer {
//     void trabjar();
//     void comer();
}

class camarero implements Empleado {

    public void trabajar() {
        System.out.println("Esta trabajando ");
    }

    @Override
    public void comer() {
        System.out.println("Esta comiendo");
    }

}

class Mozo implements Trabajar {

    @Override
    public void trabajar() {
        System.out.println("Trabajo en la  mañana ");
    }

//    @Override
//    public void comer() {
//       // System.out.println("Esta comiendo");
//    }
}

public class ISP {

    public static void main(String[] args) {
        Empleado s = new camarero() ;
       
        s.trabajar();
        s.comer();
        
        Mozo s1= new Mozo();
        s1.trabajar();
        

    }

}
