#include <iostream>

using namespace std;

int mosse = 0;

void hanoi(char palo_da, char palo_a, char palo_appoggio, int dischi) {
    mosse++;
    if (dischi == 1) {
        cout << palo_da << " " << palo_a << endl;
    //    cout << "muovi da " << palo_da << " a " << palo_a << endl;
    }
    else {
        hanoi(palo_da, palo_appoggio, palo_a, dischi-1);
        //cout << "muovi da " << palo_da << " a " << palo_a << endl;
        cout << palo_da << " " << palo_a << endl;
        hanoi(palo_appoggio, palo_a, palo_da, dischi-1);
    }
}

int main() {
    int d;
    cin >> d;
    hanoi('1', '3', '2', d);
}
