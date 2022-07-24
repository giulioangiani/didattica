package calcolopagaabstract;

import calcolopagaabstract.Dipendente;

import calcolopagaabstract.Dipendente;
import java.util.GregorianCalendar;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Tecnico extends Dipendente {

    
    public Tecnico(String n, String c, String m, GregorianCalendar d) {
        super(n, c, m, d);
    }

    @Override
    public float calcolaStipendio() {
        return this.getStipendiobase() + (super.giorniPermanenza()/365)*500;
    }
   
    @Override
    public String toString() {
        return "[TECNICO]" + super.getCognome() + " " + super.getNome();
    }
    
}
