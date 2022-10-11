/*
Si vuole calcolare i reddito di al massimo 20 persone.
Acquisire il reddito di ognuno e stampare quanti hanno un reddito maggiore della media.
L’acquisizione finisce se l’utente inserisce 20 valori oppure termina con il valore -1
*/

#include <iostream>
using namespace std;
int main() {
    double redditi[20] {0};     // definizione fisica MASSIMA
    int valori_validi = 0;		// servirà per la dimensione logica
    while (valori_validi < 20) {
        double reddito;
        cout << "Inserisci il reddito o termina con -1\n";
        cin >> reddito;
        if (reddito == -1) break;   // per uscire prima dal ciclo
        redditi[valori_validi]=reddito;
        valori_validi++;
    }
    cout << "Hai inserito " << valori_validi << " valori_validi" << endl;
    // devo calcolare la media usando solo i primi valori_validi valori
    double somma = 0;
    for (int i=0; i<valori_validi; i++) somma += redditi[i];
    double media = somma/valori_validi;
    for (int i=0; i<valori_validi; i++) {
         if (redditi[i] > media) cout << redditi[i] << endl;
    }
    return 0;
}


