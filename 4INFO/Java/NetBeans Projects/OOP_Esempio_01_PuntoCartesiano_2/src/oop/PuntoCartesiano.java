package oop;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class PuntoCartesiano {
    private double x;
    private double y;
    
    public PuntoCartesiano(double ics, double ipsilon) {
        // costruttore di classe ridefinito per passare 
        // valori alla classe al momento dell'istanziazione dell'oggetto
        this.x = ics;
        this.y = ipsilon;
    }
    
    public void setX(double p) {
        if (p>0) this.x = p;
    }
    
    public void setY(double p) {
        this.y = p;
    }

    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
 
    public String toString() {
        return "[" + this.x + ":" + this.y + "]";
    }
}
