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
    // stampa
    cout << "==========\n";
    for (int i=0;i<DIM;i++) {
        cout << numeri[i] << endl;
    }
    // stampa inversa
    cout << "==========\n";
    for (int i=DIM-1;i>=0;i--) {
        cout << numeri[i] << endl;
    }
    return 0;
}


