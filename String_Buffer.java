
class Test
{
	public static void main(String args[])
	{
		StringBuffer obj= new StringBuffer("This is my world");
		obj.replace(8,10,"java");
		System.out.println("Modified String : "+obj);
	}
}