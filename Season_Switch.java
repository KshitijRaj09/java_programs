class Season_Switch
{
	public static void main(String args[])
	{
		int season=7;
		switch(season)
		{
			case 1:
			case 2:
			case 12:			
				System.out.println("winters");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("autumn");
				break;
			default:
				System.out.println("bogus month");
		}
	}
}
