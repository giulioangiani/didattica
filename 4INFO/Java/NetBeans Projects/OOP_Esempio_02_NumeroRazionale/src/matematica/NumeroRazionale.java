    package matematica;

/**
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class NumeroRazionale {
    
    private int numeratore;
    private int denominatore;
    
    public NumeroRazionale(int n, int d) throws Exception {
        this.numeratore = n;
        
        if (d == 0) {
            throw new Exception("Il denominatore non può essere zero!");
        }
        else {
            this.denominatore = d;
        }

    }

    public int getNumeratore() {
        return this.numeratore;
    }

    public int getDenominatore() {
        return this.denominatore;
    }
    
    public double getValoreReale() {
        return (double)(this.numeratore)/this.denominatore;
    }
    
    public NumeroRazionale getInverso() throws Exception {
        return new NumeroRazionale(this.denominatore, this.numeratore);
    }
    
    public String toString() {
        return "[" + this.numeratore + "/" + this.denominatore + "]";
    }
    
    public void riduciAiMinimiTermini2() {
        while (true) {
            boolean finito = true;
            for (int d = 2; d < Math.sqrt(this.numeratore); d++) {
                if (this.numeratore % d == 0) {
                    System.out.println(d + " è divisore di " + this.numeratore);
                    if (this.denominatore % d == 0) {
                        System.out.println(d + " è divisore anche di " + this.denominatore);
                        // divido e ricomincio
                        this.numeratore = this.numeratore / d;
                        this.denominatore = this.denominatore / d;
                        finito = false;
                    }
                }
            }
            if (finito) break;
        }
    }

    public void riduciAiMinimiTermini() {
        int mcd = this.getMassimoDivisore(this.numeratore, this.denominatore);
        this.numeratore /= mcd;
        this.denominatore /= mcd;
    }    

    private int getMassimoDivisore(int N, int D) {
        for (int i = Math.min(N,D); i > 1; i--) {
            if ((N%i == 0) && (D%i==0)) return i;
        }
        return 1;
    }    

    public void add(NumeroRazionale other) {
        int comunedenominatore = other.getDenominatore()*this.denominatore;
        int numeratore_risultato = other.getDenominatore()*this.numeratore + this.denominatore*other.getNumeratore();
        this.numeratore = numeratore_risultato;
        this.denominatore = comunedenominatore;
        this.riduciAiMinimiTermini();
    }

    public void mult(NumeroRazionale other) {
        this.numeratore = this.numeratore*other.getNumeratore();
        this.denominatore = this.denominatore*other.getDenominatore();
        this.riduciAiMinimiTermini();
    }
    
}
