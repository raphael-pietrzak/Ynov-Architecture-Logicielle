package patternmvc;

public class PersonneVue {
    public void afficher(PersonneDTO dto) {
        System.out.println("Nom : " + dto.getNom());
        System.out.println("Prenom : " + dto.getPrenom());
    }

    
    
}
