package artisti;

import artisti.Musicista;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Violinista extends Musicista {

    public Violinista(String nome, String cognome) {
        super(nome, cognome);
    }
    
    public void canto() {
        System.out.println("Canto...");
    }
    
}
