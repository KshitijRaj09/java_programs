#include<iostream>
using namespace std;
class Series{
	public:
		seriesprint(int n){		
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					cout<<i<<"\t";
				}
			}
		}
};
int main()
{
	Series s;
	s.seriesprint(20);
}
