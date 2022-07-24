package amministrazione;

import biblioteca.Libro;
import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Utente {
    
    private final String nome;
    private final String cognome;
    private String email = "";
    private int tessera = 0;
    protected ArrayList<Libro> prestiti;
    
    public Utente(String n, String c) {
        this.nome = n;
        this.cognome = c;
        this.prestiti = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTessera() {
        return tessera;
    }

    public void setTessera(int tessera) {
        this.tessera = tessera;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public void addPrestito(Libro l) {
        this.prestiti.add(l);
    }
    
}
