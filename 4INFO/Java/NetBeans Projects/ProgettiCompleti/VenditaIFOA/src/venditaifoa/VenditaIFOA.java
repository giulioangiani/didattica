package venditaifoa;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Giulio Angiani 
 */
public class VenditaIFOA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vendibile> oggettidavendere = new ArrayList();
        Tablet t = new Tablet("ACER Aspire");
        t.setSelling_price(50);
        oggettidavendere.add(new Computer("HP"));
        
        TabletVendibile tv = new TabletVendibile("LENOVO");
        oggettidavendere.add(tv);     
        
        
        ArrayList<Acquistabile> oggettidacomprare = new ArrayList();
        Computer c = new Computer("Mac OSX");
        oggettidacomprare.add(c);
        
        HashMap<String, Integer> mappa = new HashMap<>();
        mappa.put("Giulio", 34567890);
        mappa.put("Chiara", 98765432);
        System.out.println(mappa.get("Giulio"));
        
        HashMap<Computer, Integer> mappa2 = new HashMap<>();
        
        
    }
    
}
