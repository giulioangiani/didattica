/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author giulio
 */
public class ClienteNonTrovatoException extends Exception {

    public ClienteNonTrovatoException() {
        super("Cliente non trovato!");
    }
    
}
