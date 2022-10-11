#include <iostream>

using namespace std;

int main() {
    char ch;
    cin >> ch;
    switch (ch) {
        case 'A':
            cout << "Hai inserito A\n";
            break;

        case 'B':
            cout << "Hai inserito B\n";
            break;

        default:
            cout << "Non hai inserito né A né B\n";
    };

    int v;
    cout << "dammi il tuo voto : "; cin >> v;
    switch (v) {
        case 9:
            cout << "Ottimo\n";
            break;

        case 8:
            cout << "Buono\n";
            break;

        case 7:
            cout << "Discreto\n";
            break;

        case 6:
            cout << "Suff\n";
            break;

        default:
            cout << "Potevi fare meglio\n";
    };

    return 0;
}
