/*
	You are given container full of water. Container can have limited amount
	of water. You also have N bottles to fill. You need to find the maximum 
	numbers of bottles you can fill.
*/
#include <iostream>
#include <algorithm>
using namespace std;
const int MAX = 100000;
int A[MAX];
int main(){
	int T;
	cin >> T;
	while(T--){

		int N,Capacity;
		cin >> N >> Capacity;
		int numberBottles = 0, numberOfBottles = 0;
		for(int i = 0; i < N; i++){
			cin >> A[i];
		}
		sort(A,A+N);
		for(int i = 0; i < N; i++){
			numberBottles += A[i];
			if(numberBottles > Capacity){
				break;
			}else{
				numberOfBottles++;
			}
		}
	    cout << numberOfBottles << "\n";
	
	}
	return 0;
}