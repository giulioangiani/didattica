/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agritutto;

/**
 *
 * @author giulio
 */
class Articolo {

    private final String codice;
    private final String descrizione;
    private final String categoria;
    private Double prezzo;
    private int quantita;
    
    Articolo(String codice, String descrizione, Double prezzo, String categoria, int quantita) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.categoria = categoria;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }
    
    public void vendi() throws Exception {
        this.vendi(1);
    }
    
    public void vendi(int n) throws Exception {
        if (this.quantita < n) throw new Exception("Quantita non sufficiente");
        this.quantita = this.quantita - n;
    } 
    
    @Override
    public String toString() {
        return this.codice + " : " + this.descrizione + " [" + this.categoria + "] € " + this.prezzo + " : QTA: " + this.quantita;
    }
    
}
