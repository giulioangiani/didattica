/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motori;

import java.util.ArrayList;

/**
 *
 * @author giulio
 */
class Catalogo {

    public Iterable<Moto> getMoto() {
        return new ArrayList<Moto>();//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Moto cerca(String modello, int cilindrata) throws VeicoloInesistenteException {
        throw new VeicoloInesistenteException();
    }

    void aggiungi(Moto nuovamoto) throws CatalogoPienoException {
        throw new CatalogoPienoException(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
