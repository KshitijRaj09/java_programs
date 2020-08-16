#include<iostream>
using namespace std;
class Pattern5{
	int num=1;
	public:
	int pattern5(int rows){
		for(int i=1;i<=rows;i++){
			for(int sp=i;sp<rows;sp++){
				cout<<" ";
			}
			for(int d=1;d<=i;d++){
				cout<<num;
				num++;
			}
			
			for(int d2=1;d2<i;d2++){
				num--;
				cout<<num;
			}
			cout<<endl;
		}
		return 0;
	}
};
int main(){
	int r;
	cout<<"Enter the number of rows: ";
	cin>>r;
	Pattern5 p5;
	p5.pattern5(r);
}
