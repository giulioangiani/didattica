/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolopagaabstract;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giulio
 */
public class CalcoloPagaAbstract {

    public static void stampaRetribuzione(Dipendente d) {
        System.out.println("Da stampaRetribuzione " + d);
    }
    
    public static void printSalary(ArrayList<Dipendente> employees) throws IOException {
        PrintWriter fout = new PrintWriter(new FileWriter("export.txt"));
        
        for (Dipendente e : employees) {
            System.out.println(e);
            System.out.println(" mansione  : " + e.getMansione());
            System.out.println(" stipendio : € " + e.calcolaStipendio());
            
            fout.println(e);
            fout.println(" mansione  : " + e.getMansione());
            fout.println(" stipendio : € " + e.calcolaStipendio());
        }

        fout.close();
        
        
        
    }
    
    public static void main(String[] args)  {
        ArrayList<Dipendente> employees = new ArrayList<>();

        
        // leggere il file di testo
       
        try {
            BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
            String line;
            line = br.readLine(); // skip first line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] info = line.split(","); // esplode una riga in una array di stringhe
                String tipo = info[0];
                String nome = info[1];
                String cognome = info[2];
                String mansione = info[3];
                float stipendiobase = Float.parseFloat(info[4]);
                String[] dataassunzione = info[5].split("-");
                int anno = Integer.parseInt(dataassunzione[0]);
                int mese = Integer.parseInt(dataassunzione[1]);
                int giorno = Integer.parseInt(dataassunzione[2]);

                if (tipo.equals("IMPIEGATO")) {
                    employees.add(new Impiegato(nome, cognome, mansione, new GregorianCalendar(anno, mese, giorno)));
                }

                if (tipo.equals("AMMINISTRATORE")) {
                    employees.add(new Amministratore(nome, cognome, mansione, new GregorianCalendar(anno, mese, giorno)));
                }
                if (tipo.equals("TECNICO")) {
                    employees.add(new Tecnico(nome, cognome, mansione, new GregorianCalendar(anno, mese, giorno)));

                }

            }
        }
        
        catch (Exception e) {
            //System.out.println("ERRORE IN IMPORTAZIONE FILE " + e.getMessage());
            System.out.println("Ooops! Che peccato! Riprova fra qualche minuto");
            //e.printStackTrace();
        }

        // creare gli oggetti giusti
        // inserirli dentro employees
        
        /*
        
        Impiegato i = new Impiegato("Luca", 
                                    "Giallini", 
                                    "Revisore dei conti", 
                                    new GregorianCalendar(2005, 10, 1)
                                );
        i.setStipendiobase(3000);
        employees.add(i);
        
        Amministratore d = new Amministratore("Francesca", 
                                    "Falco", 
                                    "Dirigente settore relazioni pubblico", 
                                    new GregorianCalendar(2002, 1, 1)
                                );

        employees.add(d);        
        */

        try {
            printSalary(employees);
        } catch (IOException ex) {
            System.out.println("ERRORE IN SCRITTURA " + ex.getMessage());
        }
        
        employees.forEach((n) -> stampaRetribuzione(n));
        employees.forEach((n) -> premioAziendale(n, 10));
        
    }

    private static void premioAziendale(Dipendente n, int i) {
        System.out.println(n + " " + n.calcolaStipendio()*((100+i)/100));
    }
    
}
