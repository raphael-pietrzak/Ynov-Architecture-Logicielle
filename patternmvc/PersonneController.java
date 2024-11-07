package patternmvc;

public class PersonneController {
    private PersonneDAO dao;
    private PersonneVue vue;
    private PersonneDTO dto;

    public void setNom(String nom) {
        dto.setNom(nom);
    }

    public void setPrenom(String prenom) {
        dto.setPrenom(prenom);
    }

    public void enregistrer() {
        dao.save(dto);
    }

    public void afficherPage() {
        vue.afficher(dto);
    }

    public PersonneController(PersonneDAO dao, PersonneVue vue, PersonneDTO dto) {
        this.dao = dao;
        this.vue = vue;
        this.dto = dto;
    }

    
}
