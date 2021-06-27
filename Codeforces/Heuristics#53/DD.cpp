#include <bits/stdc++.h>
// cpp code - translated
//well kind of
// a very simpler way compared to backtracking....
//hehe...
using namespace std;

int countWays(int arr[], int m, int N)
{
    int count[N + 1];
    memset(count, 0, sizeof(count));

    count[0] = 1;

    for (int i = 1; i <= N; i++)
        for (int j = 0; j < m; j++)

            if (i >= arr[j])
                count[i] = count[i] % 1000000007 + count[i - arr[j]] % 1000000007;

    return count[N] % 1000000007;
}

// Driver code
int main()
{
    int t;
    cin >> t;
    while (t--)
    {

        int N;
        cin >> N;
        int arr[] = {1, 2, 4, 6};
        int m = sizeof(arr) / sizeof(arr[0]);

        cout << countWays(arr, m, N) << endl;
    }
    return 0;
}