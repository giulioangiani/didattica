package negozio;

import interfaccewebmarket.Acquistabile;
import interfaccewebmarket.Vendibile;

/**
 *
 * @author Giulio Angiani
 */
public class Penna implements Vendibile, Acquistabile {

    @Override
    public double getPrezzo() {
        return 1.50;
    }

    @Override
    public String getDescrizione() {
        return "Penna a sfera blu";
    }
    
    public String getMarca() {
        return "BIC";
    }

    @Override
    public double getPrezzoAcquisto() {
        return 0.9;
    }

    @Override
    public int getQuantitaMinima() {
        return 5;
    }
    
}
