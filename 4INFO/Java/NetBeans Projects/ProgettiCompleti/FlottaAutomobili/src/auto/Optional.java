package auto;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Optional {
    private String codice;
    private String descrizione;
    private Double prezzo;

    public Optional(String codice, String descrizione, Double prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "[" + "codice " + codice + " - " + descrizione + " : " + prezzo + "€ ]";
    }
    
    
    
}
