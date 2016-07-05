import java.util.Scanner;

public class Generator 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter string for substring generator:");
		String input = in.nextLine();
		generate(input);
	}
	
	public static void generate(String word) 
	{
		for (int from = 0; from < word.length(); from++) 
		{
			for (int to = from + 1; to <= word.length(); to++) 
			{
				System.out.println(word.substring(from, to));
			}
		}
	}
}
