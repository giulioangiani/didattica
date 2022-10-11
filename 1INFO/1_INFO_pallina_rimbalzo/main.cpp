/*
Scrivere un programma che calcoli il numero di rimbalzi di una pallina di gomma che
ogni volta che rimbalza ha una altezza pari all’80% della precedente. La pallina si
arresta quando raggiunge altezza pari a 0.01 cm. Realizzare sia il DAB che la codifica
del programma (quest’ultima a casa)
*/

#include <iostream>

using namespace std;

int main()
{
    float altezza;
    cout << "dammi altezza iniziale : ";
    cin >> altezza;

    int rimbalzi = 0;
    while (altezza > 0.01) {
        rimbalzi++;
        altezza = altezza*0.8;
        cout << " ==> sono a " << altezza << " cm da terra...." << endl;
    }
    cout << "rimbalzi : " << rimbalzi << endl;

    return 0;
}
