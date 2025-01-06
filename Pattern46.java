import java.util.*;
class Pattern46
{
    public static void main(String args[])
	{
        for (int i = 1; i <= 5; i++)
		{
            for (int a= 1; a <= 5- i; a++)
			{
                System.out.print(" ");
            }
            
            for (int b= 1; b<= 2 * i - 1; b++)
			{
                if (b== 1 || b == 2 * i - 1 || i == 5) 
				{
                    System.out.print("*");
                } 
				else 
				{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
