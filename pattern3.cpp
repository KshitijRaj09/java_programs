#include<iostream>
using namespace std;
class Pattern3{
	public:
	int value=1;
	int pattern3(int rows)
	{
		for(int i=1;i<=rows;i++){
			for(int sp=i;sp<rows;sp++){
				cout<<" ";
			}
			for(int d=1;d<=i;d++){
				cout<<value<<" ";
				value++;
			}
			cout<<endl;
		}
	}
};
int main(){
	int r;
	cout<<"Enter the number of rows: ";
	cin>>r;
	Pattern3 p3;
	p3.pattern3(r);
}
