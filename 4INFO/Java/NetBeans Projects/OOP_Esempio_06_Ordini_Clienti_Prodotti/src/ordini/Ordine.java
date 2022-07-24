package ordini;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
class Ordine {
    
    private int codice;
    private GregorianCalendar data;
    private String stato = "NEW";

    private final String currency = "EUR"; // Costante di classe

    
    private ArrayList<Prodotto> prodottiOrdinati = new ArrayList<>();

    
    public Ordine(int codice, GregorianCalendar dataordine) {
        this.codice = codice;
        this.data = dataordine;
    }
    
    public Ordine(int codice, GregorianCalendar dataordine, String stato) {
        this.codice = codice;
        this.data = dataordine;
        this.stato = stato;
    }


    public void addProdotto(Prodotto p1) {
        this.prodottiOrdinati.add(p1);
    }

    
    private String gregorianCalendarToString(GregorianCalendar g) {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        fmt.setCalendar(g);
        String dateFormatted = fmt.format(g.getTime());
        return dateFormatted;
    }
    
    @Override
    public String toString() {
        return "Ordine{" + "codice=" + codice + ", data=" + gregorianCalendarToString(data) + ", stato=" + stato + ", ordinati " + prodottiOrdinati.size() + " prodotti }";
    }

    public ArrayList<Prodotto> getProdottiOrdinati() {
        return prodottiOrdinati;
    }

    public double getTotaleOrdine() {
        double somma = 0;
        for (Prodotto p : prodottiOrdinati) {
            somma += p.getPrezzo();
        }
        return somma;
    }

    public void setSpedito() {
        this.stato = "SPEDITO";
    }

    public boolean isSpedito() {
        return (this.stato.equals("SPEDITO"));
    }
    
    public int getCodice() {
        return codice;
    }

    public String getStato() {
        return stato;
    }

    
    
    
}
