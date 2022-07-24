/*
Un Venditore gestisce oggetti "vendibili" senza preoccuparsi di cosa essi realmente siano
ogni venditore tiene traccia di cosa ha venduto.
 */
package interfaccewebmarket;

import java.util.ArrayList;

/**
 *
 * @author giulio
 */
public class Venditore {
    String nome;
    ArrayList<Vendibile> venduto;
    double totalevenduto = 0;
    
    public Venditore(String nome) {
        this.nome = nome;
        this.venduto = new ArrayList();
    }

    public void vendi(Vendibile v) {
        this.venduto.add(v);
        System.out.println("Ho venduto " + v.getDescrizione());
        this.totalevenduto = this.totalevenduto + v.getPrezzo();
    }
    
}
