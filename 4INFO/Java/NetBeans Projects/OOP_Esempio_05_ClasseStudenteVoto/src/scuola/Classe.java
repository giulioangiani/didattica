package scuola;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Classe {
    
    private char sezione;
    private int corso;
    private String indirizzo;
    private ArrayList<Studente> studenti = null;
    
    public Classe(char c, int i, String info) {
        this.corso = i;
        this.indirizzo = info;
        this.sezione = c;
        this.studenti = new ArrayList<>();
    }
    
    public void addStudente(Studente s) {
        this.studenti.add(s);
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }
    
    
    public char getSezione() {
        return sezione;
    }

    public int getCorso() {
        return corso;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    @Override
    public String toString() {
        return "Classe{" + "sezione=" + sezione + ", corso=" + corso + ", indirizzo=" + indirizzo + '}';
    }
    
}
