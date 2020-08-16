#include<iostream>
#include<algorithm>
using namespace std;
class FindSum25{
	public:
		int Sum25(int a[],int sum, int n){
		int	l=0;
		int	r=n-1;
			while(l<r){
				if(a[l]+a[r]==sum){
					cout<<a[l]<<" and "<<a[r]<<" has sum= "<<25;
					l++;
				}
				else if(a[l]+a[r]<sum)
					l++;
				else
					r--;
				}
				}
			};

int main(){
	FindSum25 s;
	int a[]={1, 4, 45, 6, 10, -8};
	int sum=16;
	int n=sizeof(a)/sizeof(a[0]);
	sort(a,a+n);
	s.Sum25(a,sum,n);
}
