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
public class OrdiniNonPresentiException extends Exception {
    public OrdiniNonPresentiException() {
        super("Ordini non trovati");
    }
}
