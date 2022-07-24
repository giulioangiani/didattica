package scuola;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Classe quartac = new Classe('C', 4, "INFO");
        System.out.println(quartac);
        Studente s1 = new Studente("Maria", "Baldini", 19821);
        Studente s2 = new Studente("Luca", "Prodomo", 28434);
        quartac.addStudente(s1);
        quartac.addStudente(s2);
        System.out.println(quartac.getStudenti());
    }
    
}
