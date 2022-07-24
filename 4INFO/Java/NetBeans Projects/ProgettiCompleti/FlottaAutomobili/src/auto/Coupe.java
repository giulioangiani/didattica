package auto;

import motori.Motore;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Coupe extends Automobile {

    public Coupe(String marca, String modello, Motore m) {
        super(marca, modello, m);
        this.tipoAuto = "coupè";
    }
    
    
}
