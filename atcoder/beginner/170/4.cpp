#include<bits/stdc++.h>
using namespace std;
#define ll long long int


// Harmonic Series : 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + ....... + 1/n = O(logn)
// Make sure that in doing seive operation same element is not considered more than once in 
// marking it's multiples 
int main(){
	ll n;
	cin>>n;

	ll arr[n];
	ll maxi = 0;
	for(ll i=0;i<=n-1;i++){
		cin>>arr[i];
		maxi = max(maxi,arr[i]);
	}


	bool sieve[maxi+1];
	for(ll i=1;i<=maxi;i++){
		sieve[i]=false;
	}

	unordered_map<ll,ll> um1;
	for(ll i=0;i<=n-1;i++){
		if(um1.find(arr[i])==um1.end()){
		for(ll j=arr[i]*2;j<=maxi;j+=arr[i]){
			sieve[j]=true;
		}

	}
	um1[arr[i]]++;

	}

	ll ans  =0;
	for(ll i=0;i<=n-1;i++){
		if(um1[arr[i]]==1 && sieve[arr[i]]==false){
			ans++;
	}
}
cout<<ans;


}