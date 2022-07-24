/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericomplessi;

/**
 *
 * @author giulio
 */
public class NumeriComplessi {

    
    public static void stampaComplessi(Complex c ) {
        System.out.println("Parte reale: " + c.re());
        System.out.println("Parte immaginaria: " + c.im());
    }
    
    public static void stampaLimiti(Funzione n ) {
        System.out.println("Limite : " + n.limite());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Complex c1 = new CartesianComplex();
        FunzioneComplessa c2 = new FunzioneComplessa();
        
        stampaComplessi(c1);
        stampaComplessi(c2);
        
        //stampaLimiti(c1);
        stampaLimiti(c2);
        
        
    }
    
}
