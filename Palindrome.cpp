#include<iostream>
using namespace std;
class Palindrome{
	public:
	int palindrome(int n, int m){
		int num,d,r;
		for(int i=n;i<=m;i++){
			num=i;
			d=0,r=0;
			while(num!=0){
				r=num%10;
				d=(d*10)+r;
				num/=10;
			}
			if(d==i){
				cout<<d<<" is Palindrome"<<endl;
			}
		}
	}
};
int main(){
	Palindrome p;
	int n,m;
	cout<<"Enter the starting and Last range: ";
	cin>>n>>m;
	p.palindrome(n,m);
}
