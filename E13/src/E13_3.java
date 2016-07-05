import java.util.Scanner;

public class E13_3 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string to be reversed: ");
		String input = in.nextLine();
		System.out.println(reverseString(input));
	}
	
	public static String reverseString(String s)
	{
	    if (s.length() == 0)
	    {
	    	return s;
	    }
	    else
	    {
	    	return reverseString(s.substring(1)) + s.charAt(0);
	    }
	}
}
