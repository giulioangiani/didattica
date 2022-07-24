#include <iostream>

using namespace std;

int grafo[9][9] { // 0  1  2  3  4  5  6  7  8
                    {0, 1, 1, 0, 1, 0, 0, 0, 0}, // nodo 0
                    {0, 0, 0, 1, 0, 0, 0, 0, 0}, // nodo 1
                    {0, 0, 0, 1, 0, 1, 0, 0, 0}, // nodo 2
                    {0, 0, 0, 0, 1, 1, 0, 0, 0}, // nodo 3
                    {0, 0, 0, 0, 0, 0, 1, 0, 0}, // nodo 4
                    {0, 0, 0, 0, 0, 0, 0, 1, 1}, // nodo 5
                    {0, 0, 0, 0, 0, 0, 0, 1, 0}, // nodo 6
                    {0, 0, 0, 0, 0, 0, 0, 0, 1}, // nodo 7
                    {0, 0, 0, 0, 0, 0, 0, 0, 0}, // nodo 8
                };

bool esisteArco(int s, int d) {
    return (grafo[s][d] == 1);
//    if (grafo[s][d] == 1) return true;
//    else return false;
}

bool esisteCammino(int s, int d) {
    cout << "prova da " << s << " => " << d << endl;
    if (esisteArco(s, d)) return true;
    bool result = false;
    for (int x = 0; x < 9 ; x++) {
        if (esisteArco(s, x)) {
            if (esisteCammino(x, d)) result = true;
        }
    }
    return result;
}

int main()
{
    cout << "Arco 1->3 " << esisteArco(1, 3) << endl;
    cout << "Arco 3->1 " << esisteArco(3, 1) << endl;
    cout << "Cammino 3->1 " << esisteCammino(3, 1) << endl;
    cout << "Cammino 0->2 " << esisteCammino(0, 2) << endl;
    cout << "Cammino 0->8 " << esisteCammino(0, 8) << endl;
    cout << "Cammino 6->0 " << esisteCammino(6, 0) << endl;
    cout << "Cammino 2->6 " << esisteCammino(2, 6) << endl;


    return 0;
}
