package strumenti;

import interfaces.Suonabile;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Pianoforte implements Suonabile {

    @Override
    public void emettisuono() {
        System.out.println("Sono un pianoforte e faccio ta-ta-tan");
    }
    
}
