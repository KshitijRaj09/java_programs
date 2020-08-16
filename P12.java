
class Rectangle
{
	Rectangle(int a)
	{
		System.out.println("It is a Square");
		System.out.println("Area: " + a*a);
	}
	Rectangle(int a, int b)
	{
		System.out.println("It is a Rectangle");
		System.out.println("Area: " + a*b);
	}
}

class P12
{
	public static void main(String args[])
	{
		Rectangle obj=new Rectangle(4);
		Rectangle obj1=new Rectangle(5,7);
	}
}