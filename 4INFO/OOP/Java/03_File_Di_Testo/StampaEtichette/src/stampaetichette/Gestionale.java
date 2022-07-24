/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stampaetichette;

import java.util.ArrayList;

/**
 *
 * @author giulio
 */
class Gestionale {
    ArrayList<Cliente> listaclienti = new ArrayList<>();

    public Gestionale() {
        
    }
    
    public void inserisciCliente(Cliente c) {
         this.listaclienti.add(c);
    }

    public ArrayList<Cliente> getListaClienti() {
         return this.listaclienti;
    }
    
    public int getNumeroClienti() {
        return this.listaclienti.size();
    }
    
}
