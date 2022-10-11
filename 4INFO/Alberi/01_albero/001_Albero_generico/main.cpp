/*
 * Albero binario generico - struttura figlio->fratelli
 *
 * */
#include <iostream>
#include <list>

using namespace std;

struct nodo {
    int content;
    nodo* figlio;
    list<nodo*> fratelli;
};

typedef nodo* node_ptr;

node_ptr root;

void visita(node_ptr p) {
    if (!p) return;
    cout << p->content << "\n";
    visita(p->figlio);
    for (auto f: p->fratelli) {
        visita(f);
    }
}

int main()
{
    // fill tree values
    root = new nodo();
    root->content = 1;

    node_ptr f1 = new nodo();
    node_ptr f2 = new nodo();
    node_ptr f3 = new nodo();
    node_ptr f4 = new nodo();

    root->figlio = f1;

    f1->content = 11;
    f2->content = 12;
    f3->content = 13;
    f4->content = 14;
    f1->fratelli.push_back(f2);
    f1->fratelli.push_back(f3);
    f1->fratelli.push_back(f4);

    // secondo livello
    node_ptr f11 = new nodo();
    node_ptr f12 = new nodo();
    node_ptr f21 = new nodo();
    f11->content = 101;
    f12->content = 102;
    f21->content = 201;
    f1->figlio = f11;
    f11->fratelli.push_back(f12);
    f2->figlio = f12;


	visita(root);

    return 0;
}

