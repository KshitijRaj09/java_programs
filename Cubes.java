//Find the cubes of numbers between 1 and 10 for loop.

class Cubes
{
	int a;
	void cubeloop()
	{
		for(int i=1;i<=10;i++)
		{
			a=i*i*i;
			System.out.println("The Cube of "+i+" is : "+a);
		}
	}
	public static void main(String[] args)
	{
		Cubes obj = new Cubes();
		obj.cubeloop();
	}
}
