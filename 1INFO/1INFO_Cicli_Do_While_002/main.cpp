/*
Acquisire una serie di numeri interi positivi
e stamparne la somma.
L'acquisizione si ferma quando l'utente inserisce lo 0
*/
#include <iostream>

using namespace std;

int main()
{

    int x;
    float y, z;
    x = 10;
    y = int(x);
    cout << y << endl;

    int N;
    int somma = 0;

    do {

        do {
            cout << "Inserisci un numero positivo :";
            cin >> N;
        }
        while (N<0);
        // zero devo accettarlo per
        // poter uscire dal ciclo esterno

        somma = somma + N;

    }
    while (N!=0);

    cout << "La somma è " << somma ;

    return 0;
}
