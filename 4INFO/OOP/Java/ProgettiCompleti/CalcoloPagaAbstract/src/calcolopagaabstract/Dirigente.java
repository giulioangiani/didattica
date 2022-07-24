
package calcolopagaabstract;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Dirigente extends Employee {

    Dirigente(String n, String c, String m, GregorianCalendar d) {
        super(n,c,m,d);
    }

    @Override
    public float calcolaStipendio() {
       return 10000;
    }

    @Override
    public String toString() {
        
        int anno = this.getDataassunzione().get(Calendar.YEAR);
        int mese = this.getDataassunzione().get(Calendar.MONTH);
        int giorno = this.getDataassunzione().get(Calendar.DAY_OF_MONTH);
        
        return "[DIRIGENTE]" + super.getCognome() + " " + super.getNome() + " Data:" + giorno+"/"+mese+"/"+anno;
    }
        
}
