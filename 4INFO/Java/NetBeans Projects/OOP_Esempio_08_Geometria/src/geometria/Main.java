package geometria;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void usaUtente() {
        Utente u = new Utente();
        System.out.println("Utenti instanziati: "+Utente.getNumeroUtenti());
        u=null;
    }
    
    public static void main(String[] args) {
        Poligono p1 = new Poligono(5);
        Poligono p2 = new Poligono(3);
        System.out.println(p1.numeropoligoni);
        System.out.println(p2.numeropoligoni);
        System.out.println(Poligono.numeropoligoni);
        //p1.incPoligoni();
        Poligono.incPoligoni();
        System.out.println(p1.numeropoligoni);
        System.out.println(p2.numeropoligoni);
        p1.incPoligoni();
        System.out.println(p1.numeropoligoni);
        System.out.println(p2.numeropoligoni);
        
        
    	Utente u1 = new Utente();
	Utente u2 = new Utente();
	System.out.println("Utenti instanziati: "+Utente.getNumeroUtenti());
	Utente u3 = new Utente();    
	System.out.println("Utenti instanziati: "+Utente.getNumeroUtenti());
        u3=null;
        
        
        

        /*
        System.out.println("Poligono.numeropoligoni: " + Poligono.numeropoligoni);
        Poligono p1 = new Poligono(5);
        Poligono p2 = new Poligono(5);
        System.out.println("p1.numeropoligoni: " + p1.numeropoligoni);
        System.out.println("p2.numeropoligoni: " + p2.numeropoligoni);
        p1.incPoligoni();
        System.out.println("p1.numeropoligoni: " + p1.numeropoligoni);
        System.out.println("p2.numeropoligoni: " + p2.numeropoligoni);
        Poligono.incPoligoni();
        System.out.println("p1.numeropoligoni: " + p1.numeropoligoni);
        System.out.println("p2.numeropoligoni: " + p2.numeropoligoni);
        System.out.println("Poligono.numeropoligoni: " + Poligono.numeropoligoni);
        */
    }
        
}
