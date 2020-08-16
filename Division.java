class Div
{
	double eng, hindi, maths, sci, sst, total, perc;
	Div(double a, double b, double c, double d, double e)
	{
		eng = a;
		hindi = b;
		maths = c;
		sci = d;
		sst = e;
	}
	void percentage()
	{
		total = eng+hindi+maths+sci+sst;
		perc = total/5;
		if(perc>=60)
			System.out.println("First Division");
		else if(perc>=45 && perc<60)
			System.out.println("Second Division");
		else if(perc>=33 && perc<45)
			System.out.println("Third Division");
		else
			System.out.println("Fail");
	}
	public static void main(String[] args)
	{
		Div obj = new Div(60,40,35,71,65);
		obj.percentage();
	}
}
