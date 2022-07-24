package strumenti;

import interfaces.Suonabile;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Violino implements Suonabile {

    @Override
    public void emettisuono() {
        System.out.println("Sono un violino e faccio gnegnegne");
    }
    
}
