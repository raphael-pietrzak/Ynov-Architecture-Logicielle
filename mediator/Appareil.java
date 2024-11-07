package mediator;

public abstract class Appareil {

    private TourDeControle tour;
    private String modele;
    private int altitude;

    public Appareil(String modele) {
        tour = null;
        this.modele = modele;
        altitude = 0;
    }

    public void setTour(TourDeControle tour) {
        this.tour = tour;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void receiveNotif(Appareil appareil) {
        System.out.println("Appareil " + modele + " a recu une notification de " + appareil.getModele());
    }

    public String getModele() {
        return modele;
    }


    
}
