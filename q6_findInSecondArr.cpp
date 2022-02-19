#include <iostream> 
#include <unordered_set> 
 
using namespace std; 
 
void findinSec(int *first, int *second) { 
	int m = sizeof(first)/sizeof(first[0]); 
	int n = sizeof(second)/sizeof(second[0]); 
	unordered_set<int> S; 
	for (int i = 0; i < n; ++i) { 
		S.insert(second[i]); 
	} 
	for (int i = 0; i < m; ++i) { 
		if (S.find(first[i]) != S.end()) { 
			cout << first[i] << " "; 
		} 
	} 
} 
 
int main() { 
	int first[] = {2,8,7,3,5}; 
	int second[] = {2,3,1,0,2}; 
	findinSec(first, second); 
	return 0; 
}

