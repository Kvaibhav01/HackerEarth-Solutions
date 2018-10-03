/*
	You have been given an undirected graph consisting of N nodes and M 
	edges. This graph can consist of self-loops as well as multiple edges.
	In addition , you have also been given Q queries. For each query , you
	shall be given 2 integers A and B. You just need to find if there exists 
	an edge between node A and node B. If yes, print "YES" (without quotes) 
	else , print "NO"(without quotes).

*/
#include <iostream>
using namespace std;
int arr[1000][1000];
void initialize(){
	for(int i = 0; i < 1000; i++){
		for(int j = 0; j < 1000; j++){
			arr[i][j] = false;
		}
	}
}
int main(){

	int x,y,n,m,q;
	initialize();
	cin >> n >> m;
	for(int i = 0 ; i < m; i++){
		cin >> x >> y;
		arr[x][y] = true;
	}
	cin >> q;
	for(int i = 0; i < q; i ++){
		cin >> x >> y;
		if(arr[x][y]== true){
			cout << "YES"<<"\n";
		}else{
			cout << "NO"<<"\n";
		}
	}
	return 0;
}