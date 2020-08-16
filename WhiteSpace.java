//Write a program in java to remove white space from the given string  “   the quick brown fox jumped        over the lazy dog              “.

class WhiteSpace
{
	void convertUpper(String str)
	{
		String str1 = str.replaceAll("\\s", "");
		System.out.println("String Without of WhiteSpace: "+str1);
	}
	public static void main(String args[])
	{
		WhiteSpace obj=new WhiteSpace();
		obj.convertUpper("   the quick brown fox jumped        over the lazy dog              ");
	}
}