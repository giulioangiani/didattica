/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giulio
 * 
 * Gestionale di una Pizzeria
 * Dobbiamo gestire Ordini 
 * Ogni ordine ha un cliente e una data
 * In ogni ordine ci possono essere tante pizze
 * Le pizze sono di tre tipi
 *  - Margherita
 *  - Napoletana
 *  - Vegetariana
 * Tutte le pizze possono essere 
 *  - normali o tirate
 *  - senza glutine, farina normale o con farina di kamut
 * Le pizze hanno anche un prezzo (le tirate costano 1 euro in più)
 * Quando si aggiunge una pizza ad un ordine si può scegliere un altro ingrediente
 * tranne che alla Napoletana perché il pizzaiolo non vuole e la cosa lo
 * manda in PizzaioloFuriosoException. Salterà su gridando "Ae'! se' 'scit' pazz'??"
 * 
 * Progettare le classi opportune per far funzionare il sistema
 * 
 * Operazioni da implementare
 * 
 * 1 - inserimento di un ordine
 * 2 - inserimento di pizze nell'ordine
 * 3 - ricerca ordine per nome cliente
 * 4 - stampa dell'ordine con costo totale
 * 
 */
public class MainPizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gestionale g = new Gestionale();
        
        Ordine o = new Ordine();
        Cliente c = new Cliente("Iris");
        o.setCliente(c);
        o.setData(new Date());
        
        Margherita ma = new Margherita();
        o.addPizza(ma); // richiesta n.2 - inserimento di una pizza nell'ordine
        Napoletana na = new Napoletana();
        o.addPizza(na); // richiesta n.2 - inserimento di una pizza nell'ordine
        Vegetariana vg = new Vegetariana();
        o.addPizza(vg); // richiesta n.2 - inserimento di una pizza nell'ordine
        try {
            Napoletana n2a = new Napoletana("maionese");
            o.addPizza(n2a); // richiesta n.2 - inserimento di una pizza nell'ordine
        } catch (PizzaioloFuriosoException ex) {
            System.out.println(ex.getMessage());
        }
        
        g.aggiungi(o); // richiesta n.1 - inserimento dell'ordine
        
        
        // secondo ordine inserito
        Cliente c2 = new Cliente("Paride");
        Ordine o2 = new Ordine(c2, new Date());
        o2.addPizza(new Margherita());
        o2.addPizza(new Vegetariana());
        o2.addPizza(new Margherita("salsicce"));
        
        g.aggiungi(o2); // richiesta n.1 - inserimento dell'ordine
        System.out.println("Gestionale: " + g);
        System.out.println("Ordini: " + g.getListaOrdini());
        
        
        // 3 - ricerca ordine per nome cliente
        Scanner sc = new Scanner(System.in);
        // chiedo nome in input
        String ricerca;
        System.out.print("Inserisci nome del cliente: ");
        ricerca = sc.nextLine();
        
        try {
            Ordine x = g.getOrdinePerNome(ricerca);
            // non c'è errore quindi stampo i dati dell'ordine
            System.out.println("Ordine di " + ricerca);
            
            for (Pizza p : x.getPizze()) {
                System.out.println(p);
            }
            
            // 4 - stampa dell'ordine con costo totale
            System.out.println("Totale ordine " + x.getTotale());
            
            
        } catch (ClienteNonTrovatoException ex) {
            System.out.println("Ooops!\n" + ex.getMessage());
        }
        
    }
    
}
