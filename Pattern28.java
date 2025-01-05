class Pattern28
{
	public static void main(String[] args) 
	{
		int space=4;
		int star=1;
		for (int i=1; i<=5;i++)
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print("   ");
			}
			
			for (int b=1;b<=star;b++ )
			{
				System.out.print("   ");
			}
			for (int c=1;c<=star ;c++ )
			{
				System.out.print(" * ");
			}
			if (i<=4)
			{
				space-=2;
				star++;
			}
			else
			{
				space+=2;
				star--;
			}
					
				
			System.out.println();
		}
		
	}
}
