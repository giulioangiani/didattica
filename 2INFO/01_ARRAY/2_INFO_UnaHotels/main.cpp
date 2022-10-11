/*
Scrivere un programma C++ per risolvere il seguente problema.
Leggere i punti effettuati dalla Unahotels nelle ultime 10 gare.
SUCCESSIVAMENTE acquisire da input un numero N intero positivo (controlla l'input!)
e calcolare quante volte la Unahotels ha superato quota N nelle 10 gare.
*/

#include <iostream>

using namespace std;

const int numerogare = 10;

int main()
{
    int punti[numerogare] {0};
    for (int i=0; i<numerogare; i++) {
        cout << "Inserisci il punteggio della gara n. " << i << " :";
        cin >> punti[i];
    }
    // devo acquisire la soglia N di riferimento
    int N;
    cout << "Inserisci il valore della soglia di confronto :";
    cin >> N;
    // rileggo i valori dell'array per confrontare
    // i punteggi con la soglia di riferimento
    int conta = 0;
    for (int i=0; i<numerogare; i++) {
        if (punti[i] > N) conta++;
    }
    // stampa del risultato
    cout << "La UnaHotels ha superato quota " << N << " punti " << conta << "volte\n";

    return 0;
}
