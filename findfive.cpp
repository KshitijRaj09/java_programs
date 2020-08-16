#include<iostream>
using namespace std;
class FindFive{
	public:
	static void findfive()
	{
		int num,r;
		for(int i=400;i<=600;i++){
			num=i;
			while(num!=0){
				r=num%10;
				num=num/10;
				if(r==5){
					cout<<i<<"\t";
					break;
				}
			}
		}
	}
};
int main()
{
	FindFive::findfive();
	return 0;
}
