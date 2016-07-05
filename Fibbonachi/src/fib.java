import java.util.Scanner;

public class fib
{
	public static void main (String[] args)
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("NOTE this Fibonacchi program can only compute the 46th term to this sequence. Enter an integer at or below 46 but greater then zero:");
		if(in.nextInt() > 46)
		{
			System.out.println("Entger an Integer at or below 46:");
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
