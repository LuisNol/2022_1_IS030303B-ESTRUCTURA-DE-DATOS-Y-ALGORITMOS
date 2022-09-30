/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_07;

import java.util.Vector;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
interface ILoadRecursoPersistente {

    public void load();
}

interface ISaveRecursoPersistente {

    public void save();
}

class ConfiguracionSistema implements ILoadRecursoPersistente, ISaveRecursoPersistente {

    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
}

class ConfiguracionUsuario implements ILoadRecursoPersistente, ISaveRecursoPersistente {

    public void load() {
        System.out.println("Configuracion usuario cargado");
    }

    public void save() {
        System.out.println("Configuracion usuario almacenado");
    }
}

class ConfiguracionHoraria implements ILoadRecursoPersistente {

    public void load() {
        System.out.println("Configuracion horaria cargada");
    }
}



class Configuracion {

    Vector<ILoadRecursoPersistente> lrp = new Vector<ILoadRecursoPersistente>();
    Vector<ISaveRecursoPersistente> srp = new Vector<ISaveRecursoPersistente>();

    public void cargarConfiguracion() {
        lrp.add(new ConfiguracionHoraria());
        srp.add(new ConfiguracionUsuario());
        srp.add(new ConfiguracionSistema());

        for (ILoadRecursoPersistente irp : lrp) {
            irp.load();
        }
    }

    public void salvarConfiguracion() {
        for (ISaveRecursoPersistente isrp : srp) {
            isrp.save();
        }
    }
}

public class LSK {
     public static void main(String[] args) {
        Configuracion s =new  Configuracion();
        
        s.cargarConfiguracion();
        s.salvarConfiguracion();
    }

    
 
     
}
