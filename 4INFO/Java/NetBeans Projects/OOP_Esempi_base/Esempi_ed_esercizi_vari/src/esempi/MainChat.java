/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempi;

/**
 *
 * @author giulio
 */
public class MainChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CHAT 
        
        Chat.send("ciao, come stai?");
        Chat.send("Bene, grazie!");
        System.out.println("***********************\nRisultato:\n");
        System.out.println(Chat.read());
        Chat.clear();
        
        Chat g = new Chat("anziano");
        Chat a = new Chat("muzzo");
        g.manda("Come stai?");
        a.manda("Bene, grazie!");
        System.out.println("***********************\nRisultato:\n");
        System.out.println(Chat.read());
    }
    
}
