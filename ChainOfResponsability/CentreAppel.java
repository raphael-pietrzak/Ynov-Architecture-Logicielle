package ChainOfResponsability;

public abstract class CentreAppel {

    private int level;
    private CentreAppel next;

    public CentreAppel(int level) {
        this.level = level;
    }

    public void setNext(CentreAppel next) {
        this.next = next;
    }

    public void traiterAppel(Appel appel) {
        if (appel.getLevel() == level) {
            System.out.println("Appel traité par " + this.getClass().getSimpleName());
        } else if (next != null) {
            next.traiterAppel(appel);
        } else {
            System.out.println("Appel non traité");
        }
    }
    
}
