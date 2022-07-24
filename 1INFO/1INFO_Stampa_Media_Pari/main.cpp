#include <iostream>
#include <cstdlib>
#include <time.h>
using namespace std;

int main()
{
    srand(time(NULL));
    char c = rand() % 26 + 65;

    return 0;
}
