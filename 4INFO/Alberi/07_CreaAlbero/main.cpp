#include <bits/stdc++.h>
#include <queue>
using namespace std;

struct nodo {
    int content;
    nodo* dx;
    nodo* sx;
};

typedef nodo* node_ptr;
node_ptr root;
node_ptr root_sbilanciato;

// prototipi
int deep(node_ptr p);
bool isBilanciato(node_ptr p);
node_ptr insBilanciato(node_ptr& p, int val);
node_ptr insSbilanciato(node_ptr& p, int val);
void postorder(node_ptr p);
void preorder(node_ptr p);
void inorder(node_ptr p);
void ampiezza(node_ptr p);
list<int> ampiezza2(node_ptr p);
list<pair<int, int>> ampiezza_livello(node_ptr p);


int contanodi(node_ptr p);
int contafoglie(node_ptr p);
bool isPerfettamenteBilanciato(node_ptr p);
void inserisciBilanciato(node_ptr& p, int val);

using namespace std;

int main() {
    // test void inserisciBilanciato(node_ptr& p, int val)
    for (auto v : {5, 7, 8, 9, 11, 15, 25, 19})
        inserisciBilanciato(root, v);
    preorder(root); cout << endl;
    postorder(root); cout << endl;
    inorder(root); cout << endl;
    ampiezza(root);  cout << endl;
    list<int> nodi = ampiezza2(root);
    for (int x: nodi) cout << x << " "; cout << endl;
    list<pair<int, int>> nodilivello = ampiezza_livello(root);
    for (auto x: nodilivello) cout << "Liv" << x.second << " - " << x.first << endl;

    return 0;

    node_ptr r2 = NULL;
    for (auto v : {5, 7, 8, 9, 11, 15, 25, 19})
        r2 = insBilanciato(r2, v);
    preorder(r2); cout << endl;
    inorder(r2);  cout << endl;
    postorder(r2); cout << endl;

    return 0;
    cout << "bilanciato (1):" << isBilanciato(root) << endl;
    cout << "bilanciato (2):" << isBilanciato(root_sbilanciato) << endl;
    cout << "nodi (1):" << contanodi(root) << endl;
    cout << "foglie (1):" << contafoglie(root) << endl;

    return 0;
}

list<pair<int, int>> ampiezza_livello(node_ptr p) {
    list<pair<int, int>> result;
    queue<pair<node_ptr, int>> q; // coda di coppie puntatore/livello
    q.push({p, 1});
    while(!q.empty()) {
        auto tmp = q.front();
        q.pop();
        if (tmp.first == NULL) continue;
        result.push_back({tmp.first->content, tmp.second});
        q.push({tmp.first->sx, tmp.second+1});
        q.push({tmp.first->dx, tmp.second+1});
    }
    return result;
}

list<int> ampiezza2(node_ptr p) {
    list<int> result;
    queue<node_ptr> q;
    q.push(p);  // q.push({p, 1})
    while(!q.empty()) {
        node_ptr tmp = q.front();
        q.pop();
        if (tmp==NULL) {

        }
        else {
            result.push_back(tmp->content);
            q.push(tmp->sx);
            q.push(tmp->dx);
        }
    }
    return result;
}


void ampiezza(node_ptr p) {
    if (!p) return;
    queue<node_ptr> q;
    q.push(p);
    while(!q.empty()) {
        node_ptr tmp = q.front();
        cout << tmp->content << " ";
        q.pop();
        cout << "q.size = " << q.size() << endl;
        if (tmp->sx!=NULL) q.push(tmp->sx);
        if (tmp->dx!=NULL) q.push(tmp->dx);
    }
}

// funzione per inserimento calcolo della profondità di un albero binario
int deep(node_ptr p) {
    if (p==NULL) return 0;
    else return max(1+deep(p->sx), 1+deep(p->dx));
}

// funzione per inserimento bilanciato in albero binario
node_ptr insBilanciato(node_ptr& p, int val) {

    if (p == NULL) {
        p = new nodo();
        p->content = val;
        p->dx = p->sx = NULL;
    }
    else {
        if (deep(p->dx) >= deep(p->sx)) {
            // inserisco a sinistra
            p->sx = insBilanciato(p->sx, val);
        }
        else {
            // inserisco a destra
            p->dx = insBilanciato(p->dx, val);
        }
    }
    return p;
}

void inserisciBilanciato(node_ptr& p, int val) {

    if (p == NULL) {
        p = new nodo();
        p->content = val;
        p->dx = p->sx = NULL;
    }
    else {
        if (deep(p->dx) >= deep(p->sx)) {
            // inserisco a sinistra
            inserisciBilanciato(p->sx, val);
        }
        else {
            // inserisco a destra
            inserisciBilanciato(p->dx, val);
        }
    }
}

// funzione per inserimento bilanciato in albero binario
node_ptr insSbilanciato(node_ptr& p, int val) {

    if (p == NULL) {
        p = new nodo();
        p->content = val;
        p->dx = p->sx = NULL;
    }
    else {
        p->sx = insBilanciato(p->sx, val);
    }
    return p;
}


void preorder(node_ptr p) {
    if (p) {
        cout << p->content << " ";
        preorder(p->sx);
        preorder(p->dx);
    }
}



void inorder(node_ptr p) {
    if (p) {
        inorder(p->sx);
        cout << p->content << " ";
        inorder(p->dx);
    }
}

void postorder(node_ptr p) {
    if (p) {
        postorder(p->sx);
        postorder(p->dx);
        cout << p->content << " ";
    }
}

bool isBilanciato(node_ptr p) {
    if (p==NULL) return true;
    else return (abs(deep(p->sx) - deep(p->dx)) < 2)
                    && isBilanciato(p->sx)
                    && isBilanciato(p->dx);
}

int contanodi(node_ptr p) {
    if (p==NULL) return 0;
    else return 1 + contanodi(p->sx) + contanodi(p->dx);
}

int contafoglie(node_ptr p) {
    if (p==NULL) return 0;
    else if (p->dx == NULL && p->sx == NULL) return 1;
    else contafoglie(p->sx) + contafoglie(p->dx);
}

bool isPerfettamenteBilanciato(node_ptr p) {
    if (p==NULL) return true;
    else return isBilanciato(p) &&
                abs((contanodi(p->dx)-contanodi(p->sx) < 2)) &&
                isPerfettamenteBilanciato(p->dx) &&
                isPerfettamenteBilanciato(p->sx);
}



void inserisciACaso(node_ptr& p, int val) {
    if (p==NULL) {
        p = new nodo;
        p->content = val;
        p->dx = p->sx = NULL;
    }
    else {
        inserisciACaso(p->sx, val);
    }

}

