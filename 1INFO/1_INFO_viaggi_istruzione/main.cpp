/*
Dopo aver acquisito il numero N di viaggi di istruzione previsti dal Pascal per l'anno scolastico 2022/2023 (N non può essere minore di 0)
si acquisisca il numero di persone previste per ogni viaggio (maggiore di 0 e minore di 50) ed il costo a persona per ognuno dei viaggi (maggiore di 0 e minore di 200)

Al termine dell'inserimento si stampi nell'ordine:
- la media dei costi dei viaggi per persona
- il numero di viaggi che costano più di 100 euro a persona
- il costo del viaggio più costoso (calcolato come prodotto fra numero di persone partecipanti e il costo a persona)
*/

#include <iostream>

using namespace std;

int main()
{
    int N;
    float sommacosti = 0;
    int viaggi_costosi = 0;
    float viaggio_piu_costoso = 0;

    // controllo input su numero viaggi > 0
    do {
        cout << "Numero di viaggi: ";
        cin >> N;
    }
    while (N<=0);

    // per ogni viaggio acquisico persone e costo
    for (int i=0; i<N; i++) {
        // controllo input su costo viaggi > 0
        float costo_viaggio;
        do {
            cout << "Costo del viaggio " << i+1 << "-esimo : ";
            cin >> costo_viaggio;
        }
        while (costo_viaggio<=0);

        if (costo_viaggio > 100) viaggi_costosi++;

        // aggiungo alla somma complessiva per persona
        sommacosti += costo_viaggio;


        // controllo input su numero persone per viaggio > 0
        int persone;
        do {
            cout << "Persone del viaggio " << i+1 << "-esimo : ";
            cin >> persone;
        }
        while (persone<=0 || persone>=50);

        // calcolo il costo del viaggio
        float costo_complessivo_viaggio = costo_viaggio*persone;
        if (costo_complessivo_viaggio>viaggio_piu_costoso) {
            viaggio_piu_costoso = costo_complessivo_viaggio;
        }

    }

    cout << "media dei costi dei viaggi per persona: " << sommacosti/N << endl;
    cout << "numero di viaggi che costano più di 100 euro a persona: " << viaggi_costosi << endl;;
    cout << "il viaggio più costoso costa: " << viaggio_piu_costoso << endl;


    return 0;
}
