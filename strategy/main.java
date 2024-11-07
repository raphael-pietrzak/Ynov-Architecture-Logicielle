package strategy;

public class main {

    public static void main(String[] args) {
        Context context = new Context(new PayByCash());
        context.pay(100);
        context.setStrategy(new PayByPaypal());
        context.pay(200);
    }
    
}
