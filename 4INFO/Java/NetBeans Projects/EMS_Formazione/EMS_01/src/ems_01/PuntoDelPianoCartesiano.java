package ems_01;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class PuntoDelPianoCartesiano {
    private double x;
    private double y;
    
    public PuntoDelPianoCartesiano(double ascissa, double ordinata) {
        // costruttore di classe
        this.x = ascissa;
        this.y = ordinata;
    }
    
    public double calcolaDistanzaDallOrigine() {
        return Math.sqrt(x*x + y*y);
    }
    
    public int quadrante() {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;
        return 0;
    }

    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }
    
    public void setX(double nuova_x) {
        if (nuova_x < 0 ) return; // non modifico
        this.x = nuova_x;
    }

    @Override
    public String toString() {
//        return "PuntoDelPianoCartesiano{" + "x=" + x + ", y=" + y + '}';
        return "(" + x + "," + y + ")";
    }

    public boolean equals(PuntoDelPianoCartesiano altro) {
        if ((this.x == altro.x) && (this.y == altro.y)) return true;
        return false;
    }
    
    
    

}
