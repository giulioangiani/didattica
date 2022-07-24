package negozio;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Item {

    protected final String code;
    protected String description;
    protected double price;
    
    public Item(String code, String desc, double price) {
        this.code = code;
        this.description = desc;
        this.price = price;
    }
    
}
