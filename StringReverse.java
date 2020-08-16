//Reverse String without using any inbuilt method.

class StringReverse
{ 
	public static void main(String[] args)
	{ 
		String str="Welcome to My Program"; 
		String strrev="";
		for(int i=str.length()-1;i>=0;i--) 
		{
			strrev=strrev+str.charAt(i);
		}
		System.out.print(strrev);
	}
}
