#include <iostream>
using namespace std;
int main() {
    int A[10];
    A[0] = 1;
    cout << A[0] << endl;

    int B[5] {1,2,3,4,5};
    for (int i=0; i<5; i++) {
        cout << B[i] << endl;
    }

    int vet[10] {0};
    for (int i=0; i<10; i++) {
        cout << vet[i] << endl;
    }
    cout << "size of vet " << sizeof(vet) << endl;


    char lettere[] {'a', 'b', 'z', 'x'};
    for (int i=0; i<10; i++) {
        cout << lettere[i] << endl;
    }
    cout << "size of lettere " << sizeof(lettere) << endl;

    float numeri[] {2.3, 2, 0};
    for (int i=0; i<10; i++) {
        cout << numeri[i] << endl;
    }
    cout << "size of numeri " << sizeof(numeri) << endl;

    const int DIM = 20;
    cout << "===========\n";
    cout << numeri[5] << endl;

    return 0;
}
