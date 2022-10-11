/*
Leggere 10 interi e
stamparli dall'ultimo al primo
*/
#include <iostream>

using namespace std;

int main()
{
    int DIM = 10;
    int numeri[DIM] {0};

    for (int i=0; i<DIM; i++) {
        cout << "Inserisci il numero in posizione " << i << ": ";
      //  int v;
      //  cin >> v;
      //  numeri[i] = v;
        cin >> numeri[i];
    }

    for (int i=0; i<DIM; i++) {
        cout << numeri[i] << endl;
    }

    for (int i=DIM-1; i>=0; i--) {
        cout << i << ") " << numeri[i] << endl;
    }

    return 0;
}
