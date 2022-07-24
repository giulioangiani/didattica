package CT;

/**
 *
 * @author Giulio Angiani (IFOA - Reggio Emilia)
 */
public class Telefonata extends Item {

    private int durata;
    
    public Telefonata(String numeroinvio, String numeroricezione) {
        super(numeroinvio, numeroricezione);
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    
    public String toString() {
        return "Chiamata da " + this.getNumeroinvio() + " > " + this.getNumeroricezione() + ": durata " + this.getDurata() + " secondi";
    }


}
