/*
Acquisire base e altezza strettamente
positivi di un rettangolo e calcolarne l'area
*/
#include <iostream>

using namespace std;

int main()
{
    float base, altezza, area;

    do{
        cout << "Inserisci base (base > 0): ";
        cin >> base;
    }
    while (base <= 0);

    do{
        cout << "Inserisci altezza (altezza > 0): ";
        cin >> altezza;
    }
    while (altezza <= 0);

    area = base*altezza;
    cout << "Area = " << area;


    return 0;
}
