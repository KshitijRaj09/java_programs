//Write a program to accept three command line arguments from the user and to display it in sorted order.
class Compare
{
	void compare(int number1, int number2, int number3)
	{
		if (number1 > number2) 
		{
		  int temp = number1;
		  number1 = number2;
		  number2 = temp;
		}

		if (number2 > number3) {
		  int temp = number2;
		  number2 = number3;
		  number3 = temp;
		}

		if (number1 > number2) {
		  int temp = number1;
		  number1 = number2;
		  number2 = temp;
		}

		System.out.println("The sorted numbers are "+ number1 + " " + number2 + " " + number3);
	  }
	}

class P11
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		Compare obj=new Compare();
		obj.compare(a,b,c);
	}
}