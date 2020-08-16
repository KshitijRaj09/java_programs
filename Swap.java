class Swap
{
	void swap(int a, int b)
	{
		System.out.println("value of num1= "+a+" num2= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping"); 
		System.out.println("value of num1= "+a+" num2= "+b);
	}
	public static void main(String args[])
	{
		Swap obj=new Swap();
		obj.swap(18,9);
	}
}