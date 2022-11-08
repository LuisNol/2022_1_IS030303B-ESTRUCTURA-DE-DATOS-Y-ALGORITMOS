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
 * @author chris
 */
public class ejer05 {
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
