class OddSum
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=1;i<=99;i++)
		{
			if(i%2==1)
			sum=sum+i;
		}
		System.out.println("The Sum is = "+sum);
	}
}

