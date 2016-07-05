import java.util.ArrayList;
import java.util.Scanner;

public class StringMatcher
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter original string:");
		String originalInput = in.nextLine();
		System.out.println("Please enter substring to search original string for:");
		String subInput = in.nextLine();
		System.out.println(generate(originalInput, subInput));
	}
	
	public static boolean generate(String word, String sub) 
	{
		boolean status = false;
		ArrayList<String> list = new ArrayList<String>();
		
		for (int from = 0; from < word.length(); from++) 
		{
			for (int to = from + 1; to <= word.length(); to++) 
			{
				/*
				//System.out.println(word.substring(from, to));
				if(word.substring(from, to).equals(sub))
				{
					status = true;
				}
				else
				{
					word.substring(from, to);
					status = false;
				}
				*/
				
				list.add(word.substring(from, to));
			}
		}
		
		for(String value : list)
		{
			if(value.equals(sub))
			{
				status = true;
			}
		}
		
		return status;
	}
}