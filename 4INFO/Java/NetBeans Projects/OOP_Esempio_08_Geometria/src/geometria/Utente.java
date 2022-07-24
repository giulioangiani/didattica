package geometria;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Utente {
    
    private static int numeroutenti = 0;
    
    public Utente() {
        Utente.numeroutenti++;
    }
    
    public static int getNumeroUtenti() {
        return Utente.numeroutenti;
    }
    
    public void finalize(){
        System.out.println ("E' stato distrutto un Utente ");
    }
}
