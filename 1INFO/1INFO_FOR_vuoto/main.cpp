#include <iostream>

using namespace std;

int main() {

    int N;
    cout << "Inserisci N: ";
    cin >> N; // acquisisco la numerosità
    for (int i=0; i<N; i=i+2) {
        cout << i << endl;
    }
    return 0;
}
