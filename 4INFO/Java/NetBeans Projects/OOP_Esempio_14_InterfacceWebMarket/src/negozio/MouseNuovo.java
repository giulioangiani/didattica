package negozio;

import interfaccewebmarket.Acquistabile;
import interfaccewebmarket.Vendibile;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class MouseNuovo extends Mouse implements Vendibile, Acquistabile {

    public MouseNuovo(String code, String desc, double price) {
        super(code, desc, price);
    }
    
  
    @Override
    public double getPrezzo() {
        return 20;
    }


    @Override
    public String getDescrizione() {
        return "Un nuovo mouse";
    }

    @Override
    public double getPrezzoAcquisto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getQuantitaMinima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
