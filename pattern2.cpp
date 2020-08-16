#include<iostream>
using namespace std;
class Pattern2{
	public:
	static int pattern2(int rows)
	{
		for(int i=1;i<=rows;i++){
			for(int sp=i;sp<rows;sp++){
				cout<<" ";
			}
			for(int d=1;d<=i;d++){
				cout<<d<<" ";
			}
			cout<<endl;
		}
	}
};
int main(){
	int r;
	cout<<"Enter the number of rows: ";
	cin>>r;
	Pattern2::pattern2(r);
}
