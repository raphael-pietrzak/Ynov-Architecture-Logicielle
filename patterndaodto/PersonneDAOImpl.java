package patterndaodto;

import java.util.ArrayList;
import java.util.List;

public class PersonneDAOImpl implements PersonneDAO {


    private List<PersonneDTO> personnes = new ArrayList<PersonneDTO>();


    public PersonneDAOImpl() {
    }

    public void add(PersonneDTO personne) {
        personnes.add(personne);
    }

    public void delete(PersonneDTO personne) {
        personnes.remove(personne);
    }

    public List<PersonneDTO> getAll() {
        return personnes;
    }

    public PersonneDTO get(int id) {
        for (PersonneDTO personne : personnes) {
            if (personne.getId() == id) {
                return personne;
            }
        }
        return null;
    }

    public void save(PersonneDTO personne) {
        for (PersonneDTO p : personnes) {
            if (p.getId() == personne.getId()) {
                p.setNom(personne.getNom());
                p.setPrenom(personne.getPrenom());
            }
        }
    }

}
