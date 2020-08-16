#include<iostream>
using namespace std;
class Pattern4{
	public:
	int pattern4(int rows)
	{
		for(int i=1;i<=rows;i++){
			for(int sp=i;sp<rows;sp++){
				cout<<" ";
			}
			for(int d=1;d<=i;d++){
				cout<<"* ";
			}
			cout<<endl;
		}
	}
};
int main(){
	int r;
	cout<<"Enter the number of rows: ";
	cin>>r;
	Pattern4 p4;
	p4.pattern4(r);
}
