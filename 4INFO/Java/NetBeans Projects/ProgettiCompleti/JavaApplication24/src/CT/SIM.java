package CT;

import java.util.ArrayList;

public class SIM {
    private String numero;

    private double creditoResiduo = 0;
    
    private Cliente proprietario = null;
    
    private ArrayList<Item> items = new ArrayList<>();

    /**
     * Costruttore: prende in input numero di telefono della SIM
     */
    public SIM(String numero, double credito) {
        this.numero = numero;
        this.creditoResiduo = credito;
    }

    public String getNumero() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numero;
    }

    public void setNumero(String numero) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.numero = numero;
    }

    public double getCreditoResiduo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.creditoResiduo;
    }
    
    public String toString() {
        return "{SIM " + this.numero + " €" + this.creditoResiduo + "} ";
    }
    
    public void setProprietario(Cliente c) {
        this.proprietario = c;
    }

    public void addItem(Item i) {
        this.items.add(i);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Cliente getProprietario() {
        return proprietario;
    }
    
    
    // metodo per aggiungere direttamente una telefonata
    public void chiama(SIM destinatario, String day, String time, int durata) {
        Telefonata t = new Telefonata(this.getNumero(), destinatario.getNumero());
        t.setData(day);
        t.setOra(time);
        t.setDurata(durata);
        this.addItem(t);
    }
    
    // metodo per aggiungere direttamente una telefonata
    public void inviaSMS(SIM destinatario, String day, String time, String testo) {
        Messaggio m = new Messaggio(this.getNumero(), destinatario.getNumero());
        m.setData(day);
        m.setOra(time);
        m.setTesto(testo);
        this.addItem(m);
        
        // 15c. decurtati dal credito
        this.consumaCredito(0.15);
    }
    
    private void consumaCredito(double c) {
        this.creditoResiduo -= c;
    }
    
}
