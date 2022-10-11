/*
Acquisire un numero N positivo e poi una sequanza di N caratteri
Verificare se la sequenza è palindroma o no
*/

#include <iostream>

using namespace std;

int main()
{
    int N;
    do {
        cout << "Inserisci il numero di caratteri (maggiore di 0 ) :";
        cin >> N;
    }
    while (N<=0);
    // definisco l'array della dimensione corretta
    char lettere[N];
    // effettuo il ciclo di acquisizione dei caratteri
    for (int i=0; i<N; i++) {
        cout << "Inserisci il carattere n. " << i+1 << " : ";
        cin >> lettere[i];
    }
    // effettuo il ciclo di lettura
    // confrontando il primo con l'ultimo,      pos: 0 >> N-1
    // il secondo col penultimo                 pos: 1 >> N-2
    // in generale quello in posizione i        pos: i >> N-(i+1)
    bool palindroma = true;
    // assumo che la sequanza sia palindroma....
    for (int i=0; i<N/2; i++) { // posso fermarmi a metà...
        if (lettere[i] != lettere[N-(i+1)])  {
            // al primo carattere che trovo che non corrisponde
            // metto a false la variabile di risposta
            palindroma = false;
        }
    }
    // stampo la risposta
    if (palindroma)
        cout << "La sequenza è palindroma\n";
    else
        cout << "La sequenza NON è palindroma\n";

    return 0;
}






