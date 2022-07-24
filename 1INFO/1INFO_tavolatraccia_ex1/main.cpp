#include <iostream>

using namespace std;

int main()
{
    /*
    int A,B,C;
    float H;
    cin >> A >> B;
    if (A < 0) {
        A = -1*A;
    }
    if (A < B) {
        C = A-B;
    }
    else {
        C=B%A;
        B=B/A;
        H=5;
        H=A/H;
    }

    cout << A << " " << B << " "<< C << " " << H;
    */
    int a,b;
    float c;
    cin >> a >> b;
    if (a/b == 0) a=-1*a;
    if (a < b) c = b-(a+1);
    else c = float((a+1))/b;
    cout << a << " " << b << " " << c << endl;
    return 0;
}
