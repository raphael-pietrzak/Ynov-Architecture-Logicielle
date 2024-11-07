package patternmvc;

import java.util.List;

public class PersonneDAOImpl implements PersonneDAO {

    List<PersonneDTO> personnes;

    @Override
    public List<PersonneDTO> getAll() {
        return personnes.subList(0, personnes.size());
    }

    @Override
    public PersonneDTO get(int id) {
        for (PersonneDTO personne : personnes) {
            if (personne.getId() == id) {
                return personne;
            }
        }
        return null;
    }

    @Override
    public void save(PersonneDTO personne) {
        for (PersonneDTO p : personnes) {
            if (p.getId() == personne.getId()) {
                p.setNom(personne.getNom());
                p.setPrenom(personne.getPrenom());
            }
        }
    }

    @Override
    public void delete(PersonneDTO personne) {
        personnes.remove(personne);
    }

    @Override
    public void add(PersonneDTO personne) {
        personnes.add(personne);
    }
    
    
}
