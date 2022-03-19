#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "enter number of digits: " << endl;
    cin >> n;
    int arrofdigits[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arrofdigits[i];
    }
    for (int i = n - 1; i >= 0; i--)
    {
        cout << arrofdigits[i];
    }

    return 0;
}