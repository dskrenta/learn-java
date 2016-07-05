import java.util.Scanner;

public class E5_7 
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
		
		if(num1 <= num2 && num2 <= num3 && num1 <= num3)
		{
			System.out.println("In Order");
		}
		
		else if (num1 >= num2 && num2 >= num3 && num1 >= num3)
		{
			System.out.println("In Order");
		}
		
		else
		{
			System.out.println("Not In Order");
		}
	}
}

