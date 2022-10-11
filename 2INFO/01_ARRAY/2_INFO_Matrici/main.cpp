#include <iostream>
#include <stdio.h>
using namespace std;

const int MAXROWS = 100;
const int MAXCOLS = 100;

typedef int matrice[MAXROWS][MAXCOLS];

void print(matrice m, int rows, int cols) {     // dimensione logica
    int i, j;
    for (i = 0; i < rows; i++) {
      for (j = 0; j < cols; j++)
        printf("%d ", m[i][j]);
      printf("\n");
    }
}

int main()
{
//    auto M = new int[2][3];
    matrice M {0};
    M[0][0] = 10;
    M[0][1] = 11;
    M[1][0] = 20;
    M[1][1] = 21;

    print(M, 2, 2);
    return 0;
}
