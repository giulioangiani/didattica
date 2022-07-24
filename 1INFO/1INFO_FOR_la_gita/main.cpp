#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int A,B,N,bestjourney,tempoperso,min_tempoperso;
    double distanza, max_distanza;
    cout << "Inserisci N: ";
    cin >> N; // acquisisco la numerosità
    for (int i=1; i<=N; i++) {
        cin >> A >> B;
        tempoperso = A+B;
        distanza = sqrt(A*A+B*B);
        if (i==0) {
            bestjourney = i;
            max_distanza = distanza;
            min_tempoperso = tempoperso;
        }
        else {
            if (
                    (tempoperso < min_tempoperso)
                        or
                    ((tempoperso == min_tempoperso) && (distanza>max_distanza))
            ) {
                bestjourney = i;
                max_distanza = distanza;
                min_tempoperso = tempoperso;
            }
        }
    }
    cout << bestjourney << endl;
    return 0;
}
