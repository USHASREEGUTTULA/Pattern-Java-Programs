class Pattern30
{
	public static void main(String[] args) 
	{
		int space=5;
		int unit=1;
		for (int i=0; i<=5;i++)
		{
			for (int a=1;a<=space ;a++ )
			{
				System.out.print(" ");
			}
			int x=1;
			int num=i;
			int den=1;
			for (int b=1;b<=unit ;b++ )
			{
				System.out.print(x+" ");
				x=((x*num)/den);
				num--;
				den++;

			}

			space--;
			unit++;		
				
			System.out.println();
		}
		
	}
}
