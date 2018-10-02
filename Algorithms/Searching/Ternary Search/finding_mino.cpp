#include <iostream>
#include <cstdio>
#include <cassert>
using namespace std;
int f(int x){ return 2*x*x -12*x + 7;}
int ternary_search(int l, int r)
{
	while(r-l>=3)
	{
		int mid1 = l + (r-l)/3;
		int mid2 = r - (r-l)/3;
		if(f(mid1) < f(mid2))
			r = mid2;
		else
			 l = mid1;
	}
	if(l==r)
		return f(l);
	else if (l+1==r)
		return min(f(l), f(r));
	else
		return min(f(l), min(f(l+1), f(l+2)));
}
int main(int argc, char *argv[])
{
	//freopen(argv[1], "r", stdin);
	//freopen(argv[2], "w", stdout);
	int n;
	scanf("%d",&n);
	assert(n>=1 and n<=1000);
	int l,r;
	/*for(int i=-3;i<12;i++)
	{
		cout<<i<<" "<<f(i)<<endl;
	}*/
	for(int i=0;i<n;i++)
	{
		scanf("%d%d",&l,&r);
		assert(l>=-1000 and l<=1000);
		assert(r>=-1000 and l<=1000);
		printf("%d\n",ternary_search(l,r));
	}
	return 0;
}