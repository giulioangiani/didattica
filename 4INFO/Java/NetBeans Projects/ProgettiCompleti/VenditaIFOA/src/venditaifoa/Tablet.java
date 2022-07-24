package venditaifoa;

/**
 *
 * @author Giulio Angiani 
 */
class Tablet {

    private String description;
    private float selling_price;
    
    Tablet(String description) {
        this.description = description;
    }

    public float getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(float selling_price) {
        if (selling_price <= 0) return;
        this.selling_price = selling_price;
    }

    public String getDescription() {
        return description;
    }

    
}
