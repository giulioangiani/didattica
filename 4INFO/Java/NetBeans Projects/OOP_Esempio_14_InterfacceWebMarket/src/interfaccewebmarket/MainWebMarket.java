/*
Si vuole progettare un sistema per la vendita on line di prodotti qualsiasi

Il sistema dovrà funzionare con prodotti diversi forniti da fornitori diversi
che hanno i loro propri sistemi informativi 

Come affrontare questo problema?
Bisogna prevedere delle classi che possano interagire con oggetti di tipo diverso
ma che devono rispettare almeno alcune regole di funzionamento
Queste "regole" sono proprio quelle che in Java vengono definite "interfacce"

Assumiamo che per essere venduto un oggetto qualsiasi debba avere almeno alcune 
caratteristiche, ovvero debba essere "vendibile"
- abbia un metodo per fornire un prezzo
- abbia un metodo per restituire una descrizione

La prima cosa che si può fare è proprio definire l'interfaccia di ogni oggetto
verso il nostro sistema.
L'interfaccia è il "contratto" che ogni fornitore dovrà far rispettare al proprio
oggetto affinché sia vendibile

*/
package interfaccewebmarket;

import negozio.Penna;
import negozio.Quaderno;
import negozio.*;

public class MainWebMarket {

    public static void main(String[ ] args) {
        Venditore v = new Venditore("Marco");
        Penna p = new Penna();
        Quaderno q = new Quaderno();
        v.vendi(p);
        v.vendi(q);
        
        MouseNuovo mn = new MouseNuovo("MS", "Nuovo mouse bello", 100);
        v.vendi(mn);
        
        // istruzioni di acquisto prodotti
        Acquirente a = new Acquirente();
        a.acquista(p, 10);
        a.acquista(q, 5);
        
        Monitor m = new Monitor("MN001", "Monitor HP", 125.00);
        a.acquista(m, 7);
        Monitor m2 = new Monitor("MN002", "Monitor ACER", 185.50);
        a.acquista(m2, 15);
        
        a.acquista(mn, 5);  // errore Run Time perché il metodo "getQuantitaMinima" di MouseNuovo non è implementato
        
        
    }
    
}
