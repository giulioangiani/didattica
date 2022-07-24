package compagniatelefonica;

import java.util.Date;


public class Telefonata {
    private final String ora;

    private final int durata; // in minuti

    private final String numeroChiamato;
    private final String numeroChiamante;

    public Telefonata(String numeroChiamante, String numeroChiamato, String orachiamata, int durata) {
        this.durata = durata;
        this.ora = orachiamata;
        this.numeroChiamato = numeroChiamato;
        this.numeroChiamante = numeroChiamante;
    }

    /**
     * restituisce l'ora della telefonata
     */
    public String getOra() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ora;
    }

    public int getDurata() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.durata;
    }

    public String getNumeroChiamato() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.numeroChiamato;
    }

    public String getNumeroChiamante() {
        return numeroChiamante;
    }
    
    @Override
    public String toString() {
        return "[Telefonata " + this.numeroChiamato + " : ore " +  this.ora + "]";
    }


}
