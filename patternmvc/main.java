package patternmvc;

public class main {
    
        public static void main(String[] args) {
            PersonneDAO dao = new PersonneDAOImpl();
            PersonneDTO dto = new PersonneDTO( "Doe", "John", 1);
            dto.setNom("DUPONT");
            dto.setPrenom("Jean");
            PersonneVue vue = new PersonneVue();
            vue.afficher(dto);
        }
    
}
