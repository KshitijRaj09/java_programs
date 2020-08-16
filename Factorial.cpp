//Factorial pf a number.
#include<iostream>
using namespace std;
class Factorial{
	public :
	long int fact(int n){
		if(n>1){
			return n*fact(n-1);
		}
		else
			return 1;
	}
	int factorial(int n){
		int fact=1;
		while(n!=0){
			fact*=n;
			n--;
		}		
		return fact;
	}
};
int main()
{
	Factorial f;
	int n;
	cout<<"Enter the number : ";
	cin>>n;
	cout<<"Factorial using Recursion = "<<f.fact(n);
	cout<<"\nFactorial using loop = "<<f.factorial(n);
	
}
