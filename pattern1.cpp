#include<iostream>
using namespace std;
class Pattern1{
	public:
	static int pattern1(int rows)
	{
		for(int i=1;i<=rows;i++){
			for(int sp=i;sp<rows;sp++){
				cout<<" ";
			}
			for(int d=1;d<=i;d++){
				cout<<i<<" ";
			}
			cout<<endl;
		}
	}
};
int main(){
	int r;
	cout<<"Enter the number of rows: ";
	cin>>r;
	Pattern1::pattern1(r);
}
