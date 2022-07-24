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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author giulio
 */
public class File02 {

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
            Franca,Bianchi,98765432123,Bianchi s.r.l.,Modena,872652.91,Arredamento-Architettura
        
        - Progettare le classi opportune per la gestione dei clienti
        - Leggere il file e utilizzare le strutture progettate per la memorizzazione dei dati
        - Far funzionare il codice indicato nel main
        - Stampare su file di testo etichette.txt i dati di ogni cliente nel formato 
        
                Cliente: Rossi s.p.a. di Rossi Mario
                Partita IVA: 12345678901
                Sede sociale: Reggio Emilia
                Fatturato: € 1233567.55
                Ambiti di lavoro:
                    - Informatica
                    - Elettronica
                    - Sistemi di Antifurto
        
        In calce al testo trovate un esempio del file "etichette.txt" corrispondente
        
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
        }
        
        Gestionale g = new Gestionale();
        
        
        // lettura del file
        FileReader fread = new FileReader(srcname);
        BufferedReader br = new BufferedReader(fread);
        try {
            String riga;
            while (( riga = br.readLine()) != null){
                String[] info = riga.split(",");
                // creo nuovo oggetto
                String nome = info[0];
                String cognome = info[1];
                String partitaIva = info[2];
                String ragioneSociale = info[3];
                String citta = info[4];
                float fatturato = Float.valueOf(info[5]);
                String[] ambiti = info[6].split("-");
                Cliente c = new Cliente(nome, cognome, partitaIva);
                c.setRagioneSociale(ragioneSociale);
                c.setSedeSociale(citta);
                c.setFatturato(fatturato);
                for (String a : ambiti) {
                    c.addAmbito(a);
                }  
                
                g.inserisciCliente(c);
            }
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        
        // controllo l'esistenza dei file nella cartella etichette
        File fileetichette = new File("etichette");
        for (String l : fileetichette.list()) {
            System.out.println("Quale lingua : " + l.split("\\.")[0]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la lingua desiderata : ");
        String lingua = sc.nextLine();
        String etfile = "etichette/"+lingua+".txt";
        BufferedReader bretichette = new BufferedReader(new FileReader(etfile));
        HashMap<String, String> etichette = new HashMap<>();
        try {
            etichette.put("INTESTAZIONE", bretichette.readLine());
            etichette.put("CLI", bretichette.readLine());
            etichette.put("IVA", bretichette.readLine());
            etichette.put("RAG", bretichette.readLine());
        }
        catch (Exception e) {}
        bretichette.close();
        // apro il file di etichette giusto

        // stampa file ETICHETTE.TXT
        PrintWriter fout = new PrintWriter(new FileWriter(destname));
        
        // qui il codice per l'intestazione del file etichette.txt
        // nel formato richiesto (vedi risultato in calce al testo)
        
        fout.println("================================================================================");
        fout.println("Clienti presenti: " + g.getNumeroClienti());
        fout.println("================================================================================");
        
        for (Cliente c : g.getListaClienti()) {
            // qui il codice per stampare le etichette sul file etichette.txt
            // nel formato richiesto sopra (vedi risultato in calce al testo)
            fout.println(etichette.get("CLI") + ": " + c.getRagioneSociale() + " di " + c.getCognome() + " " + c.getNome());
            fout.println(etichette.get("IVA") + ": " + c.getPartitaIva());
            fout.println(etichette.get("RAG") + ": " + c.getSedeSociale());
            fout.println("Fatturato: € " + c.getFatturato());
            fout.println("Ambiti di lavoro:");
            for (String a : c.getAmbiti()) {
                fout.println("    - " + a);
            }
            fout.println("================================================================================");
        }
        
        fout.close();
        

    }
    
}


/*
Esempio del file etichette.txt
================================================================================
Clienti presenti: 2
================================================================================
Cliente: Rossi s.p.a. di Rossi Mario
Partita IVA: 12345678901
Sede sociale: Reggio Emilia
Fatturato: € 1233567.5
Ambiti di lavoro:
    - Informatica
    - Elettronica
    - Sistemi di Antifurto
================================================================================
Cliente: Bianchi s.r.l. di Bianchi Franca
Partita IVA: 98765432123
Sede sociale: Modena
Fatturato: € 872652.94
Ambiti di lavoro:
    - Arredamento
    - Architettura
================================================================================

*/