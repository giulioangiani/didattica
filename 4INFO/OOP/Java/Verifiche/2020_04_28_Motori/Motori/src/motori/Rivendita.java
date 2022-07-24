package motori;

import java.util.Scanner;

public class Rivendita {
    public static void so(Object o) { System.out.print(o); }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Catalogo c = new Catalogo();
            // Inserisci qui le istruzioni per inserire 5 Moto nell'archivio
            // esempio: 
            // Moto m = new Moto();
            // c.aggiungi(m);


            // Fine delle istruzioni per inserire 5 Moto nell'archivio

            // MENU DI BASE PER MOTORI
            while (true) {
                so("\n\n\n##################### MENU ######################\n");
                so(" - 1) Inserisci una nuova Moto nell'archivio  \n");
                so(" - 2) Visualizza l'archivio delle Moto  \n");
                so(" - 3) Ricerca una Moto  \n\n");
                so(" - q) Esci dal programma  \n\n");



                String choice = sc.nextLine(); 

                switch (choice) {
                    case "1":
                        so(" INSERIMENTO \n\n");
                        so("   Scegli la tipologia\n");
                        so("   S - Scooter \n");
                        so("   T - Stradali \n");
                        so("   E - Enduro \n");

                        String tipologia = sc.nextLine();
                        Moto nuovamoto = null;
                        try {

                                switch (tipologia) {
                                    case "S":
                                        so("   >> Inserimento nuovo Scooter \n");
                                        /*
                                            AGGIUNGI LE ISTRUZIONI PER INSERIRE CORRETTAMENTE LA NUOVA MOTO
                                          */
                                        c.aggiungi(nuovamoto);
                                        break;

                                    case "T": 
                                        so("   >> Inserimento nuova Moto Stradale \n");
                                        /*
                                            AGGIUNGI LE ISTRUZIONI PER INSERIRE CORRETTAMENTE LA NUOVA MOTO
                                          */
                                        c.aggiungi(nuovamoto);
                                        break;

                                    case "E": 
                                        so("   >> Inserimento nuovo Enduro \n");
                                        /*
                                            AGGIUNGI LE ISTRUZIONI PER INSERIRE CORRETTAMENTE LA NUOVA MOTO
                                          */
                                        c.aggiungi(nuovamoto);
                                        break;

                                    default: 
                                        so("Tipologia non supportata\n\n");
                                        break;
                                }
                                

                        }
                        catch (CatalogoPienoException cpe) {
                            so(" *** Errore *** " + cpe.getMessage() + "\n\n");
                        }
                        break;
                    case "2":
                        so(" VISUALIZZAZIONE LISTA MOTO PRESENTI \n\n");
                        for (Moto m : c.getMoto()) {
                            System.out.println(m);
                        }
                        break;
                    case "3":
                        so(" RICERCA \n\n");
                        so("   Inserisci il modello : ");
                        String modello = sc.nextLine();
                        so("   Inserisci la cilindrata: ");
                        int cilindrata = sc.nextInt();
                        String dummy = sc.nextLine(); // per svuotare il buffer
                        
                        try {
                            Moto m = c.cerca(modello, cilindrata);
                            so(" TROVATA MOTO : " + m);
                        }
                        catch (VeicoloInesistenteException vie) {
                            so(" *** Errore *** " + vie.getMessage() + "\n\n");
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
