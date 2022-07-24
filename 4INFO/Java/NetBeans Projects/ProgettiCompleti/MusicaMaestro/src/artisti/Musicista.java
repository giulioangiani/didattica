package artisti;

import interfaces.Suonabile;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Musicista {

    private String nome;
    private String cognome;
    
    
    public Musicista(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void suona(Suonabile s) {
        s.emettisuono();
    }
        

}
