#include <iostream>

using namespace std;

int main() {

    int num;
    int den;
    float f;
    string msg;
    cout << "Inserisci il numeratore : ";
    cin >> num;
    cout << "Inserisci il denominatore : ";
    cin >> den;

    bool valida;
    if (den == 0) {
        valida = false;
    }
    else {
        valida = true;
    }
    if (valida == true) {
        f = (float)num/den;
        msg = "Il valore della frazione è " + to_string(f);
    }
    else {
        msg = "La frazione è impossibile";
    }
    cout << msg << endl;
}
