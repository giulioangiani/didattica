/*
L'interfaccia è il "contratto" che ogni fornitore dovrà far rispettare al proprio
oggetto affinché sia vendibile

Per essere venduto un oggetto qualsiasi debba avere almeno alcune caratteristiche
- abbia un metodo per fornire un prezzo
- abbia un metodo per restituire una descrizione

 */
package interfaccewebmarket;

/**
 *
 * @author giulio
 */
public interface Vendibile {
    double getPrezzo();
    String getDescrizione();   
}
