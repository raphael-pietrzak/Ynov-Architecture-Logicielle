package mediator;

import java.util.ArrayList;

public abstract class TourDeControle implements Mediator {

    private ArrayList<Appareil> appareils;

    public TourDeControle() {
        appareils = new ArrayList<Appareil>();
    }

    public void addAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    public void removeAppareil(Appareil appareil) {
        appareils.remove(appareil);
    }

    public void notify(Appareil appareil) {
    }

    public String toString() {
        return "Tour de controle";
    }

}
