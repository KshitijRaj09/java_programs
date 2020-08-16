#include<iostream>
#include<math.h>
using namespace std;
class Primeno{
	int flag,count=1;
	public:
	Primeno(int nth){
		int n=1;
		while(count<=nth){
			n++;
			flag=0;
			for(int i=2;i<=sqrt(n);i++){
				if(n%i==0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				count++;
		}
		cout<<nth<<" Prime Number: "<<n;
	}
};
int main(){
	int nth;
	cout<<"Enter the Number: ";
	cin>>nth;
	Primeno p(nth);
}
