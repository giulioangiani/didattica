package pkg00.thread.elaborastringa;

import java.util.Scanner;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class ThreadElaborastringa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.print(">> ");
            String s = scanner.nextLine();
            if (s.equals("quit")) break;
            // System.out.println("Letto : " + s);
            i++;
            ElaboratoreThread e = new ElaboratoreThread(System.out);
            e.setName("T"+i);
            e.setS(s);
            e.start();
            //System.out.println("Attivi : " + ElaboratoreThread.actives);
            //e.join();
        }
    }
    
}
