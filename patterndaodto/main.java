package patterndaodto;

public class main {

    public static void main(String[] args) {
        PersonneDAO personneDAO = new PersonneDAOImpl();
        PersonneDTO personneDTO = new PersonneDTO(1, "Doe", "John");
        personneDAO.add(personneDTO);
        personneDTO = personneDAO.get(1);
        System.out.println(personneDTO.getNom());
    }
    
}
