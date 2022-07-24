package scuola;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Studente s1 = new Studente("Charlie", "Brown", 4, 'C');
        
        try {
            Studente s2 = new Studente("Piperita", "Patty", 6, 'A');
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println("Studente s1 = " + s1);
        System.out.println("voti " + s1.getVoti());
        System.out.println("numero voti inseriti: " + s1.getNumeroVoti());
        System.out.println("media voti inseriti: " + s1.getMediaVoti());
        s1.addVoto(10);
        s1.addVoto(5);
        s1.addVoto(7.5);
        s1.addVoto(9.25);
        System.out.println("voti " + s1.getVoti());
        System.out.println("numero voti inseriti: " + s1.getNumeroVoti());
        System.out.println("media voti inseriti: " + s1.getMediaVoti());
        
        
        
        
        
        // Scheda dello studente
        System.out.println("Scheda dello Studente : " + s1.getNome() + " " + s1.getCognome());
        System.out.println("Classe " + s1.getClasse() + " " + s1.getSezione());
        for (double voto : s1.getVoti()) { // iterazione su ArrayList => per ogni voto in s1.getVoti() 
            System.out.println(" => " + voto);
        }
        
        
    }
    
}
