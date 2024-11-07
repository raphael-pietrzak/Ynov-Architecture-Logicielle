package observer;

import java.util.HashSet;

public class LaPoste {

    private HashSet<BoiteALettre> abonnes = new HashSet<>();

    public boolean unsubscribe(BoiteALettre abonne) {
        return abonnes.remove(abonne);
    }

    public void subscribe(BoiteALettre abonne) {
        abonnes.add(abonne);
    }

    public void publish(String message) {
        for (BoiteALettre abonne : abonnes) {
            abonne.update(message);
        }
    }
    
}
