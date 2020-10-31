#include<bits/stdc++.h>
using namespace std;
#define ll long long int 
#define pb push_back
#define mk make_pair
#define pii pair<ll,ll> 
#define vi vector<ll> 
#define endl '\n'
void fastio(){
 
    ios_base::sync_with_stdio(false);
    cin.tie(0);


    #ifndef ONLINE_JUDGE	
	freopen("input.txt","r",stdin);	
	freopen("output.txt","w",stdout);
    #endif
}

ll a=0,b=0;
bool isPowerOf3(ll n){
	if(n<=2){
		return false;
	}

	while(n>1){
		if((n%3)!=0){
			return false;
		}
		b++;
		n=n/3;
	}
	if(n==1){return true;}
	else{return false;}

}
int main(){
	
	fastio();
	
		cout<<"Working good is it or not \n";
		ll n;cin>>n;
		if(n<=7){cout<<-1;return 0;}
		bool flag = false;
		
		for(ll i=5;i<=n;i*=5){
			a++;
			ll temp = n-i;
			if(isPowerOf3(temp)){
				cout<<b<<" "<<a<<endl;
				flag  = true;
				break;
			}
		}
		if(flag ==false){cout<<-1;}
	


}