package CT;

/**
 *
 * @author Giulio Angiani (IFOA - Reggio Emilia)
 */
public class Messaggio extends Item {

    private String testo;
    
    public Messaggio(String numeroinvio, String numeroricezione) {
        super(numeroinvio, numeroricezione);
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String toString() {
        return "Messaggio da " + this.getNumeroinvio() + " > " + this.getNumeroricezione() + ": testo " + this.getTesto() + " secondi";
    }
    
}
