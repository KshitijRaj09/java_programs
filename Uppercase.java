//Write a program in java which take your name as input and print in the upper case.

class UpperCase
{
	void convertUpper(String str)
	{
		String str1=str.toUpperCase();
		System.out.println("Converted in UpperCase: "+str1);
	}
	public static void main(String args[])
	{
		String str=args[0];
		UpperCase obj=new UpperCase();
		obj.convertUpper(str);
	}
}