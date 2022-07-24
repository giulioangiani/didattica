package CT;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IFOA - Reggio Emilia)
 */
public class Cliente {
    
    private String nome;
    private String cognome;
    private String cf;
    private String email;
    private String indirizzo = "";

    private ArrayList<SIM> listasim = new ArrayList<>();


    public Cliente(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.email = "";
        
    }

    public Cliente(String nome, String cognome, String cf, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCf() {
        return cf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    } 
    
    
    public void aggiungiSim(SIM e) {
        this.listasim.add(e);
        
        e.setProprietario(this);
        
    }

    public ArrayList<SIM> getListasim() {
        return listasim;
    }
    
    public String toString() {
        return this.cognome + " " + this.nome + " [" + this.cf + "]";
    }
    
    
}
