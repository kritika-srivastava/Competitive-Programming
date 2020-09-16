#include<bits/stdc++.h>
using namespace std;

#define fast ios_base::sync_with_stdio(false);cin.tie(NULL);
#define pb push_back
#define mp make_pair

#define wr(i) cout<<#i<<" = "<<i<<",  ";
#define wre(i) cout<<#i<<"  =  "<<i<<endl;
#define all(v) v.begin(),v.end()
typedef long long ll;

#define lim 1000000000000000LL
typedef unsigned long long ull;
#define M 200005LL
#define F first
#define S second
using u64= uint64_t;

using u64 = uint64_t;

ll fn(ll N)
{
    return (N * (N + 1)) / 2;
}

int main()
{
    fast
        ll t = 1LL;
    cin >> t;

    while (t--)
    {
        ll N;
        cin >> N;
        ll sum = (N * (N + 1)) / 2;
        ll ans1 = 0;
        if (sum & 1)
            ans1 = 0;
        else
        {
            double tmp = sum / 2;

            double k = (sqrt(8 * tmp + 1) / 2) - 0.5;
            double deci, inti;
            deci = modf(k, &inti);
            ll ans = (ll)k;
            if (deci == 0)
            {
                ans1 = fn(ans - 1) + fn(N - ans - 1);
            }
            ans1 += (N - ans);
        }
        cout << ans1 << "\n";
    }
}
