class Shape
{
	int x,y;
	void getCord(int a,int b)
	{
		x=a;
		y=b;
	}
	void showCord()
	{
		System.out.println("the dimensions of base class"+x+" "+y);	
	}
}
	class Rectangle extends Shape
	{
		void showCord()
		{
			super.getCord(10,20);
			System.out.println("Dimensions of child class "+x+" "+y);	
		}
	}
	class P14{
		public static void main(String args[])
		{
			Rectangle r=new Rectangle();
			r.showCord();
		}
	}
