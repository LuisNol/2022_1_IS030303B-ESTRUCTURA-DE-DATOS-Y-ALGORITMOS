/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */
public class Ejercicio_05 {
    public static void main(String[] args) {
        List<Integer> lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean band=true;
        do{
            System.out.println("Ingresar");
            lista.add(sc.nextInt());
            System.out.println("Deseo continuar!!");
            String cad=sc.next();
            if(cad.equals("YES")){
                band=false;
            }
        }while(band);
        
    }
}