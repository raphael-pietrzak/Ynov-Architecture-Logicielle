package ChainOfResponsability;

public class main {
    
    public static void main(String[] args) {
        CentreAppelLevel1 centreAppelLevel1 = new CentreAppelLevel1();
        CentreAppelLevel2 centreAppelLevel2 = new CentreAppelLevel2();
        CentreAppelLevel3 centreAppelLevel3 = new CentreAppelLevel3();
        CentreAppelLevel4 centreAppelLevel4 = new CentreAppelLevel4();
        
        centreAppelLevel1.setNext(centreAppelLevel2);
        centreAppelLevel2.setNext(centreAppelLevel3);
        centreAppelLevel3.setNext(centreAppelLevel4);

        Appel appel = new Appel(1, "Appel de niveau 1");
        centreAppelLevel1.traiterAppel(appel);

        appel = new Appel(2, "Appel de niveau 2");
        centreAppelLevel1.traiterAppel(appel);

        appel = new Appel(5, "Appel de niveau 5");
        centreAppelLevel1.traiterAppel(appel);
    }
}
