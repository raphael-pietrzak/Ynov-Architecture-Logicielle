package observer;

public class main {

    public static void main(String[] args) {

        LaPoste poste = new LaPoste();
        
        Maison maison1 = new Maison("1 rue de la paix");
        Maison maison2 = new Maison("2 rue de la paix");
        Maison maison3 = new Maison("3 rue de la paix");
        
        
        poste.subscribe(maison1);
        poste.subscribe(maison2);
        poste.subscribe(maison3);
        
        poste.publish("Hello world!");
        
        poste.unsubscribe(maison2);
        
        poste.publish("Hello world again!");
        
    }
    
}
