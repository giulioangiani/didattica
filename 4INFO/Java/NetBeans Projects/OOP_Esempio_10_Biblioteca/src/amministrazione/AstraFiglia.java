package amministrazione;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public abstract class AstraFiglia extends Astra {

    @Override
    public void metodoAstratto() {
        System.out.println("Ciao");
    }

    public abstract void astratto2();
}
