public class Messages 
{ 
	// This message is use to display the program header
	public static void displayHeader() 
	{
		System.out.println("  ////////////////////////////////////////////////");
		System.out.println(" // Fraction Calculator | 2015 | AP Comp Sci   //");
		System.out.println("////////////////////////////////////////////////");
		newLine();
	}
	
	// This message is use to display the program footer	
	public static void displayFooter() 
	{
		newLine();
		System.out.println("  ////////////////////////////////////////////////////");
		System.out.println(" // End Fraction Calculator | 2015 | AP Comp Sci   //");
		System.out.println("////////////////////////////////////////////////////");
		newLine();
	}
	
	// This method is used to get line of space
	public static void newLine() 
	{
		System.out.println("\n");
	}
}