class Ex1
{
	int phy,maths,chem;
	int total,sum;
	void marks(int m1, int m2, int m3)
	{
		maths=m1;
		phy=m2;
		chem=m3;
		System.out.println("\n\nMarks in Maths: "+maths+" Physics: "+phy+" Chemistry: "+chem);
		condition();
	}
	void condition()
	{
		if(maths>=60&&phy>=50&&chem>=40)
		{
			total=maths+phy+chem;
			System.out.println("Total Marks of Three Subjects: "+total);
			sum=maths+phy;
			System.out.println("Sum of Maths and Physics Marks: "+sum);
			if(total>=200||sum>=150)
			{
				System.out.println("Eligible for the Course");
			}
			else
				System.out.println("Not Eligible for the Course");
			
		}
		else
			System.out.println("Not Eligible for the Course");
	}
}

class P9
{
	public static void main(String args[])
	{
		Ex1 obj=new Ex1();
		obj.marks(60,45,60);
		Ex1 obj1=new Ex1();
		obj1.marks(60,85,60);
		Ex1 obj2=new Ex1();
		obj.marks(80,80,70);
		Ex1 obj3=new Ex1();
		obj.marks(90,50,50);
	}
}	