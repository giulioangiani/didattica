/*
    Indovina il numero
*/

#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;

int main()
{
    srand((unsigned) time(NULL)); // attiva il generatore casuale

    int disponibilita = 100;    // disponibilità iniziale del giocatore
    int scommessa;
    char tipo_scommessa;    // B per numeri bassi, A per numeri alti, 7 per il numero 7

    do {
        cout << "In questo momento hai " << disponibilita << " monete " << endl;
        // acquisisco la nuova scommessa
        cout << "Quanto vuoi scommettere ? (0 per uscire): ";
        cin >> scommessa;

        // controllo scommessa <= disponibilita
        if (scommessa > disponibilita) {
            cout << "Non puoi scommettere più di quanto hai ! " << endl;
        }
        else if (scommessa == 0) {
            cout << "Esci dal gioco...  " << endl;
        }
        else {
            cout << "Inserisci B per scommettere sui numeri da 2 a 6\n";
            cout << "Inserisci A per scommettere sui numeri da 8 a 12\n";
            cout << "Inserisci 7 per scommettere sul numero 7\n";

            cout << "Su cosa vuoi scommettere ? ";
            cin >> tipo_scommessa;

            // estraggo i numeri
            int dado1 = rand() % 6 + 1;
            int dado2 = rand() % 6 + 1;
            int totale = dado1+dado2;

            cout << ">>>> E' uscito il numero " << totale << endl;

            // controllo il risultato
            if ((totale < 7) and (tipo_scommessa == 'B')) {
                // hai vinto la manche
                cout << "Hai vinto !\n";
                disponibilita = disponibilita + scommessa;
            }
            else if ((totale > 7) and (tipo_scommessa == 'A')) {
                // hai vinto la manche
                cout << "Hai vinto !\n";
                disponibilita = disponibilita + scommessa;
            }
            else if ((totale == 7) and (tipo_scommessa == '7')) {
                // hai vinto la manche - doppio valore
                cout << "Hai vinto !\n";
                disponibilita = disponibilita + scommessa*2;
            }
            else {
                // hai perso
                cout << "Hai perso !\n";
                disponibilita = disponibilita - scommessa;
            }
        }
    }
    while ((disponibilita > 0) and (scommessa > 0));

    cout << "Hai finito di giocare. Ti sono rimaste " << disponibilita << " monete " << endl;
    return 0;
}
