package zoo;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Cane extends Animale {
    
    @Override 
    public void parla() {
        System.out.println(" BAU !");
    }    
    
    public void abbaia() {
        System.out.println(" WOF WOF !! ");
    }
   
}
