package geometria;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Poligono {
    final int numerolati;
    public static int numeropoligoni = 0;
    
    public Poligono(int n) {
        this.numerolati = n;
    }
   
    public int getLati() {
        return this.numerolati;
    }
    
    public static void incPoligoni() {
        Poligono.numeropoligoni++;  // corretta
    }
    
}

