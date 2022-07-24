/*
TESTO DELL'ESERCIZIO

E' fornita la classe Musicista con i suoi metodi.
Uno di questi, il metodo "suona" permette ad un musicista di suonare qualunque cosa sia Suonabile.

Suonabile è definita come interfaccia con il metodo "emettisuono" nel package interfaces

A partire dal main fornito, si implementino tutte le classi necessarie 
considerando che al termine del lavoro, quando il codice sarà funzionante,
si dovrà
    creare la classe Tamburo
    poter decommentare la riga 49 "m.suona(tamburo);" SENZA modificare NULLA del package "artisti"

*/

package musicamaestro;

import java.util.ArrayList;
import strumenti.*;
import artisti.*;
/**
 *
 * @author Giulio Angiani 
 */
public class MusicaMaestro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // progettare classi e interfacce necessarie per
        // rendere funzionante il codice sottostante
        // 
        ArrayList<Musicista> orchestra = new ArrayList<>();
        Violinista v = new Violinista("Uto", "Ughi");
        Pianista p = new Pianista("Giovanni", "Allevi");
        orchestra.add(v);
        orchestra.add(p);
        Viola viola = new Viola();
        Violino violino = new Violino();
        Pianoforte piano = new Pianoforte();
        Tamburo tamburo = new Tamburo();
        for (Musicista m : orchestra) {
            System.out.println(m);
            m.suona(viola);
            m.suona(violino);
            m.suona(piano);
//            m.suona(tamburo);
        }
    }
    
}
