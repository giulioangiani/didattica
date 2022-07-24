package errori;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class FlottaAutomobiliGenericException extends Exception {
    // questa classe permette di distinguere fra 
    // le eccezioni relative al progetto e quelle standard di Java 
    public FlottaAutomobiliGenericException() {
        super("Errore generico flotta automobili");
    }
    
}
