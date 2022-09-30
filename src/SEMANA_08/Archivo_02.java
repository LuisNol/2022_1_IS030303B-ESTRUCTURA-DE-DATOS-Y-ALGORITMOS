/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package SEMANA_08;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel 
*@phone 930518038
*  @institutional_mail   nolberto.sumaran@unas.edu.pe
*  @personal_mail  nolberto.sumaran@gmail.com
 */

interface CuentaBancaria {

    public void doTransaction(int cantidad);
}

class CreditCard implements CuentaBancaria {

    @Override
    public void doTransaction(int cantidad) {
        System.out.println("Pagor por  tarjeta de credito");
    }

}

class DebitCard implements CuentaBancaria {

    @Override
    public void doTransaction(int cantidad) {
        System.out.println("Pago por Tarjeta de debito");
    }

}

class CuentaIntervancaria implements  CuentaBancaria{

    @Override
    public void doTransaction(int cantidad) {
        System.out.println("Pagor  por cuenta Interbancaria");
    }

}

class CentroComercial {

    private CuentaBancaria bankCard;

    public CentroComercial(CuentaBancaria bankCard) {
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount) {
        bankCard.doTransaction(amount);
    }

}

public class Archivo_02 {
    public static void main(String[] args) {
        
          CuentaBancaria  bankCard=new CreditCard(); ///credito
        CentroComercial shoppingMall1=new CentroComercial(bankCard);
        shoppingMall1.doPayment("Informe1", 10000);
        
        
           CuentaBancaria bankCard1 = new DebitCard();///devito
           CentroComercial shippingMall2 = new CentroComercial(bankCard1);
           shippingMall2.doPayment("Informe2 ",22000);
    }
}
