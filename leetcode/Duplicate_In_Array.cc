#include <vector>
using namespace std;

int findDuplicate(vector<int> &arr)
{
    int ans = 0;
    // xoring [all array elemnts]
    for (int i = 0; i < arr.size(); i++)
    {
        ans = ans ^ arr[i];
    }
    // xor ing [1,n-1]
    for (int i = 1; i < arr.size(); i++)
    {
        ans = ans ^ i;
    }
    return ans;
}
