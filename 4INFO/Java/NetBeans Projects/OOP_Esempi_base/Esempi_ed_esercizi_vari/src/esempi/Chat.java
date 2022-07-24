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
public class Chat {
    
    private static String text = "";
    
    public static void send(String s) {
        Chat.text += s + "\n";
    }

    public static String read() {
        return Chat.text;
    }

    public static void clear() {
        Chat.text = "";
    }

    /// PARTE NON STATICA

    private final String nickname;
    
    public Chat(String nickname) {
        this.nickname = nickname;
    }
    
    public void manda(String msg) {
        Chat.send("["+this.nickname + "] scrive: " + msg);
    }

    
}
