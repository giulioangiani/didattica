package amministrazione;

import biblioteca.Libro;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Gestore extends Utente {

    public Gestore(String n, String c) {
        super(n, c);
    }
    
    public void annullaPrestiti() {
        this.prestiti.clear();
    }

}
