package auto;

import motori.Motore;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Berlina extends Automobile {

    public Berlina(String marca, String modello, Motore m) {
        super(marca, modello, m);
        this.tipoAuto = "berlina";
    }
    
}
