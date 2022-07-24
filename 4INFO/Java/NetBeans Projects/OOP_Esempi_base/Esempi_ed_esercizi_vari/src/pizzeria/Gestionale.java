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
class Gestionale {
    
    private ArrayList<Ordine> listaordini = null;
    
    public Gestionale() {
        listaordini = new ArrayList<Ordine>();
    }

    void aggiungi(Ordine ordine) {       
        this.listaordini.add(ordine);
    }
    
    public ArrayList<Ordine> getListaOrdini() {
        return this.listaordini;
    }

    public Ordine getOrdinePerNome(String ricerca) throws ClienteNonTrovatoException {       
        for (Ordine tmp : listaordini) {
            if (tmp.getCliente().getNomecliente().equals(ricerca)) {
                // questo ordine è di ricerca
                return tmp;
            }
        }      
        throw new ClienteNonTrovatoException();
    }
    
}
