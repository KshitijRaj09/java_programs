//Write a JAVA program create interface use this interface to show multiple inheritance.

interface Abc
{
	void method();
}

class Base1
{
	protected void method2()
	{
		System.out.println("Method2 called");
	}
}

class Derived extends Base1 implements Abc
{
	public void method()
	{
		System.out.println("Method called");
	}
	void method3()
	{
		System.out.println("Method3 called");
	}
	public static void main(String[] args)
	{
		Derived obj=new Derived();
		obj.method();
		obj.method2();
		obj.method3();
	}
}
