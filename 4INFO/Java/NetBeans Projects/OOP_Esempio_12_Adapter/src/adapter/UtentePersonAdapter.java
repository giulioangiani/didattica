package adapter;

import people.Person;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class UtentePersonAdapter extends Utente {
    
    private Person myperson = null;

    public UtentePersonAdapter(Person p) {        
        super(p.getName(), p.getFamilyname(), p.getPerson_pwd());
        this.myperson = p;
    }

    @Override
    public String getPassword() {
        return this.myperson.getPerson_pwd(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
