package ems;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Sim5G extends SIM {

    private final String operatore5G;
    
    public Sim5G(String numeroTelefono, double creditoResiduo, String operatore5G) {
        super(numeroTelefono, creditoResiduo);
        this.operatore5G = operatore5G;
    }

    public String getOperatore5G() {
        return operatore5G;
    }
    
    @Override
    public double ricaricaCredito(double ricarica) {
        this.creditoResiduo += ricarica*2;
        return this.creditoResiduo;
    }
    
}
