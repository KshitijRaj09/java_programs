//Write a Java program that accepts three integers as input from the user, 
//which are lengths of the side of the rectangle. 
//Your program should display the type of rectangle (Equilateral, right angled, isosceles triangle, scalene triangle)

class Triangle
{
	void compare(int a, int b, int c)
	{
		if(a==b&&b==c)
		{
			System.out.println("Equilateral Triangle");
		}
		else if((a==b)||(b==c)||(a==c))
		{
			System.out.println("Isosceles Triangle");
			right_angled(a,b,c);
		}
		else 
		{
			System.out.println("Scalene Triangle");
			right_angled(a,b,c);
		}
	}	
	void right_angled(int a, int b, int c)
	{
		int largest=a > b ? (a > c ? a : c) : (b > c ? b : c);
		if(largest==a)
		{
			if(a*a==(b*b)+(c*c))
				System.out.println("Right Angled Triangle");
		}
		if(largest==b)
		{
			if(b*b==(a*a)+(c*c))
				System.out.println("Right Angled Triangle");
		}
		if(largest==c)
		{	
			if(c*c==(b*b)+(a*a))
				System.out.println("Right Angled Triangle");
		}
	}
}

class P10
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		Triangle obj=new Triangle();
		obj.compare(a,b,c);
	}
}