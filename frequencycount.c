#include<iostream>
//#include<conio.h>
using namespace std;
int main()
{
	int a[50],flag[50],i,j,n=0,c=0;
	clrscr();
	cout<<"Enter the Size of List: ";
	cin>>n;
	cout<<"Enter the Number: ";
	for(i=0;i<n;i++)
	{
		cin>>a[i]);
		flag[i]= 0;
	}
	for(i=0;i<n;i++)
	{
		c=1;
		for(j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				c++;
				flag[j]=1;
			}
		}
		if(flag[i]!=1)
		{
			cout<<"Frequency of "<<a[i]<<" is "<<c;
		}
	}
	//getch();
}
