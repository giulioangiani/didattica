/*

Progettare e realizzare un programma con relative e opportune classi, per potere gestire i dati dei voti
di una classe.
I voti sono memorizzati sul file di testo voti.csv e riportano le valutazioni per materia per giorno per studente
i campi rappresentano, nell'ordine: matricola, nome, cognome, materia, data, voto
Il programma, dopo aver letto e interpretato correttamente i valori presenti sul file, deve implementare le seguenti funzioni:
- ricerca di tutti i voti di uno studente per matricola
- ricerca di tutti i voti di uno studente per cognome
- ricerca di tutti i voti di una materia
- ricerca di tutti i voti per data
- inserimento di un nuovo studente
- inserimento di una nuova materia
- inserimento di un nuovo voto per studente per materia per data
- aggiornamento dei dati sul file


 */
package gestionevotifileditesto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String dbname = "voti.csv";

        // questa parte può essere delegata ad una classe di gestione Studenti
        HashMap<String, Studente> studenti = new HashMap<>();

        File f = new File(dbname);

        // lettura del file
        FileReader fread = new FileReader(dbname);
        BufferedReader br = new BufferedReader(fread);
        try {
            String riga;
            while ((riga = br.readLine()) != null) {
                String[] info = riga.split(",");
                // creo nuovo oggetto
                String matricola = info[0];
                String nome = info[1];
                String cognome = info[2];
                String materia = info[3];
                String data = info[4];
                float voto = Float.parseFloat(info[5]);

                // se lo studente con la matricola indicata esiste già in mappa
                // lo utilizzo, altrimenti lo creo uno nuovo
                Studente s;
                if (studenti.containsKey(matricola)) {
                    s = studenti.get(matricola);
                } else {
                    System.out.println("inserisco : " + matricola);
                    s = new Studente(nome, cognome, matricola);
                    studenti.put(matricola, s);
                }
                s.addVoto(materia, voto, data);

                // aggiungo il voto allo studente indicato
                /*
                System.out.println(matricola);
                System.out.println(nome);
                System.out.println(cognome);
                System.out.println(materia);
                System.out.println(matricola);
                System.out.println(data);
                System.out.println(voto);
                 */
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        fread.close();

        // QUI ISTRUZIONI PER INTERFACCIA UTENTE        
        // SIMULO INSERIMENTO PER UN NUOVO STUDENTE E PER UNO ESISTENTE
        // nuovo
        Studente s = new Studente("Marina", "Briganti", "9876");
        studenti.put("9876", s);
        s.addVoto("Filosofia", (float) 8.5, "2020-05-03");

        // esistente
        Studente es = studenti.get("8765");
        s.addVoto("Informatica", (float) 5.5, "2020-05-12");

        // aggiornamento file alla chiusura del programma
        String outname = "voti2.csv";   // va sostituito con il nome del file originale per sovrascriverlo
        PrintWriter fout = new PrintWriter(new FileWriter(outname));

        // qui il codice per l'aggiornamento del file voti.csv
        for (Map.Entry<String, Studente> e : studenti.entrySet()) {
            Studente tmp = e.getValue();
            for (Voto v : tmp.getVoti()) {
                fout.print(e.getKey() + "," + tmp.getNome() + "," + tmp.getCognome() + ",");
                fout.println(v.getMateria() + "," + v.getData() + "," + v.getVoto());
            }
        }
        fout.close();
    }

}
