/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEMANA_07;

import java.io.Console;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
class Alumno {

    private String codigo;

    public Alumno(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
}

class Curso{
    private Alumno  curso;

    public Curso(Alumno curso) {
        this.curso = curso;
    }

    public Alumno getCurso() {
        return curso;
    }

    public void setCurso(Alumno curso) {
        this.curso = curso;
    }

    
}


public class SRP {
    public static void main(String[] args) {
        
      
          
    }

}
