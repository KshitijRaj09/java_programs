//Write a java program arrange strings into ascending order
class StringAscending
{
    public static void main(String[] input)
    {
        int i, j;
        String temp;
        String str[] = new String[3];
		str[0]="Shyam"; str[1]="Yogesh"; str[2]="Ram";
		for(i=0; i<=2; i++)
        {
            for(j=1; j<=2; j++)
            {
                if(str[j-1].compareTo(str[j])>0)
                {
                    temp=str[j-1];
                    str[j-1]=str[j];
                    str[j]=temp;
                }
            }
        }
		System.out.println("String Sorted in ascending order");
		System.out.println("String List is :");
        for(i=0;i<=2;i++)
        {
            System.out.println(str[i]);
        }
    }
}