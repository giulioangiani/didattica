/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agritutto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giulio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String dbname = "magazzino.csv";
        
        ArrayList<Articolo> articoli = new ArrayList<>();
        HashMap<String, Articolo> magazzino = new HashMap<>();
        
        File f = new File(dbname);
        
        String dummy = null;

        // lettura del file
        FileReader fread = new FileReader(dbname);
        BufferedReader br = new BufferedReader(fread);
        try {
            String riga;
            dummy = br.readLine(); // lettura per togliere via le etichette
            System.out.println("etichette = " + dummy);
            while ((riga = br.readLine()) != null) {
                String[] info = riga.split(",");
                // splitto tutte le righe rispetto al carattere corretto (in questo caso , )
                String codice = info[0];
                String descrizione = info[1];
                Double prezzo = Double.parseDouble(info[2]);
                String categoria = info[3];
                int quantita = Integer.parseInt(info[4]);
                
                Articolo a = new Articolo(codice, descrizione, prezzo, categoria, quantita);
                articoli.add(a);
                
                magazzino.put(codice, a);   
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        fread.close();    
        
        // Scriviamo il programm di gestione degli articoli
        // inserisci nuovo articolo
        Articolo a1 = new Articolo("NW111", "Pala piccola", 10.50, "giardinaggio", 10);
        articoli.add(a1);
        magazzino.put("NW111", a1);
        
        // modifica una articolo con codice TR292
        for (Articolo tmp : articoli) {
            if (tmp.getCodice().equals("TR292")) {
                try {
                    tmp.vendi();    // se ho trovato il mio articolo vendo un pezzo
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        // ricerca su hashmap
        if (magazzino.containsKey("TR292")) {
            Articolo tmp = magazzino.get("TR292");
            try {
                tmp.vendi();
            } catch (Exception ex) {
                 ex.printStackTrace();
            }
        }
        
        // cancellazione articolo "CN222"
        magazzino.remove("CN222");
        
        // Stampa ArrayList
        for (Articolo tmp : articoli) {
            System.out.println(tmp);
        }
        
        System.out.println("===================================================");
        
        // Stampa HashMap
        for (Map.Entry<String, Articolo> m : magazzino.entrySet()) {
            System.out.println(m.getValue() + "");
        }
        
        
        
        System.out.println("Articoli: " + articoli.size());
        System.out.println("Magazzino: " + magazzino.size());
        
        String outname = "magazzino2.csv";   // va sostituito con il nome del file originale per sovrascriverlo
        PrintWriter fout = new PrintWriter(new FileWriter(outname));
            fout.println(dummy);
        // Stampa HashMap
            for (Map.Entry<String, Articolo> m : magazzino.entrySet()) {
                fout.println(m.getKey() + "," + m.getValue().getDescrizione());
            }
        
        fout.close();
    }
    
}
