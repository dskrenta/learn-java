
public class main {
	public static void main(String[] args)
	{
		String hello = "CAC";
		char[] palindrome = hello.toCharArray();
		String backwards = "";
		
		
		for(int i = palindrome.length - 1; i >= 0; i--)
		{
			//System.out.println(palindrome[i]);
			backwards = backwards + palindrome[i];
		}
		
		System.out.println(backwards);
		
		if(backwards.equals(hello))
		{
			System.out.println("Is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
}
