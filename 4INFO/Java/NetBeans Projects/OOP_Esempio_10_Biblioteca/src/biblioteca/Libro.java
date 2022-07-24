package biblioteca;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Libro  {
    private String autore;
    private String titolo;
    
    public Libro(String a, String t) {
        this.autore = a;
        this.titolo = t;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    
}
