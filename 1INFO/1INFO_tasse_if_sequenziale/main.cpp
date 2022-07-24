#include <iostream>

using namespace std;

int main()
{
    int R;
    float T;

    cout << "Dammi il tuo reddito : ";
    cin >> R;

    if (R < 10000) {
        T = 0;
    }
    else if (R <= 20000) {
        // calcolo tasse solo per la parte sopra a 10000
        T = (R-10000) * 0.22;
    }
    else if (R <= 40000) {
        // calcolo tasse al 33% solo per la parte sopra a 20000
        // e al 22 per la parte 10000-20000
        T = (R-20000) * 0.33 + 10000*0.22;
    }
    else {
        // calcolo tasse al 38% solo per la parte sopra a 40000
        // al 3 per la parte 20000-40000
        // e al 22 per la parte 10000-20000
        T = (R-40000) * 0.38 + 20000*0.33 + 10000*0.22;
    }

    // se T > 50000 fisso a 50000
    if (T > 50000) {
        T = 50000;
    }

    cout << "Tasse da pagare : " << T;

}
