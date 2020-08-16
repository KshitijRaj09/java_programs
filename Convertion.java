class Convertion
{
	float centi, far;
	void convert(float x)
	{
		far=x;
		centi = (far-32)*5/9;			
	}
	public static void main(String[] args)
	{
		Convertion obj = new Convertion();
		obj.convert(69);
		System.out.println("The Value of "+obj.far+" farenheit"+" is equal to "+obj.centi+" centigrade");
	}
}

