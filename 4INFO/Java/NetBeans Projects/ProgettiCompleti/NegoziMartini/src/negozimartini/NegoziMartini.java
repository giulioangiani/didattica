package negozimartini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class NegoziMartini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        HashMap<String, ArrayList<String>> prodotti = new HashMap<>();
        
        System.out.println("prodotti = " + prodotti);
        
        BufferedReader br = new BufferedReader(new FileReader("vendite.csv"));
        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] info = line.split(",");
            String negozio = info[0];
            String codiceprodotto = info[1];
            
            if (!prodotti.containsKey(negozio)) {
                System.out.println("creo " + negozio + " : " + codiceprodotto + " " + prodotti.containsKey(negozio));
                ArrayList<String> listaprodotti =  new ArrayList<>();
                prodotti.put(negozio, listaprodotti);
            }
            // la struttura esiste sicuramente
            prodotti.get(negozio).add(codiceprodotto);
        }
        System.out.println("prodotti = " + prodotti);
        
        for (Map.Entry<String, ArrayList<String>> entry : prodotti.entrySet()) {
            String nomenegozio = entry.getKey();
            ArrayList<String> codiciprodotto = entry.getValue();
            
            System.out.println("Negozio di " + nomenegozio);
            System.out.println("Prodotti venduti " + codiciprodotto);
            
        }
        
        HashMap<String, String> rubrica = new HashMap<>();
        System.out.println(rubrica);
        rubrica.put("Chibu", "2345678343");
        rubrica.put("Gimmi", "9876545673");
        System.out.println(rubrica);
        for (Map.Entry<String, String> elemento : rubrica.entrySet()) {
            String nome = elemento.getKey();
            String cell = elemento.getValue();
            if (nome.equals("Chibu"))
                System.out.println("Il numero di " + nome + " è " + cell);
            
        }
        
    }
    
}
