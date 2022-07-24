package negozio;

import interfaccewebmarket.Acquistabile;

/**
 *
 * @author Giulio Angiani
 */
public class LIM extends Item implements Acquistabile {
    
    
  
    public LIM(String code, String desc, double price)  {
        super(code, desc, price);
    }

    @Override
    public String getDescrizione() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
