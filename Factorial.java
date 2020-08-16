//Write a program that will display the factorial of number 10 using while loop.

class Factorial
{
	public static void main(String args[])
	{
		int n=5,n1=0;
		int fact=1;
		n1=n;
		while(n1!=0)
		{
		 fact=fact*n1;
		 n1--;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
}