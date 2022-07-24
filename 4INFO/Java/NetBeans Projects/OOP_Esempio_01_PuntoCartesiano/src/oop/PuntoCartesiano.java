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

    public double distanzaDaOrigine() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
    
    
    
}
