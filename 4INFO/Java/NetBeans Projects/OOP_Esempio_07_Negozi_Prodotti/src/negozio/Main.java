package negozio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new FileReader("vendite.csv"));
        String line = br.readLine(); // per saltare l'intestazione
        
        var negozi = new ArrayList<Negozio>();
        
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");
            String nomenegozio = info[0];
            String codiceprodotto = info[1];
            
            System.out.println("negozio = " + nomenegozio);
            System.out.println("codiceprodotto = " + codiceprodotto);
            
            // se non esiste il negozio appena letto lo creo e lo inserisco nell'arraylist
            Negozio tmp = null;
            for (Negozio n : negozi) {
                if (n.getNome().equals(nomenegozio)) {
                    System.out.println("Esiste già il negozio " + nomenegozio);
                    tmp = n;
                }
            }
            // se tmp è ancora null
            if (tmp == null) {
                tmp = new Negozio(nomenegozio);
                System.out.println("Creo il negozio " + nomenegozio);
                negozi.add(tmp);
            }
            System.out.println("n = " + tmp.getNome() + " : " + tmp);
            
            System.out.println("=======================0");
            // adesso tmp è sicuramente il negozio corrispondente alla riga
            
            
            
        /*    if (!prodotti.containsKey(negozio)) {
                System.out.println("creo " + negozio + " : " + codiceprodotto + " " + prodotti.containsKey(negozio));
                ArrayList<String> listaprodotti =  new ArrayList<>();
                prodotti.put(negozio, listaprodotti);
            }
            // la struttura esiste sicuramente
            prodotti.get(negozio).add(codiceprodotto);
        */
        }
//        System.out.println("prodotti = " + prodotti);
    }
    
}
