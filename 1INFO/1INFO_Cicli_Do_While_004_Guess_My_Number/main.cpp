#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main() {
    srand (time(NULL));  /* inizializza il randomizzatore */
    int N = rand() % 100 + 1; /* scelta del numero casuale */
    int X; // dichiarazione di X
    int T = 0; // dichiarazione di T e inizializzazione a 0
    do {
        cout << "inserisci il tuo numero : ";
        cin >> X;
        if (N>X) {
            cout << "Il mio numero è più alto...\n";
        }
        else if (N<X) {
            cout << "Il mio numero è più basso...\n";
        }
        T++;  // incremento tentativi
    }
    while (N != X);
    cout << "ci sei riuscito in " << T << " tentativi\n";
    return 0;
}
