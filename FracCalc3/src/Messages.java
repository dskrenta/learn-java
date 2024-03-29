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

	// This message is use to tell user to input value for Numerator in a fraction
	public static void insertNumerator() 
	{
		System.out.print("Numerator : ");
	}

	// This message is use to tell user to input a value for denominator
	public static void inputDenominator() 
	{
		System.out.print("Denominator : ");
	}

	// This method is used to get line of space
	public static void newLine() 
	{
		System.out.println("\n");
	}

	// This message is used when user input something miss match
	public static void inputError(Exception e) 
	{
		newLine();
		System.out.println("Input Error: " + e.toString());
		System.out.println("Closing application ...");
		System.out.println("Fraction app is closed.");
		displayFooter();
	}

	// This message is used when user input 0 for Denominator in a fraction
	public static void DenominatorCannotBeZero() 
	{
		System.out.println("Input Error: Denominator Cannot be zero");
		newLine();
	}

	// This message is used to display answers
	public static void displayAnswer(String operation, String operator, Fraction fraction1, Fraction fraction2, Fraction answer) 
	{
		System.out.print(operation + " : ");
		fraction1.display();
		System.out.print(" " + operator + " ");
		fraction2.display();
		System.out.print(" = ");
		answer.display();
		newLine();
	}

}