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
class Percorso implements Comparable {
    Double dist;
    String from;
    String to;
    Percorso(String partenza, String citta, Double distanza) {
        this.from = partenza;
        this.to = citta;
        this.dist = distanza;
    }

    @Override
    public int compareTo(Object other) {
        if (this.dist > ((Percorso)other).dist) return 1;
        return 0;
    }
    
}
