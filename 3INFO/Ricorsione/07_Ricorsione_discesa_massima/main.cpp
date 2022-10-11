#include <iostream>
#include <stdlib.h>

using namespace std;

const int dimensione = 4;

int discesa(int M[][dimensione], int riga, int colonna) {
    if (riga == dimensione-1) {
        return M[riga][colonna];
    }
    else {
        return M[riga][colonna] + max(discesa(M, riga+1, colonna), discesa(M, riga+1, colonna+1));
    }
}

int main()
{

    int M[][dimensione] = { {1, 0, 0, 0}, {2, 9, 0, 0}, {3, 7, 5, 0}, {8, 4, 11, 6} };
    int d = discesa(M, 0, 0); // partenza
    cout << "discesa = " << d << endl;

    return 0;
}

