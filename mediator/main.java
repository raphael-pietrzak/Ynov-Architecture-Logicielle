package mediator;

public class main {

    public static void main(String[] args) {
        RoissyCDG tourDeControle = new RoissyCDG();
        NYLaGuardia nyLaGuardia = new NYLaGuardia();
        Airbus airbus = new Airbus("A380");
        Boeing boeing = new Boeing("747");
        Helico helico = new Helico("EC135");
        
        tourDeControle.addAppareil(airbus);
        tourDeControle.addAppareil(boeing);
        tourDeControle.addAppareil(helico);
        
        nyLaGuardia.addAppareil(airbus);
        nyLaGuardia.addAppareil(boeing);
        nyLaGuardia.addAppareil(helico);
        
        airbus.receiveNotif(boeing);
    }
    
}
