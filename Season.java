class Season
{
	public static void main(String args[])
	{
		int season=2;
		if(season==12||season==1||season==2)
		{
			System.out.println("Winters");
		}
		else if(season==3||season==5||season==4)
		{
			System.out.println("Spring");
		}
		else if(season==6||season==8||season==7)
		{
			System.out.println("Summer");
		}
		else if(season==9 || season==10||season==11)
		{
			System.out.println("Autumn");
		}
		else{
			System.out.println("Bogus month");
		}	
	}
}

