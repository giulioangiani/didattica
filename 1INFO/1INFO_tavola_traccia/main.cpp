#include <iostream>

using namespace std;

int main()
{
    int A = 1;
    int B;
    int C;
    string msg;
    cin >> B;
    cin >> C;
    B = A*C + B;
    C = A+B+C;
    A = A + 1;
    C = C*C-A*A;
    if (A>=B) {
        if (B>C) {
            msg = "Il maggiore è " + to_string(A);
        }
        else {
            msg = "Non lo so...";
        }
    }
    else {
        msg = "B è maggiore di A";
    }
    cout << msg << endl;
    cout << A << " " << B << " " << C << endl;
    return 0;
}
