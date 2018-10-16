#include<iostream>
using namespace std;
int a[100005];
int main()
{
	int n,k;
	long long available_pairs=0;
	cin>>n>>k;
	for(int i=1;i<=n;i++)
	{
		
		cin>>a[i];
		available_pairs+=a[i]/2;
		a[i]-=1;
		
	}
	
	if(available_pairs < k)
	{
		cout<<"-1\n";
	}
	else
	{
		long long total=n;
		long long pairs =0;
		for(int i=1;i<=n;i++)
		{
			if(a[i]>=2)
			{
				total+=a[i]/2*2;
				pairs+=a[i]/2;
				a[i]=a[i]%2;
			}
		}
		if(pairs >=k)
		{
			cout<<k*2+n-1<<"\n";
			return 0;
		}
		cout<<total+k-pairs<<"\n";
	}
	return 0;
}
