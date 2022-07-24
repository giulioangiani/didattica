package pkg00.thread.elaborastringa;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giulio Angiani (IIS Pascal - Reggio Emilia)
 */
public class ElaboratoreThread extends Thread {
    
    private String s;
    private String maiuscola;
    private PrintStream o;
    
    public static int actives = 0;

    ElaboratoreThread(PrintStream out) {
        this.o = out;
    }
    
    private void elabora_1() {
        this.maiuscola = this.s.toUpperCase();
    }
    
    private void elabora_2(int delay) {
        
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        this.maiuscola = this.s.toUpperCase();
    }


    public void run(){
        actives++;
        o.println("\nFROM " + this.getName() + " << ATTIVI: " + actives);
        int delay = (int)(Math.random()*2000)+3000;
        //elabora_1();        // elabora_1 non ha delay 
        elabora_2(delay);   // elabora_2 simula un delay di calcolo (tipo web server...)
        yield();
        o.println("\nFROM " + this.getName() + " << " + this.maiuscola + " (in " + delay + " milliseconds )");
        actives--;
        o.println("\nFROM " + this.getName() + " << ATTIVI: " + actives);
    }

    public String getElaborata() {
        return maiuscola;
    }

    public void setS(String s) {
        this.s = s;
        this.maiuscola = "";
    }


}
