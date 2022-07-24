package pkg4_03_arraylist;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class Main {

    public static boolean esisteArco(boolean grafo[][], int a, int b) {
        // restituisce true se esiste un arco da a => b
        // false altrimenti
        return grafo[a][b];
    }
    
    public static void creaArco(boolean grafo[][], int a, int b) {
        // crea un arco da a => b
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        boolean G[][] = null;
        
        // TODO code application logic here
        // prova a fare questa istruzione
        String line = null;

        BufferedReader br = new BufferedReader(new FileReader("grafo.csv"));
        int N = Integer.parseInt(br.readLine());
        System.out.println("N="+N);
        // definisco il grafo
        G = new boolean[N+1][N+1];
        while ((line = br.readLine()) != null) {
            System.out.println(">> " + line);
            String[] nodi = line.split(",");
            int nodopartenza = Integer.parseInt(nodi[0]);
            int nodoarrivo = Integer.parseInt(nodi[1]);
            G[nodopartenza][nodoarrivo] = true;
        }

        for (boolean[] r : G) {
            for (boolean c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        
        System.out.println("1:3 " + esisteArco(G,1,3));
        System.out.println("1:6 " + esisteArco(G,1,6));
        
        
    }
    
}
