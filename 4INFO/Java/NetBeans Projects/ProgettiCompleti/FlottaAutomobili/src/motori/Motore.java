package motori;

import errori.Potenza_not_valid_Exception;
import errori.RPM_not_valid_Exception;
import errori.Cilindrata_not_valid_Exception;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public abstract class Motore {
    private int cilindrata;
    private int rpm;
    private int potenza;
    protected String tipocarburante;

    public abstract void setTipocarburante(String tipocarburante);
    
    public Motore(int cilindrata, int rpm, int potenza) throws Exception {
        if (cilindrata <= 0) throw new Cilindrata_not_valid_Exception();
        if (rpm <= 0) throw new RPM_not_valid_Exception();
        if (potenza <= 0) throw new Potenza_not_valid_Exception();
        this.cilindrata = cilindrata;
        this.rpm = rpm;
        this.potenza = potenza;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getRpm() {
        return rpm;
    }

    public int getPotenza() {
        return potenza;
    }

    @Override
    public String toString() {
        return "[Motore a " + tipocarburante + " - " + cilindrata + "cc " + rpm + "rpm " + potenza + "Kw]";
    }

}
