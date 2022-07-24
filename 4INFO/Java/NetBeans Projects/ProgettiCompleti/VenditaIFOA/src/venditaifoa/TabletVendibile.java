package venditaifoa;

/**
 *
 * @author Giulio Angiani
 */
public class TabletVendibile extends Tablet implements Vendibile, Acquistabile {
    
    private double prezzoazienda;
    
    TabletVendibile(String desc) {
        super(desc);
    }

    public double getPrezzoAzienda() {
        return prezzoazienda;
    }

    public void setPrezzoAzienda(double prezzoazienda) {
        this.prezzoazienda = prezzoazienda;
    }

    //////////////////////////////////////////////////////
    @Override
    public double getPrezzo() {
        return this.getSelling_price();
    }

    @Override
    public String getDescrizione() {
        return this.getDescription();
    }

    @Override
    public double getPrezzoAcquisto() {
        return this.getPrezzoAzienda()*1.1;
    }

    @Override
    public int getQuantitaMinima() {
        return 5;
    }
    
}
