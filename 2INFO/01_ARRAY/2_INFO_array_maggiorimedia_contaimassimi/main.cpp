/*
Leggere 5 numeri interi e stampiamo:
- il numero di quelli superiori alla media
- quanti sono uguali al massimo

es input:
4 5 7 6 2
es output
3
1

es input:
8 8 3 4 2
es output
2
2


*/

#include <iostream>

using namespace std;
const int DIM = 5;
int main()
{

    int numeri[DIM] {0};
    int somma = 0;
    int massimo;
    for (int i=0; i<DIM; i++) {
        cout << "Inserisci il numero in posizione " << i << ": ";
        cin >> numeri[i];
        // aggiungo il numero inserito alla somma
        // per calcolare successivamente la media
        somma = somma + numeri[i];

        // algoritmo del massimo in una sequenza
        if ((i==0) or (numeri[i] > massimo))
             massimo = numeri[i];

    }
    // calcolo la media. Ricordarsi di mettere a float la somma!
    float media = float(somma)/DIM;
    // rileggo array per vedere quanti sono maggiori della media
    int maggiori_media = 0;
    int uguali_al_massimo = 0;
    for (int i=0; i<DIM; i++) {
        if (numeri[i]>media) maggiori_media++;
        if (numeri[i] == massimo) uguali_al_massimo++;
    }

    cout << "Maggiori della media : " << maggiori_media << endl;
    cout << "Uguali al massimo : " << uguali_al_massimo << endl;

    return 0;
}
