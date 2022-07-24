/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percorsifracitta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giulio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        HashMap<String, ArrayList<Destinazione>> percorsi = new HashMap<>();
        int numeroTratte = 0; // mi serve nell'esercizio 4 dove uso un array per l'ordinamentos

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        String ultimaPartenzaIncontrata = "";
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }

            // leggo il primo carattere
            // se è - allora è una destinazione, altrimenti è una partenza
            if (line.startsWith("-")) {
                // destinazione
                String info = line.substring(1); // skip first char
                String[] tmp = info.split(",");
                String citta = tmp[0];
                Double distanza = Double.parseDouble(tmp[1].replace("Km", ""));
                System.out.println(citta + " " + distanza);
                Destinazione nuovaDestinazione = new Destinazione(citta, distanza);
                percorsi.get(ultimaPartenzaIncontrata).add(nuovaDestinazione);
                numeroTratte++; // incremento ogni volta che trovo una destinazione
            } else {
                // partenza
                percorsi.put(line, new ArrayList<Destinazione>());
                ultimaPartenzaIncontrata = line;
            }
        }

        // stampo contenuto della struttura dati
        for (String partenza : percorsi.keySet()) {
            System.out.println("partenza " + partenza);
            // stampo lista destinazioni raggiungibili da partenza
            for (Destinazione d : percorsi.get(partenza)) {
                System.out.println("   >> " + d.getCitta() + " : " + d.getDistanza());
            }
        }

        PrintWriter out = null;

        // 1. Per ogni città, trovare il percorso più lungo che parte da quella città
        System.out.println("==================== esercizo 1 ======================= ");
        out = new PrintWriter(new FileWriter("1.txt"));
        for (String partenza : percorsi.keySet()) {
            double maxdistanza = -1;
            String destinazionemaxdistanza = "";
            for (Destinazione d : percorsi.get(partenza)) {
                String citta = d.getCitta();
                Double distanza = d.getDistanza();
                if (distanza > maxdistanza) {
                    maxdistanza = distanza;
                    destinazionemaxdistanza = citta;
                }
            }
            System.out.println("con partenza da " + partenza + ": maxdistanza " + destinazionemaxdistanza + " : " + maxdistanza);
            out.println("con partenza da " + partenza + ": maxdistanza " + destinazionemaxdistanza + " : " + maxdistanza);
        }
        out.close();

        // 2. Trovare la città dalla quale partono più percorsi
        System.out.println("==================== esercizo 2 ======================= ");
        out = new PrintWriter(new FileWriter("2.txt"));
        for (String partenza : percorsi.keySet()) {
            int numeroPercorsiDaPartenza = percorsi.get(partenza).size();
            if (numeroPercorsiDaPartenza > 1) {
                System.out.println(partenza + " [" + numeroPercorsiDaPartenza + "]");
                out.println(partenza + " [" + numeroPercorsiDaPartenza + "]");
            }
        }
        out.close();

        //3. Trovare le città che possono essere raggiunte da almeno 2 altre città
        System.out.println("==================== esercizo 3 ======================= ");
        out = new PrintWriter(new FileWriter("3.txt"));
        // creo una struttura con destinazione-possibilipercorsichelaraggiungono
        HashMap<String, Integer> partenzePerDestinazione = new HashMap<>();
        for (String partenza : percorsi.keySet()) {
            for (Destinazione d : percorsi.get(partenza)) {
                String cittaDestinazione = d.getCitta();
                if (!partenzePerDestinazione.containsKey(cittaDestinazione)) {
                    partenzePerDestinazione.put(cittaDestinazione, 1);
                } else {
                    int volteesistenti = partenzePerDestinazione.get(cittaDestinazione);
                    partenzePerDestinazione.put(cittaDestinazione, volteesistenti + 1);
                }
            }
        }
        // adesso ciclo su partenzePerDestinazione e stampo quelle che hanno almeno 2 come valore
        for (String cittaDestinazione : partenzePerDestinazione.keySet()) {
            int volte = partenzePerDestinazione.get(cittaDestinazione);
            if (volte > 1) {
                System.out.println(cittaDestinazione + " " + volte);
                out.println(cittaDestinazione + " " + volte);
            }
        }
        out.close();

        // 4. Stampare i percorsi ordinati da quello più lungo a quello più corto
        System.out.println("==================== esercizo 4 ======================= ");
        out = new PrintWriter(new FileWriter("4.txt"));
        Percorso[] tuttipercorsi = new Percorso[numeroTratte];
        int i = 0;
        for (String partenza : percorsi.keySet()) {
            for (Destinazione d : percorsi.get(partenza)) {
                Percorso p = new Percorso(partenza, d.getCitta(), d.getDistanza());
                tuttipercorsi[i] = p;
                i++;
            }
        }

        // ordinamento ingenuo
        for (int j=0; j<numeroTratte-1; j++) {
            for (int k=j+1; k<numeroTratte; k++) {
                if (tuttipercorsi[j].dist < tuttipercorsi[k].dist) {
                    // scambio
                    Percorso tmp = tuttipercorsi[k];
                    tuttipercorsi[k] = tuttipercorsi[j];
                    tuttipercorsi[j] = tmp;
                }
            }
        }
        for (int j=0; j<numeroTratte; j++) {
            System.out.println(j + " " + tuttipercorsi[j].dist + " " + tuttipercorsi[j].from + " " + tuttipercorsi[j].to);
            out.println(tuttipercorsi[j].from + " " + tuttipercorsi[j].to + " " + tuttipercorsi[j].dist);
        }
        out.close();

        // 5. Verificare se la rete stradale è simmetrica, cioè se per ogni percorso X-->Y c'è il percorso Y-->X
        System.out.println("==================== esercizo 5 ======================= ");
        out = new PrintWriter(new FileWriter("5.txt"));
        boolean simmetrica = true; // assumo sia simmetrica
        // appena trovo un percorso non invertibile metto false
        for (String partenza : percorsi.keySet()) {
            for (Destinazione d : percorsi.get(partenza)) {
                String cittaCollegata = d.getCitta();
                
                // considero i percorsi raggiungibili da cittaCollegata
                ArrayList<Destinazione> destinazioniRaggiungibili = percorsi.get(cittaCollegata);
                boolean presente = false;
                if (destinazioniRaggiungibili == null) {
                    presente = false;
                }
                else {
                    for (Destinazione ragg : destinazioniRaggiungibili) {
                        if (ragg.getCitta().equals(partenza)) presente = true;
                    }
                }
                // se all'uscita del ciclo "presente" è ancora "false" vuol dire che
                // non ho trovato una destinazione che torna indietro
                if (presente == false) simmetrica = false;
            }
        }
        System.out.println("Simmetrica : " + simmetrica);
        out.println("Simmetrica : " + simmetrica);
        out.close();
    }

}
