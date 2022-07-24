package zoo;

import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    public static void stampaVersi(ArrayList<Animale> pets) {
        for (Animale a : pets) {
            System.out.print(a);
            a.parla();
        }          
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animale> pets = new ArrayList<>();
        //Animale a1 = new Animale();
        Cane c = new Cane();
        Gatto g = new Gatto();
        Pesce p = new Pesce();
        //pets.add(a1);
        pets.add(c);
        pets.add(g);
        pets.add(p);

        stampaVersi(pets);
     
    }
    
}
