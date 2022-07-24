package ordini;

import java.util.GregorianCalendar;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto(123, "Penna", 1.5);
        Prodotto p2 = new Prodotto(456, "Matita", 1.2);
        Prodotto p3 = new Prodotto(789, "Gomma", 0.9);
        
        Cliente c1 = new Cliente("Marco", "Zanni", "marco.zanni@mymail.com");
        Cliente c2 = new Cliente("Luana", "Pedrini", "lupedri@hermail.com");
        Cliente c3 = new Cliente("Frank", "Kenny", "fkenny@bigmail.com");
        
        Ordine o1 = new Ordine(100, new GregorianCalendar(2021, 2, 2), "NEW");
        Ordine o2 = new Ordine(101, new GregorianCalendar(2021, 2, 3));
        Ordine o3 = new Ordine(102, new GregorianCalendar(2021, 3, 1));
        Ordine o4 = new Ordine(103, new GregorianCalendar(2021, 3, 5));
        
        o1.addProdotto(p1);
        o1.addProdotto(p2);
        o1.addProdotto(p3);

        o2.addProdotto(p1);
        o2.addProdotto(p2);

        o3.addProdotto(p2);
        o3.addProdotto(p3);
        
        System.out.println("==================== LISTA CLIENTI ====================== ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("==================== LISTA PRODOTTI ====================== ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("==================== LISTA ORDINI ====================== ");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        

        
        
        System.out.println("==================== DETTAGLIO ORDINE 100 ====================== ");
        System.out.println("Ordine :  " + o1);
        for (Prodotto p : o1.getProdottiOrdinati()) {
            System.out.println("prodotto : " + p);
        }
        System.out.println("Totale ordine : € " + o1.getTotaleOrdine());
        
        
        // cambio prezzo ad un prodotto
        p1.setPrezzo(-1);  // prezzo negativo non viene preso in considerazione
        System.out.println("Totale ordine : € " + o1.getTotaleOrdine());
        p1.setPrezzo(3);
        System.out.println("Totale ordine : € " + o1.getTotaleOrdine());
        
        
        
        // cambio stato ordine
        o1.setSpedito();
        System.out.println("Ordine :  " + o1);
        
        
        System.out.println("==================== CARICAMENTO ORDINI CLIENTI ====================== ");
        c1.addOrdine(o1);
        c1.addOrdine(o2);
        c2.addOrdine(o3);
        c3.addOrdine(o4);
        
        
        System.out.println("==================== ORDINI PER CLIENTE ====================== ");
        System.out.println(c1.getCognome() + " " + c1.getNome() + " ha fatto " + c1.getNumeroOrdini() + " ordini");
        System.out.println(c2.getCognome() + " " + c2.getNome() + " ha fatto " + c2.getNumeroOrdini() + " ordini");
        System.out.println(c3.getCognome() + " " + c3.getNome() + " ha fatto " + c3.getNumeroOrdini() + " ordini");

        
        System.out.println("==================== ORDINI CLIENTE c1 ====================== ");
        System.out.println(c1);
        for (Ordine o : c1.getOrdiniEffettuati()) {
            System.out.println("ordine effettuato : n." + o.getCodice() + " di € " + o.getTotaleOrdine());
        }
        
        for (Ordine o : c1.getOrdiniSpediti()) {
            System.out.println("ordine spedito : n." + o.getCodice() + " di € " + o.getTotaleOrdine());
        }
        
    }
    
}
