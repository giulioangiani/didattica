/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricette;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author giulio
 */
public class Ricette {
    
    public static ArrayList<Ricetta> ricettario = new ArrayList<>();
    
    public static void creaRicetta(String nomefile) {
        
        System.out.println("Leggo il contenuto del file " + nomefile);
        
        Ricetta r = new Ricetta();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader (nomefile));
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(">> " + line);
                String[] tmp = line.split(",");
                r.ingredienti.put(tmp[0], Integer.parseInt(tmp[1]));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        ricettario.add(r);
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String path = "/tmp/dati";
        
        // TODO code application logic here
        File dir = new File(path);
        String[] files = dir.list();
        System.out.println("files = " + files.length);
        
        for (String fname : files) {
            String nomeCompletoFile = path + "/" + fname;
            System.out.println("Analizzo il file " + nomeCompletoFile);
            
            creaRicetta(nomeCompletoFile);    
        }
        
        for (Ricetta r : ricettario) {
            System.out.println("Ricetta " + r);
            System.out.println("Ricetta " + r.ingredienti + " : " + r.ingredienti.size());
            
            for (String k: r.ingredienti.keySet()) {
                int quantita = r.ingredienti.get(k);
                System.out.println("  ### ingrediente " + k + " - quantita " + quantita);
            }
        }
        

        HashMap<String, ArrayList<Ricetta>> ricetteConStessiIngredienti = new HashMap<>();
        for (Ricetta r : ricettario) {
            for (String ing: r.ingredienti.keySet()) {
                if (ricetteConStessiIngredienti.get(ing) == null) {
                    ricetteConStessiIngredienti.put(ing, new ArrayList<Ricetta>());
                }
                ricetteConStessiIngredienti.get(ing).add(r);
            }
        }
        System.out.println("ricetteConStessiIngredienti " + ricetteConStessiIngredienti);

        for (String ing : ricetteConStessiIngredienti.keySet()) {
            System.out.println("Ingrediente " + ing + " - numero ricette " + ricetteConStessiIngredienti.get(ing).size());
        }
        
    }
    
}
