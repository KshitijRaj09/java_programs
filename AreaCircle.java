class AreaCircle
{
	int radius;
	AreaCircle(int radius)
	{
		this.radius=radius;
		System.out.println("Radius of Circle= "+radius);
	}
	void area()
	{
		System.out.println("Area of Circle= "+ radius*radius);
	}
	public static void main(String args[])
	{
		AreaCircle obj=new AreaCircle(10);
		obj.area();
	}
}