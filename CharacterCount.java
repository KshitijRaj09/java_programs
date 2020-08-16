//Wap to count  number  of occurrences of a character in a string
class CharacterCount
{
	public static void main(String[] args)
	{
		String str="mississippi";
		int count=0;
		for(char i='a'; i<='z'; i++)
		{
			count = 0;
			for(int j=0; j<str.length(); j++)
			{ 
				if(i==str.charAt(j)) 
				   count++;
			}
			if(count!=0)
			{
				System.out.println("Occurrences of "+i+"\t\t"+count);
			}
		}
	}
}