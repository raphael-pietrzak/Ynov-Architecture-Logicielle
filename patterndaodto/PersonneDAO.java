package patterndaodto;

import java.util.List;

public interface PersonneDAO {

    public List<PersonneDTO> getAll();
    public PersonneDTO get(int id);
    public void save(PersonneDTO personne);
    public void delete(PersonneDTO personne);
    public void add(PersonneDTO personne);
}
