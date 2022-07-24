#include <iostream>


/*

La Prof.ssa Manini vuole confrontare il costo della stessa spesa
effettuata in due supermercati diversi.


Nel primo se la spesa supera i 100 euro viene fatto
uno sconto del 3% sul totale;
nel secondo se la spesa supera i 100 euro viene applicato
uno sconto del 10% sulla parte di spesa che supera i 100 euro.

Acquisire la spesa S effettuata e calcolare la spesa finale
e lo sconto nei due supermercati e
visualizzare quale supermercato risulta più conveniente e
la relativa spesa finale e sconto.
(considerare anche il caso di uguaglianza)

*/

using namespace std;

int main() {

    float sconto_sup_1, sconto_sup_2;
    string sup_conveniente = "";
    float spesa;
    float spesa_pagata;

    cout << "Quanto vuoi spendere ? \n";
    cin >> spesa;

    if (spesa > 100) {
        // calcolo sconto nel primo e nel secondo
        sconto_sup_1 = spesa * 0.03;
        sconto_sup_2 = (spesa - 100) * 0.10;
    }
    else {
        // nessuno sconto in nessuno dei due
        sconto_sup_1 = 0;
        sconto_sup_2 = 0;
    }

    if (sconto_sup_1 == sconto_sup_2) {
        sup_conveniente = "UGUALE";
        spesa_pagata = spesa;
    }
    else {
        if (sconto_sup_1 > sconto_sup_2) {
            sup_conveniente = "Primo";
            spesa_pagata = spesa - sconto_sup_1;
        }
        else {
            sup_conveniente = "Secondo";
            spesa_pagata = spesa - sconto_sup_2;
        }
    }

    cout << "Il più conveniente è " << sup_conveniente << endl;
    cout << "Il totale pagato è " << spesa_pagata << endl;

}
