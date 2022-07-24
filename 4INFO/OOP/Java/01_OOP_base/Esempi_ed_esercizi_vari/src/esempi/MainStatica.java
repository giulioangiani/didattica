/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempi;

import java.util.ArrayList;

/**
 *
 * @author giulio
 */
public class MainStatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Statica s = new Statica();
        SuperStatica ss = new SuperStatica();
        System.out.println(s.successivo(0));
        System.out.println(ss.successivo(0));
        
        ArrayList<Statica> ass = new ArrayList<Statica>();
        ass.add(s);
        ass.add(ss);
        for (Statica x : ass) {
            System.out.println(((Statica)x).successivo(0));
        }
        
        
    }
    
}
