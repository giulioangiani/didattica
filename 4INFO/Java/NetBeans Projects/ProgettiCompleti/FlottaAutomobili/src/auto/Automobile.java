package auto;

import java.util.ArrayList;
import motori.Motore;
import errori.*;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Automobile {
    private Motore motore = null;
    private String marca;
    private String modello;
    protected String tipoAuto = "basic";
    private ArrayList<Optional> optional = new ArrayList<>();

    public Automobile(String marca, String modello, Motore m) {
        this.marca = marca;
        this.modello = modello;
        this.motore = m;
    }

    public Motore getMotore() {
        return motore;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public ArrayList<Optional> getOptional() {
        return optional;
    }

    public void addOptional(Optional o) throws TooManyOptionalError {
        if (this.optional.size() == 5) throw new TooManyOptionalError();
        this.optional.add(o);
    }

    @Override
    public String toString() {
        return "Automobile{" + "motore=" + motore + ", marca=" + marca + ", modello=" + modello + ", tipoAuto=" + tipoAuto + '}';
    }
    
    
}
