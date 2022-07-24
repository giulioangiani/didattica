package esame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        
        HashMap<String, ArrayList<Gruppo>> gruppi = new  HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("dati.txt"));
        String line;
        String nome = ""; // il nome del gruppo che mano a mano si considererà
        Sequenza s = null;
        boolean start = true;
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) //linea vuota da saltre
            {
                continue;
            }
            if (line.contains("+")) { // c'è il nome del gruppo, il + mi identifica il nome del gruppo
                nome = line.substring(1, line.length()); // prendo il nome del gruppo dopo il "+"
                ArrayList<Gruppo> arr = null;
                if (gruppi.containsKey(nome)) { //  c'è già il gruppo,
                    // aggiungo vettore a questo gruppo
                    arr = gruppi.get(nome);
                }
                else {
                    // creo il gruppo
                    arr = new ArrayList<Gruppo>();
                    gruppi.put(nome, arr);
                }
                
            }

            s.sequenza.add(Integer.parseInt(line.trim()));
        }
        lg.get(lg.indexOf(new Gruppo(nome))).sequenze.add(s);
        br.close();

        for (Gruppo g : lg) {
            System.out.println(g);
        }

        // PUNTO 2: Per ogni gruppo, stampare i numeri associati senza duplicati.
        PrintWriter out = new PrintWriter(new FileWriter("2.txt"));
        out.println("Per ogni gruppo, stampare i numeri associati senza duplicati :");

        ArrayList<Integer> numeri = new ArrayList<Integer>();

        for (Gruppo g : lg) {
            numeri = new ArrayList<Integer>();
            for (Sequenza s1 : g.sequenze) {
                for (int el : s1.sequenza) {
                    if (!numeri.contains(el)) {
                        numeri.add(el);
                    }
                }
            }
            out.println(g.nome + " " + numeri.toString());
        }

        out.close();

        //PUNTO 1: Per ogni gruppo stampare quanti vettori contiene.
        out = new PrintWriter(new FileWriter("1.txt"));
        for (Gruppo g : lg) {
            out.println(g.nome + " = " + g.sequenze.size());
        }
        out.close();

        // PUNTO 3:  Stampare se ci sono vettori uguali (stessi elementi nello stesso ordine) 
        out = new PrintWriter(new FileWriter("3.txt"));

        HashMap<String, ArrayList<String>> mappa = new HashMap<String, ArrayList<String>>();

        String nomeVettore1 = "";
        String nomeVettore2 = "";

        boolean esisteUguale = false;
        for (Gruppo g : lg) {
            int contaVettore1 = 1;
            for (Sequenza s1 : g.sequenze) {
                nomeVettore1 = g.nome + "_" + contaVettore1;
                for (Gruppo g2 : lg) {
                    int contaVettore2 = 1;
                    for (Sequenza s2 : g2.sequenze) {
                        nomeVettore2 = g2.nome + "_" + contaVettore2;
                        if (mappa.get(nomeVettore2) == null) {
                            mappa.put(nomeVettore2, new ArrayList<String>());
                        }

                        if (nomeVettore1.equals(nomeVettore2)) { // stesso vettore, salto!
                            continue;
                        }
                        if (s1.equals(s2)) {
                            esisteUguale = true;
                            if (!mappa.get(nomeVettore2).contains(nomeVettore1)) {
                                mappa.get(nomeVettore1).add(nomeVettore2);
                                out.println("I vettori " + nomeVettore1 + " e " + nomeVettore2 + " sono uguali");
                            }
                        }
                        contaVettore2++;
                    }
                }
                contaVettore1++;
            }
        }
        if (!esisteUguale) {
            out.println("Non ci sono vettori uguali.");
        }
        out.close();

        //PUNTO 4:Trovare i gruppi i cui elementi hanno tutti la stessa 
        //dimensione. Considerare questi come delle matrici e dire se 
        //sono matrici quadrate identiche (m[i][j]=1 se i==j, altrimenti m[i][j]=0)
        out = new PrintWriter(new FileWriter("4.txt"));
        boolean esiste = false;
        for (Gruppo g : lg) {
            if (g.MatQuadrata()) {
                if (MatIdentica(g)) {
                    esiste = true;
                    out.println("Le sequenze di " + g.nome + " formano una matrice quadrata e identica");
                }
            }
        }
        if (!esiste) {
            out.println("Nessun gruppo ha sequenze che formano una matrice quadrata e identica");
        }
        out.close();

        //PUNTO 5:Stampare se ci sono gruppi che contengono gli stessi vettori 
        out = new PrintWriter(new FileWriter("5.txt"));
        HashMap<String, ArrayList<String>> mappaGruppiVettori = new HashMap<String, ArrayList<String>>(); // le key sono i nomi dei gruppi che hanno una lista dei gruppi che contengono gli stessi vettori.
        for (Gruppo g : lg) {
            for (Gruppo g2 : lg) {
                if (g.nome.equals(g2.nome)) // stesso gruppo, lo salto
                {
                    continue;
                }
                if (!g.haStessiVettori(g2)) {
                    continue;
                }
                if (mappaGruppiVettori.get(g2.nome) != null && mappaGruppiVettori.get(g2.nome).contains(g.nome)) {
                    continue;
                }
                ArrayList<String> stessiVettori;
                if (mappaGruppiVettori.get(g.nome) == null) {
                    stessiVettori = new ArrayList<String>();
                } else {
                    stessiVettori = mappaGruppiVettori.get(g.nome);
                }
                stessiVettori.add(g2.nome);
                mappaGruppiVettori.put(g.nome, stessiVettori);
                out.println("Il gruppo " + g.nome + " contiene gli stessi vettori del gruppo " + g2.nome);

            }
        }

        out.close();

    }

    public static int[][] toArray(Gruppo g) {
        int[][] m = new int[g.sequenze.size()][g.sequenze.get(0).sequenza.size()];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = g.sequenze.get(i).sequenza.get(j);
            }
        }
        return m;
    }

    public static boolean MatSimm(int[][] m) {
        boolean simm = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] != m[j][i]) {
                    simm = false;
                    return simm;
                }
            }
        }
        return simm;
    }

    public static boolean MatIdentica(Gruppo g) {
        boolean id = true;
        int l = g.sequenze.size();
        boolean esiste = true;
        for (int i = 0; i < l; i++) {
            if (!esiste) {
                id = false;
                return id;
            }
            esiste = false;
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < l; j++) {
                if (j == i) {
                    row.add(1);
                } else {
                    row.add(0);
                }
            }
            for (Sequenza seq : g.sequenze) {
                if (seq.sequenza.equals(row)) {
                    esiste = true;
                }
            }
        }
        if (!esiste) {
            id = false;
            return id;
        }
        return id;
    }

}
