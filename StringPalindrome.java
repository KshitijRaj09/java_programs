//Write a program in java to check the given string is palindrome or not.

class StringPalindrome
{ 
	public static void main(String[] args)
	{ 
		StringPalindrome obj= new StringPalindrome();
		obj.Palindrome("Hello");
		obj.Palindrome("Radar");
	}
	void Palindrome(String str)
	{
		String strrev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			strrev+=str.charAt(i);
		}
		System.out.println("orginal String: " +str);
		System.out.println("Reverse String :" +strrev);
		if(strrev.equals(str))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}
}
