package zoo;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Gatto extends Animale {

    
    public void miagola() {
        System.out.println(" MIAUUUUUU !! ");
    }    

    @Override
    public void parla() {
        System.out.println(" MIAO!");
    }
}