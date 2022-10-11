#include <iostream>
using namespace std;
int main()
{
    int N = 5; int somma = 0;  int v1, v2, v3, v4, v5;
    cout << "Inserisci il voto 1 "; cin >> v1;
    cout << "Inserisci il voto 2 "; cin >> v2;
    cout << "Inserisci il voto 3 "; cin >> v3;
    cout << "Inserisci il voto 4 "; cin >> v4;
    cout << "Inserisci il voto 5 "; cin >> v5;
    somma = v1+v2+v3+v4+v5;
    float media = float(somma)/N;
    int conta_superiori_alla_media = 0;
    if (v1 > media) conta_superiori_alla_media++;
    if (v2 > media) conta_superiori_alla_media++;
    if (v3 > media) conta_superiori_alla_media++;
    if (v4 > media) conta_superiori_alla_media++;
    if (v5 > media) conta_superiori_alla_media++;
    cout << "Ci sono " << conta_superiori_alla_media
        << " voti superiori alla media";
    return 0;
}

