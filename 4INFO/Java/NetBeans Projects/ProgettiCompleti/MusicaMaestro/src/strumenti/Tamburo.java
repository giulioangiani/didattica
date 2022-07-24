package strumenti;

import interfaces.Suonabile;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Tamburo implements Suonabile {

    @Override
    public void emettisuono() {
        System.out.println("Sono un tamburo e faccio BUM BUM");
    }
    
}
