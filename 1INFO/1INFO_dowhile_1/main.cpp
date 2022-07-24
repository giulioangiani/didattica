#include <iostream>
using namespace std;
int main() {

    float prezzo_intero;
    do {
        cout << "Inserisci il prezzo del biglietto : ";
        cin >> prezzo_intero;
        if (prezzo_intero <= 0)  {
            cout << "Il valore inserito non è valido. Riprova\n";
        }
    }
    while (prezzo_intero<=0);

    char sex;
    do {
        cout << "Inserisci il sesso dell'acquirente (M/F) : ";
        cin >> sex;
    }
    while (sex != 'M' && sex != 'F');

    float prezzo_biglietto = prezzo_intero;
    if (sex == 'F') prezzo_biglietto = prezzo_biglietto*0.8;
    cout << "Prezzo da pagare : " << prezzo_biglietto << endl;
}


