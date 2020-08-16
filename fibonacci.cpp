#include<iostream>
using namespace std;
class Fibonacci{
	public :
	Fibonacci(int n)
	{
		int first=1,second=1,third;
	//	cout<<first<<"\t"<<second;
		for(int i=1;i<=n-2;i++)
	{
			third=first+second;
			first=second;
			second=third;
		}
			cout<<"\t"<<third;
	}
};
class Fib{
	public:
		int fib_rec(int n){
			static int first=0,second=1, third;
			if(n>=1)
			{
				third=first+second;
				cout<<"\t"<<third;
				first=second;
				second=third;
				return (fib_rec(n-1));
			}
			else
				return 0;
	}
			
		
};
int main()
{
	Fib f;
	cout<<"fibonacci series:" <<0<<"\t"<<1;
	f.fib_rec(11-2);
	return 0;
}
