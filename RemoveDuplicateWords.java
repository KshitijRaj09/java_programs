//Write a program in java to remove the repeated word in the given string

class RemoveDuplicatesWords
{
 	public static void main(String args[])
	{
		String str="Goodbye bye bye world world world Sam went went to to to his business Reya is is the the best player in eye eye game in in the Hello hello Ab aB";
		System.out.println(str);
		countWords(str);
	}
	static void countWords(String st)
	{
		String[] words = st.split("\\s");
 		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					if (i != j)
						words[i] = "";
 				}
			}
		}
 		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++)
		{
			if (words[i] != "")
			{
				System.out.print(words[i]+" ");
 			}
		}
	}
}
