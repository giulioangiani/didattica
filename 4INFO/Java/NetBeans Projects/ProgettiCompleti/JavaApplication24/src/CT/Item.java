package CT;

/**
 *
 * @author Giulio Angiani (IFOA - Reggio Emilia)
 */
public class Item {
    private final String numeroinvio;
    private final String numeroricezione;
    private String data = "";
    private String ora = "";
    
    public Item(String numeroinvio, String numeroricezione) {
        this.numeroinvio = numeroinvio;
        this.numeroricezione = numeroricezione;
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
