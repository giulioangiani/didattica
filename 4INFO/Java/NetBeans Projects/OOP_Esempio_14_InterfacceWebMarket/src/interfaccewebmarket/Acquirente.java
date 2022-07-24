package interfaccewebmarket;

import java.util.ArrayList;
/**
 *
 * @author Giulio Angiani
 */
public class Acquirente {

    ArrayList<Acquistabile> acquistato;
    double totalevenduto = 0;
    
    public Acquirente() {
        this.acquistato = new ArrayList();
    }

    public void acquista(Acquistabile a, int numeromassimo) {
        if (a.getQuantitaMinima() <= numeromassimo) {
            this.acquistato.add(a);
            System.out.println("Ho comprato " + a.getDescrizione() +
                " al prezzo di " + a.getPrezzoAcquisto());
        }
        else {
            System.out.println("Non posso comprare " + a.getDescrizione() + 
                    " perché l'acquisto minimo supera la soglia di " + numeromassimo);
        }
    }

}
