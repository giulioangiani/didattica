package negozio;

import interfaccewebmarket.Acquistabile;
import interfaccewebmarket.Vendibile;

/**
 *
 * @author Giulio Angiani 
 */
public class Monitor extends Item implements Vendibile, Acquistabile {

    public Monitor(String code, String desc, double price) {
        super(code, desc, price);
    }
    
    private String resolution;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public double getPrezzo() {
        return this.price*1.20; // ricarico del 20%
    }

    @Override
    public String getDescrizione() {
        return this.description;
    }

    @Override
    public double getPrezzoAcquisto() {
        return this.price;
    }

    @Override
    public int getQuantitaMinima() {
        return 10;
    }
    
}
