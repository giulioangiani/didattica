/* acquisire una serie di numeri interi
e stampare la media dei pari
Sequenza termina quando utente inserisce 0
*/
#include <iostream>

using namespace std;

int main()
{
    int contanumeripari = 0;
    int sommapari = 0;
    int N;
    float mediapari;

    do {
        cin >> N;
        if (N%2 == 0) {
            sommapari = sommapari + N;
            contanumeripari++;
        }
    }
    while (N!=0);

    mediapari = sommapari/contanumeripari;
    cout << "La media è " << mediapari << endl;

    return 0;
}

