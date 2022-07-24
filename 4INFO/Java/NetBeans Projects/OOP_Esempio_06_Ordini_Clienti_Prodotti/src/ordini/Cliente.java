package ordini;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Cliente {

    private String nome;
    private String cognome;
    private final String email;
    
    private ArrayList<Ordine> ordini = new ArrayList<>();
    
    public Cliente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cognome=" + cognome + ", email=" + email + '}';
    }

    void addOrdine(Ordine o1) {
        this.ordini.add(o1);
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
    
    public int getNumeroOrdini() {
        return this.ordini.size();
    }
    
    public ArrayList<Ordine> getOrdiniEffettuati() {
        return this.ordini;
    }

    public ArrayList<Ordine> getOrdiniSpediti() {
        ArrayList<Ordine> spediti = new ArrayList<>();
        for (Ordine o : this.ordini) {
//            if (o.getStato().equals("SPEDITO")) spediti.add(o);
            if (o.isSpedito()) spediti.add(o);
        } 
        return spediti;
        
    }
    
}
