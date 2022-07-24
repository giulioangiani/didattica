package biblioteca;

import amministrazione.Gestore;
import amministrazione.Utente;
import amministrazione.Astra;
import amministrazione.AstraFiglia;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Libro r1 = new Libro("Luigi Pirandello", "Uno, nessuno e centomila");
        //r1.setAutore("Luigi Pirandello");
        //r1.setTitolo("Uno, nessuno e centomila");
        System.out.println("R1 = " + r1.getAutore() + " : " + r1.getTitolo());
        
        
        LibroDiTesto t1 = new LibroDiTesto("Nikolassy", "Informatica 4");
        //t1.setAutore("Nikolassy");
        //t1.setTitolo("Informatica 4");
        System.out.println("T1 = " + t1.getAutore() + " : " + t1.getTitolo());
        t1.stampaAutore();
        
        LibroDiTesto t2 = new LibroDiTesto("Nikolassy", "Informatica 3", true);
        System.out.println("T2 = " + t2.getAutore() + " : " + t2.getTitolo() + " : " + t2.adottato());
        System.out.println("T1 = " + t1.getAutore() + " : " + t1.getTitolo() + " : " + t1.adottato());

        
        System.out.println("############################################");
        Libro n = (Libro)t1;
        System.out.println(">> " + n.getAutore());
        
        //LibroDiTesto t = (LibroDiTesto)r1;  NO SE NON SIETE CERTI CHE r1 SIA UN LIBRODITESTO
        //t.stampaAutore();
        */
        Libro r1 = new Libro("Luigi Pirandello", "Uno, nessuno e centomila");
        System.out.println("R1 = " + r1.getAutore() + " : " + r1.getTitolo());

        LibroDiTesto t2 = new LibroDiTesto("Dante Alighieri", "La Divina Commedia", true);
        System.out.println("T2 = " + t2.getAutore() + " : " + t2.getTitolo() + " : " + t2.adottato());
        
        // usiamo Utente e Gestore
        Utente u = new Utente("Massimo", "Gramellini");
        Gestore g = new Gestore("Stefano", "Benni");
        u.addPrestito(r1);
        
        //Astra a = new Astra();
        AstraFiglia af = new AstraFiglia();
        af.metodoAstratto();
        
    }
    
}
