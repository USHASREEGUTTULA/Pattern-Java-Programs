import java.util.*;
class Pattern49
{
  
    public static void main(String args[])
	{
        for (int i = 1; i <= 6; i++)
		{
            
            for (int j = 1; j < i; j++)
			{
                System.out.print(" ");
            }
           
            for (int j = i; j <= 6; j++)
			{
                if(j == i || j == 6|| i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) 
		{
            
            for (int j = 1; j < i; j++)
			{
                System.out.print(" ");
            }
         
            for (int j = i; j <= 6; j++) 
			{
                if(j == i || j == 6 || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
