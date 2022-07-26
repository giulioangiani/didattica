/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file01;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;


/**
 *
 * @author giulio
 */
public class File01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // leggo il contenuto del file indicato nel primo argomento 
        // stampo tutte le parole con vicino le occorrenze a video e sul file di output (secondo argomento)
        String srcname = null;
        String destname = null;

        if (args.length > 0) {
            srcname = args[0];
            destname = args[1];
        }
        else {
            srcname = "input.txt";
            destname = "output.txt";
        }
        
        File f = new File(srcname);
        if (!f.exists()) {
            System.out.println("Il file " + f + " non esiste! Lo creo");
            f.createNewFile();
        }        
        else {
            System.out.println("Il file esiste!");
            //return;
        }
        
        
        // struttura per le occorrenze
        HashMap<String, Integer> occorrenze = new HashMap<>();
        
        // lettura del file
        FileReader fread = new FileReader(srcname);
        BufferedReader br = new BufferedReader(fread);
        try {
            String parola;
            // finchè ci sono righe nel file
            while (( parola = br.readLine()) != null) {
                System.out.println(">>  " + parola);
                if (!occorrenze.containsKey(parola)) {
                    // prima volta che leggo il valore
                    // inserisco 1 come valore corrispondente
                    occorrenze.put(parola, 1); // inserisce la coppia chiave-valore
                }
                else {
                    // devo aggiungere 1 al valore esistente
                    int valorepresente = occorrenze.get(parola); // legge il valore
                    occorrenze.put(parola, valorepresente+1);
                }
            }
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
          
        // creo il puntatore al file di scrittura (in sovrascrittura)
        PrintWriter fout = new PrintWriter(new FileWriter(destname));
        
        // iterazione su una HashMap
        // stampo contenuto occorrenze e scrivo su file
        for (HashMap.Entry<String, Integer> entry : occorrenze.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
            fout.println(entry.getKey() + "\t" + entry.getValue());   
        }
        fout.close();
        

    }
    
}
