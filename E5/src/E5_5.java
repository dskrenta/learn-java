import java.util.Scanner;

public class E5_5 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num1 = in.nextInt();
		System.out.println("Enter a Number:");
		int num2 = in.nextInt();
		System.out.println("Enter a Number:");
		int num3 = in.nextInt();
		
		if(num1 < num2 && num2 < num3 && num1 < num3)
		{
			System.out.println("Increasing");
		}
		
		else if (num1 > num2 && num2 > num3 && num1 > num3)
		{
			System.out.println("Decreasing");
		}
		
		else
		{
			System.out.println("Neither");
		}
	}
}
