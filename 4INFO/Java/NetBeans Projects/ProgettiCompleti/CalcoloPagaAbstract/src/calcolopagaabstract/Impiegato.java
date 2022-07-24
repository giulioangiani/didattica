/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolopagaabstract;

import java.util.GregorianCalendar;

/**
 *
 * @author giulio
 */
public class Impiegato extends Dipendente {

    public Impiegato(String n, String c, String m, GregorianCalendar d) {
        super(n, c, m, d);
    }

    @Override
    public float calcolaStipendio() {
        return this.getStipendiobase() + (super.giorniPermanenza()/365)*100;
    }
   
    @Override
    public String toString() {
        return "[IMPIEGATO]" + super.getCognome() + " " + super.getNome();
    }
    
}
