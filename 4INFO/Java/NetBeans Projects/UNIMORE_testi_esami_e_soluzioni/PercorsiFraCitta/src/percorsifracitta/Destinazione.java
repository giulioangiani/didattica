/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percorsifracitta;

/**
 *
 * @author giulio
 */
class Destinazione {

    private final String citta;
    private final Double distanza;
    public Destinazione(String citta, Double distanza) {
        this.citta = citta;
        this.distanza = distanza;
    }

    public String getCitta() {
        return citta;
    }

    public Double getDistanza() {
        return distanza;
    }
    
    
    
}
