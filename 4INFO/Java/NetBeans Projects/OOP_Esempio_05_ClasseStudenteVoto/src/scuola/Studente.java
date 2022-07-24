package scuola;

import java.util.GregorianCalendar;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Studente {
    
    
    private String nome;
    private String cognome;
    private GregorianCalendar datanascita = null;
    private int matricola;
    private Classe c = null;
    
    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }
    
    public String toString() {
        return String.format("[STUDENTE %s %s - %s - %s]", this.nome, this.cognome, this.matricola, this.c  );
        
    }
    
}
