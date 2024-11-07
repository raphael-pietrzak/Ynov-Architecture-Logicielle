package strategy;

public class PayByCreditCard implements Strategy {

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by credit card");
    }
    
}
