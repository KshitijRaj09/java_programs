//Write a Java program to display the addition, subtraction, multiplication and division of two floating point numbers.

class Calculate
{
	double num1,num2;
	void set()
	{
		num1=20.5;
		num2=9.2;
		System.out.println("Number1= "+num1+" Number2= "+num2);
	}
	void addition()
	{
		System.out.println("Addition of Two Number= "+(num1+num2));
	}
	void subtraction()
	{
		System.out.println("Subtraction of Two Number= "+(num1-num2));
	}
	void multiplication()
	{
		System.out.println("Multiplication of Two Number= "+(num1*num2));
	}
	void division()
	{
		System.out.println("Division of Two Number= "+(num1/num2));
	}
}

class P7
{
	public static void main(String args[])
	{
		Calculate obj= new Calculate();
		obj.set();
		obj.addition();
		obj.subtraction();
		obj.multiplication();
		obj.division();
	}
}
