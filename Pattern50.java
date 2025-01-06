import java.util.*;
class Pattern50
{
    public static void main(String args[])
    {
        for (int i = 1; i <= 6; i++) 
		{
          
            for (int a = 1; a <= 2 * (6- i); a++) 
			{
                System.out.print(" ");
            }

            for (int b = i; b >= 1; b--)
			{
                System.out.print(b + " ");
            }

            for (int c = 2; c <= i; c++) 
			{
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}
