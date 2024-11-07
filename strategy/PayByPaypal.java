package strategy;

public class PayByPaypal implements Strategy {

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by paypal");
    }
    
}
