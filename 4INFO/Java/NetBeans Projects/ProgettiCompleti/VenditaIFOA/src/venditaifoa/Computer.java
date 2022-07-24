package venditaifoa;

/**
 *
 * @author Giulio Angiani
 */
public class Computer implements Vendibile, Acquistabile {
    
    private String descrizione;

    public Computer(String hp) {
        this.descrizione = hp;
    }

    @Override
    public double getPrezzo() {
        return 425.00;
    }

    @Override
    public String getDescrizione() {
        return this.descrizione;
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
