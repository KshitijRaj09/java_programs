//Write a program in java to check two strings are equal or not without using method.

class StringEquals
{ 
	public static void main(String[] args)
	{ 
		int flag=1;
		String str="Java Program"; 
		String str1="Java Program";
		for(int i=str.length()-1;i>=0;i--) 
		{
			if(str1.charAt(i)!=str.charAt(i))
			{
				flag=0;
				System.out.println("Strings are Not Equal");
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("Strings are Equal");

		}
	}
}
