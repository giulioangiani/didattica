package interfaccewebmarket;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Quaderno implements Vendibile, Acquistabile {

    @Override
    public double getPrezzo() {
        return 2.50;
    }

    @Override
    public String getDescrizione() {
        return "Quaderno a righe formato A4";
    }

    public int getNumeroPagine() {
        return 20;
    }

    @Override
    public double getPrezzoAcquisto() {
        return 1.5;
    }

    @Override
    public int getQuantitaMinima() {
        return 20;
    }
    
}
