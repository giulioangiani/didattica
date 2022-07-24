/*
    Si vuole realizzare il programma di gestione di una Pizzeria.
    Il sistema deve gestire una serie di Ordini tramite la classe "GestoreOrdini"

    GestoreOrdini prende in ingresso una data che rappresenta il giorno degli ordini


    Ogni ordine contiene una lista di pizze ordinate (che possono essere
    scelte nel menù fra Margherita, Capricciosa, Vegetariana o Napoletana).

    Tutte le pizze hanno come informazioni comuni:
    - tirata (si/no)
    - glutine (si/no)
    Le altre pizze sono estensioni della Pizza base.

    Per ogni pizza ordinata l'operatore può aggiungere anche un ingrediente a scelta,
    tranne per la Napoletana che non può essere modificata perché il pizzaiolo
    è intransigente: "la Napoli si fa solo come voglio io".
    Se si prova ad inserire un ingrediente in più ordinando una Napoletana 
    si genera una eccezione "PizzaioloFuriosoException"


    Partendo dal Main fornito, creare le classi e sviluppare il programma di gestione

 */
package pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author giulio
 */
public class MainPizzeria {
    public static void so(Object o) { System.out.print(o); }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            GestoreOrdini g = new GestoreOrdini();
        
            Scanner sc = new Scanner(System.in);

            // Inserisci qui le istruzioni per inserire 5 Ordini nel Gestore ordini g
            // esempio: 
            Pizza m = new Margherita();
            Pizza n = new Napoletana();
            Ordine o1 = new Ordine("Giulio",  m);  // aggiungo una pizza Margherita
            Ordine o2 = new Ordine("Alessandro",  n);  // aggiungo una pizza Napoletana
            g.aggiungi(o1);
            g.aggiungi(o2);
            
            /* QUESTO BLOCCO DA' UN ERRORE PERCHÉ HAI PROVATO A METTERE LA MAIONESE IN UNA NAPOLETANA 
            Pizza napolistrana = new Napoletana();
            try {
                Ordine o3 = new Ordine("Giulio", napolistrana, "Maionese"); // aggiungo una Vegetariana con origano
                g.aggiungi(o3);
            }
            catch (PizzaioloFuriosoException pfe) {
                so(pfe.getMessage());
            }
            */
            
            // MENU DI BASE PER PIZZERIA
            while (true) {
                so("\n\n\n##################### MENU ######################\n");
                so(" - 1) Inserisci un nuovo Ordine  \n");
                so(" - 2) Visualizza l'archivio degli Ordini  \n");
                so(" - 3) Ricerca una Ordine con numero ordine o nome del cliente  \n\n");
                so(" - q) Esci dal programma  \n\n");

                String choice = sc.nextLine(); 

                switch (choice) {
                    case "1":
                        so(" INSERIMENTO \n\n");
                        so("   Scegli la tipologia\n");
                        so("   M - Margherita \n");
                        so("   N - Napoletana \n");
                        so("   V - Vegetariana \n");

                        String tipologia = sc.nextLine();
                        Pizza nuovapizza = null;
                        try {

                                so("   Ingrediente aggiuntivo? : ");
                                String ingredienteaggiuntivo = sc.nextLine();
                                switch (tipologia) {
                                    case "M":
                                        so("   >> Inserimento nuova Margherita \n");
                                        /*
                                            AGGIUNGI LE ISTRUZIONI PER INSERIRE CORRETTAMENTE 
                                            L'ORDINE DELLA NUOVA MARGHERITA
                                          */
                                        
                                        break;

                                    case "N": 
                                        so("   >> Inserimento nuova Napoletana \n");
                                        /*
                                            AGGIUNGI LE ISTRUZIONI PER INSERIRE CORRETTAMENTE 
                                            L'ORDINE DELLA NUOVA MARGHERITA
                                          */
                                        
                                        Ordine ordinepizzastrana = new Ordine("Qualcuno", new Napoletana(), "Marshmellow");
                                        
                                        break;

                                    case "V": 
                                        so("   >> Inserimento nuova Vegetariana \n");
                                        /*
                                            AGGIUNGI LE ISTRUZIONI PER INSERIRE CORRETTAMENTE 
                                            L'ORDINE DELLA NUOVA MARGHERITA
                                          */
                                        
                                        break;

                                    default: 
                                        so("Pizza non supportata\n\n");
                                        break;
                                }
                                
                                

                        }
                        catch (PizzaioloFuriosoException pfe) {
                            so(" *** Errore *** " + pfe.getMessage() + "\n\n");
                        }
                        break;
                    case "2":
                        so(" VISUALIZZAZIONE LISTA ORDINI \n\n");
                        for (Ordine o : g.getOrdini()) {
                            System.out.println(o);
                        }
                        break;
                    case "3":
                        so(" RICERCA \n\n");
                        so("   Inserisci il cliente : ");
                        String cliente = sc.nextLine();
                        
                        try {
                            ArrayList<Ordine> listaordinicliente = g.cerca(cliente);
                            so(" TROVATI : ");
                            // inserisci le istruzioni per elencare gli ordini del cliente
                        }
                        catch (OrdiniNonPresentiException onpe) {
                            so(" *** Errore *** " + onpe.getMessage() + "\n\n");
                        }
                        
                        break;
                    case "q":
                        so(" FINE del programma \n\n");
                        System.exit(0);
                    default:
                        so("Scelta non valida!\n\n");
                        break;
                }

            }
        
    }
    
}
