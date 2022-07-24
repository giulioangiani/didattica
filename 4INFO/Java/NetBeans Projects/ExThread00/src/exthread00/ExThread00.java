package exthread00;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class ExThread00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        /*
        La classe ThreadPari deve stampare i primi 30 numeri pari 
        La classe ThreadDispari deve stampare i primi 30 numeri dispari
        Utilizza il metodo statico della classe Aspetta per simulare un ritardo di almeno "delay" secondi
        fra una iterazione e l'altra nei processo Thread
        */
        System.out.println("INIZIO del processo");
        Thread t1= new Thread(new ThreadPari());
        Thread t2= new Thread(new ThreadDispari());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("FINE");
        
    }
}
