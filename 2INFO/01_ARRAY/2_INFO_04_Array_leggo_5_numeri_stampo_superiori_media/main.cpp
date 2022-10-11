#include <iostream>
using namespace std;
int main() {
    const int DIM = 5;
    int numeri[DIM];
    // acquisizione
    for (int i=0;i<DIM;i++) {
        cout << "Dammi il " << i << "° numero : ";
        cin >> numeri[i];
    }
    // calcolo la media
    // (potevo farlo anche nel ciclo precedente...)
    int somma = 0;
    for (int i=0;i<DIM;i++) {
        somma += numeri[i];
    }
    float media = (float)somma/DIM;
    cout << "Media : " << media << endl;
    // stampa superiori alla media
    for (int i=0;i<DIM;i++) {
        if (numeri[i] > media) cout << numeri[i] << endl;
    }
    return 0;
}


