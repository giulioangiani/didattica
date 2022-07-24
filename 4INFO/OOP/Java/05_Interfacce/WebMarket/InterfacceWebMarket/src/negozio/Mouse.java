package negozio;

/**
 *
 * @author Giulio Angiani 
 */
public class Mouse extends Item {
    
    private int tasti = 2;

    public int getTasti() {
        return tasti;
    }

    public void setTasti(int tasti) {
        this.tasti = tasti;
    }

    public Mouse(String code, String desc, double price) {
        super(code, desc, price);
    }
}
