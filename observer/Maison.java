package observer;

public class Maison implements BoiteALettre {
    
    private String adresse;
    
    public Maison(String adresse) {
        this.adresse = adresse;
    }
    
    public void update(String message) {
        System.out.println("Maison " + adresse + " received message: " + message);
    }
    
}
