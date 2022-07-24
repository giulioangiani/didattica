/*
Acquisire una serie di numeri interi positivi
e stampare la somma dei pari al termine del programma.
L'acquisizione si ferma quando la somma supera 100
*/

#include <iostream>

using namespace std;

int main()
{
    int somma = 0;
    int N;
    do {
        // per controllare la fine
        // del programma

        do {
            // per controllare l'input
            cout << "Inserisci il numero :";
            cin >> N;

            if (N<=0) {
                cout << "Il numero non è valido! Deve essere positivo\n";
            }

        }
        while (N <= 0);

        if (N%2==0) {
            somma = somma + N;
        }
        else {
            cout << "Il numero è dispari, viene scartato\n";
        }
    }
    while (somma <= 100);
    cout << "La somma è " << somma << endl;

    return 0;
}
