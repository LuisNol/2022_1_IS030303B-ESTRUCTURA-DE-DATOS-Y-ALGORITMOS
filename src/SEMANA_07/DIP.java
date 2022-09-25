package SEMANA_07;

/**
 *
 * @author Nolberto Luis Sumaran Pimentel
 * @phone 930518038
 * @institutional_mail nolberto.sumaran@unas.edu.pe
 * @personal_mail nolberto.sumaran@gmail.com
 */
interface BankCard {

    public void doTransaction(int cantidad);
}

class CreditCard implements BankCard {

    @Override
    public void doTransaction(int cantidad) {
        System.out.println("tx hecho con tarjeta de crédito");
    }

}

class DebitCard implements BankCard {

    @Override
    public void doTransaction(int cantidad) {
        System.out.println("tx done with DebitCard");
    }

}

class CentroComercial {

    private BankCard bankCard;

    public CentroComercial(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount) {
        bankCard.doTransaction(amount);
    }

}

public class DIP {

    public static void main(String[] args) {
       BankCard bankCard=new CreditCard();
        CentroComercial shoppingMall1=new CentroComercial(bankCard);
        shoppingMall1.doPayment("do some order", 10000);
        
        
           BankCard bankCard1 = new DebitCard();
           CentroComercial shippingMall2 = new CentroComercial(bankCard1);
           shippingMall2.doPayment("Do some order ",22000);
    }
    
    

}
