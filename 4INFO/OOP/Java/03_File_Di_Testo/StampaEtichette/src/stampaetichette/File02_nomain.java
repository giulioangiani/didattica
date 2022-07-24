/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stampaetichette;


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
public class File02_nomain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // leggo il contenuto del file indicato nel primo argomento 
        // stampo tutte le parole con vicino le occorrenze a video e sul file di output (secondo argomento)
        
        /*
        Il file clienti.txt sia strutturato come segue:
        In ogni riga sono presenti i dati di un cliente
        Nome,Cognome,PartitaIVA,Ragione Sociale,Citta,Fatturato,ListaAttivita
        
        dove ListaAttivita è una lista di stringhe separate dal carattere -
        
        es:
            Mario,Rossi,12345678901,Rossi s.p.a.,Reggio Emilia,1233567.55,Informatica-Elettronica-Sistemi di Antifurto
            Franca,Bianchi,98765432123,Bianchi s.r.l.,Modena,872652,91,Arredamento-Architettura
        
        - Progettare le classi opportune per la gestione dei clienti
        - Leggere il file e utilizzare le strutture progettate per la memorizzazione dei dati
        - Far funzionare il codice indicato nel main
        - Stampare su file di testo etichette.txt i dati di ogni cliente nel formato:
        
                Cliente: Rossi s.p.a. di Rossi Mario
                Partita IVA: 12345678901
                Sede sociale: Reggio Emilia
                Fatturato: € 1233567.55
                Ambiti di lavoro:
                    - Informatica
                    - Elettronica
                    - Sistemi di Antifurto
        
        
        
        */
        
        String srcname = null;
        String destname = null;

        if (args.length > 0) {
            srcname = args[0];
            destname = args[1];
        }
        else {
            srcname = "clienti.txt";
            destname = "etichette.txt";
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
        

        // lettura del file
        FileReader fread = new FileReader(srcname);
        BufferedReader br = new BufferedReader(fread);
        try {
            String riga;
            while (( riga = br.readLine()) != null){
                String[] info = riga.split(",");
                for (String s : info) {
                    System.out.println(s);
                }
                System.out.println("==================================");
            }
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
          
        
        PrintWriter fout = new PrintWriter(new FileWriter(destname));
        // stampa
        fout.close();
        

    }
    
}
