import java.util.Scanner;

public class Fibb 
{
	public static void main (String[] args)
	{
		/*
		 * fold1 = 1
		 * fold2 = 1
		 * fnew = fold1+fold1
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("NOTE this Fibonacchi program can only compute the 46th term to this sequence. Enter an integer at or below 46 but greater then zero:");
		if(!in.hasNextInt())
		{
			System.out.println("Enter an Integer:");
			int num = in.nextInt();
		}
		else
		{
			int num = in.nextInt();
			for (int i=0; i<=46; i++)
			{
				if(i == num)
				{
					System.out.print(fib(i));
				}
				else
				{
					continue;
				}
			}
		}
	}
	
	public static int fib(int n) 
	{
        if (n < 2) 
        {
           return n;
        }
        
        else
        {
        	return fib(n-1)+fib(n-2);
        }	
	}
}