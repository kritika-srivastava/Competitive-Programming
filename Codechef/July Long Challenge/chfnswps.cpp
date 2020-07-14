#include<bits/stdc++.h>
using namespace std;
#define ll long long int
int main()
{
      ll T;
      
      cin>>T;
      while(T--)
      {
            ll n;
            cin>>n;
            ll a[n],b[n];
            unordered_map<ll,ll>map,map1,map2;
            ll mi=INT_MAX;
            for(int i=0;i<n;i++)
            {
                  cin>>a[i];
                  mi=min(a[i],mi);
                  map[a[i]]++;
            }
            for(int i=0;i<n;i++)
            {
                  cin>>b[i];
                  mi=min(b[i],mi);
                  map[b[i]]++;
            }
            ll flag=0;
            for(auto u:map)
            {
                  if(u.second%2==1)
                  {
                        flag=1;
                        break;
                  }
                  else
                  {                        map1[u.first]=u.second/2;}
            }
            if(flag)
            {
                  cout<<"-1\n";
                  continue;
            }
            else
            {
                  map2=map1;
                  std::vector<ll>vec1,vec2 ;
                  for(int i=0;i<n;i++)
                  {
                        if(map1[a[i]])
                        map1[a[i]]--;
                        else
                        vec1.push_back(a[i]);
                  }
                  for(int i=0;i<n;i++)
                  {
                        
                        if(map2[b[i]])
                        map2[b[i]]--;
                        else
                        vec2.push_back(b[i]);
                  }
                  sort(vec1.begin(),vec1.end());
                  sort(vec2.begin(),vec2.end(),greater<ll>());
                   ll y=vec1.size();
                   if(y==0)
                   cout<<"0\n";
                   else
                   { ll sum=0;
                         for(int i=0;i<y;i++)
                         {
                               sum+=min(2*mi,min(vec1[i],vec2[i]));
                         }
                         cout<<sum<<"\n";
                   }
            }
      }
}
