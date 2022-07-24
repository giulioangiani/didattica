package people;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Person {
    
    private String name;
    private String familyname;
    private String person_pwd;

    public Person(String name, String familyname) {
    }

    public void setPassword(String password) {
        this.person_pwd = password;
    }

    public String getName() {
        return name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public String getPerson_pwd() {
        return person_pwd;
    }
    
    
    
}
