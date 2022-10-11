#include<bits/stdc++.h>
using namespace std;

// grezzo

vector<vector<int>> permutazioni(vector<int> v) {
    if (v.size() == 1) return { {v[0]} };
    else {
        vector<vector<int>> result;
        for (int pos=0; pos<v.size(); pos++) {
            int elem = v[pos];
            v.erase(v.begin() + pos);
            auto subresult = permutazioni(v);
            for (auto x: subresult) {
                vector<int> tmp = {elem};
                for (auto elemento_subresult: x) {
                    tmp.push_back(elemento_subresult);
                }
                result.push_back(tmp);
            }
            v.insert(v.begin() + pos, elem);
        }
        return result;
    }

}

void usaperm(vector<int> p) {
    for (auto elem : p) {
        cout << elem << " ";
    }
    cout << endl;
}

void stampasol(list<int> p) {
    for (auto elem : p) {
        cout << elem << " ";
    }
    cout << endl;
}

//vector<vector<int>> permutazioni_brutto(vector<int> v) {
void permutazioni_brutto(vector<int> v) {
    vector<vector<int>> result;
    int s = v.size();
    set<int> tmp;
    for (int a:v) {
        for (int b:v) {
            for (int c:v) {
                for (int d:v) {
                    for (int e:v) {
                        for (int f:v) {
                            for (int g:v) {
                                tmp = {a,b,c,d,e,f,g};
                                if (tmp.size() == s)
                                    //result.push_back({a,b,c,d,e,f,g});
                                    usaperm({a,b,c,d,e,f,g});
                            }
                        }
                    }
                }
            }
        }
    }
    //return result;
}

void permutazioni_brutto_brutto(int v[], int N) {
    set<int> tmp;
    for (int a=0; a<N; a++) {
        for (int b=0; b<N; b++) {
            for (int c=0; c<N; c++) {
                for (int d=0; d<N; d++) {
                    tmp = {a,b,c,d};
                    if (tmp.size() == N)
                        //result.push_back({a,b,c,d,e,f,g});
                        usaperm({v[a],v[b],v[c],v[d]});
                }
            }
        }
    }
}
    //return result;

void stampaV(int a[], int N) {
//    for (int i=0; i<N; i++) cout << a[i] << " ";
//    cout << endl;
}

vector<list<int>> permutaVet(int a[], int N) {
    if (N == 1) {
        return { {a[0]} };  // solo un valore
    }
    if (N == 2) {
        return { {a[0], a[1]}, {a[1], a[0]} };  // solo due possibilita
    }
    // N > 2
    vector<list<int>> result;
    for (int i=0; i<N; i++) {
//        cout << "Calcolo i=" << i << endl;
        // le permutazioni sono
        // l'elemento 0 + tutte le permutazioni degli altri
        // l'elemento 1 + tutte le permutazioni degli altri
        // ...
        // l'elemento N-1 + tutte le permutazioni degli altri
        // ma devo fare in modo di non confondere il primo coi restanti...

        // scambio elemento in pos i con quello in pos N-1 (nel primo caso è lo stesso...)
        stampaV(a, N);

        auto tmp = a[N-1];
        a[N-1] = a[i];
        a[i] = tmp;

        stampaV(a, N);

        // recupero tutte le permutazioni dalla chiamata ricorsiva
        auto r = permutaVet(a, N-1);

        // per ogni permutazione di result, ne creo una con inizio a[N-1]
        for (auto soluzione : r) {
            // sono list<int>
            //for (auto elem : soluzione)
            //cout << elem << " ";
            //cout << endl;
            soluzione.push_back(a[N-1]);
            result.push_back(soluzione);

        }

        // ritorno alla posizione precedente
        tmp = a[N-1];
        a[N-1] = a[i];
        a[i] = tmp;
        stampaV(a, N);

    }
    return result;
}

int occorrenze(char v[], int dimensione, char c) {
    if (dimensione == 0) return 0;
    int occ = 0;
    if (c == v[dimensione - 1]) occ = 1;
    return occ + occorrenze(v, dimensione-1, c);
}

int main()
{
//    auto r = permutazioni({1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
//    auto r = permutazioni({1, 2, 3, 4, 5, 6, 7, 8, 9});
//     permutazioni_brutto({1, 2, 3, 4, 5, 6, 7});
//    for (auto x: r) usaperm(x);

    char arr[] {'A', 'B', 'A', 'D', 'A'};
    int N = 5;
    char c = 'T';
    cout << c << " presente " << occorrenze(arr, N, c) << " volte\n";

    return 0;

    int V[] {1,2,3,4,5,6,7,8,9,0};
    permutazioni_brutto_brutto(V, 4);

    return 0;
    auto r = permutaVet(V, 5);
    for (auto soluzione : r) {
         for (auto elem : soluzione) cout << elem << " ";
         cout << endl;
    }
    return 0;
}
