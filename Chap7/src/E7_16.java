import java.util.Scanner;

public class E7_16 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a odd number:");
		int n = in.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("Please enter a odd numer.");
			System.out.println("Resart the program to enter another number.");
		}
		else
		{			
			int order = n;
			for(int row = 0; row < order; row++)
			{
				for(int col = 0; col < order; col++)
				{
					int rowOrder = (((order + 1) / 2 + row + col) % order);
					int colOrder = (((order + 1) / 2 + row + order - col - 1) % order) + 1;
					System.out.print(((rowOrder * order) + colOrder) + "\t");
				}
				System.out.println();
			}
		}
	}
}


/*
 Magic Square 
int order = 5;
for (int row = 0; row < order; row++) {
	for (int col = 0; col < order; col++) {
		int rowMatrix = (((order + 1) / 2 + row + col) % order);
		int colMatrix = (((order + 1) / 2 + row + order - col - 1) % order) + 1;
		System.out.print(((rowMatrix * order) + colMatrix) + "\t");
	}
	System.out.println();

} 
*/