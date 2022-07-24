package scuola;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Studente {

    private String nome = "";
    private String cognome = "";
    private int classe;
    private char sezione;
    
    private ArrayList<Double> voti = new ArrayList<>();
    
    public Studente(String nome, String cognome, int classe, char sezione) throws Exception {
        this.nome = nome;
        this.cognome = cognome;
        
        if (classe > 5 || classe < 1) throw new Exception("ERRORE! La classe deve essere compresa fra 1 e 5");
        this.classe = classe;
        this.sezione = sezione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getClasse() {
        return classe;
    }

    public char getSezione() {
        return sezione;
    }
    
    public String toString() {
        return String.format("[STUDENTE %s %s - %s%s]", this.nome, this.cognome, this.classe, this.sezione);
        
    }

    public ArrayList<Double> getVoti() {
        return this.voti;
    }

    public void addVoto(double i) {
        this.voti.add(i);
    }

    public int getNumeroVoti() {
        return this.voti.size();
    }

    public double getMediaVoti() {
        if (this.getNumeroVoti() == 0) {
           return 0;
        }
        else {
           double sum = 0;
           for (double i : this.voti) sum+=i;
           return sum/this.getNumeroVoti();
        }
              
    }
    

    
    
    
}
