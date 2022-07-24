/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;

/**
 *
 * @author giulio
 */
public class GestoreOrdini {
    
    private ArrayList<Ordine> ordini;
    
    public GestoreOrdini () {
        this.ordini = new ArrayList<Ordine>();
    }
    
    public void aggiungi(Ordine o) {
        this.ordini.add(o);
    }
    
    public ArrayList<Ordine> getOrdini()  {
        return this.ordini;
    }
    
    
    public ArrayList<Ordine> cerca(String cliente) throws OrdiniNonPresentiException {
        return new ArrayList<Ordine> ();
    }
    
}
