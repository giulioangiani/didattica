package ordini;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Prodotto {

    private int codice;
    private String desc;
    private double prezzo;
    
    public Prodotto(int codice, String desc, double prezzo) {
        this.codice = codice;
        this.desc = desc;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codice=" + codice + ", desc=" + desc + ", prezzo=" + prezzo + '}';
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) this.prezzo = prezzo;
    }
    
    
}
