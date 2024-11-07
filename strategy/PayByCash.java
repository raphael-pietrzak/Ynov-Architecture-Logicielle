package strategy;

public class PayByCash implements Strategy {


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by cash");
    }
    
}
