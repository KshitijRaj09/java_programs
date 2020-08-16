//Write a program in java to 
//calculate the length of the string without using java in built function.

class StringLength
{ 
	public static void main(String[] args)
	{ 
		String str="Welcome to My Program"; 
		int i=0; 
		for(char s : str.toCharArray()) 
			i++; 
		System.out.println("String Length =" + i);	
	}
}
