package compagniatelefonica;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Messaggio {

    private final String numeroinvio;
    private final String numeroricezione;
    private String testo = "";
    private String data = "";
    private String ora = "";
    public Messaggio(String numeroinvio, String numeroricezione) {
        this.numeroinvio = numeroinvio;
        this.numeroricezione = numeroricezione;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getNumeroinvio() {
        return numeroinvio;
    }

    public String getNumeroricezione() {
        return numeroricezione;
    }
    
    
}
