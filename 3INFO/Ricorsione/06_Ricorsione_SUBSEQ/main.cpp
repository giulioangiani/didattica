#include <iostream>
#include <string>

using namespace std;

int subseq(string s, string t) {
    if (s=="" or t=="") return 0;
    else {
        if (s[0]==t[0]) return 1 + subseq(s.substr(1), t.substr(1));
        else return max(subseq(s, t.substr(1)), subseq(s.substr(1), t));
    }
}

string subseqL(string s, string t) {
    if (s=="" or t=="") return "";
    else {
        if (s[0]==t[0]) return s[0] + subseqL(s.substr(1), t.substr(1));
        else {
			if ( subseqL(s, t.substr(1)).length() > subseqL(s.substr(1), t).length() )
				return subseqL(s, t.substr(1));
			else
				return subseqL(s.substr(1), t);
        }
    }
}

int main()
{
    cout << subseq("CIAO", "IATO") << endl;
    cout << subseq("CIAO", "IATO") << endl;
    cout << "===================\n";
    cout << subseq("CIAO", "CPIATO") << endl;
    cout << subseqL("YDHSGEHBK", "JWYSGHKE") << endl;

    return 0;
}
