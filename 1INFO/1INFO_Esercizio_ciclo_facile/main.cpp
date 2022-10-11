#include <iostream>

using namespace std;

int main()
{
    int N = 20;
    int somma = 0;
    int v;
    for (int i = 0; i<N; i++) {
        cout << "Inserisci il voto n. " << i << " : ";
        cin >> v;
        somma += v;
    }
    float media = float(somma)/N;
    cout << "La media è " << media << endl;
    return 0;
}


