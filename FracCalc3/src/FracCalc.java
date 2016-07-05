import java.util.Scanner;

public class FracCalc 
{
	public static void main(String[] args) 
	{
		Messages.displayHeader();
		
		Scanner input = new Scanner(System.in);
		boolean done = false;
		
		while(!done)
		{
			System.out.println("Enter input:");
			String in = input.nextLine();
			
			if(in.equals("quit"))
			{
				done = true;
			}
			else
			{
				System.out.println(produceAnswer(in));
			}
		}
		
		input.close();
		Messages.displayFooter();
	}
	
	/*
	public static void main(String args[]) 
	{
		Fraction fraction1 = new Fraction(); // first fraction
		Fraction fraction2 = new Fraction(); // second fraction

		// Display application header
		Messages.displayHeader();

		// get user inputs for fraction one and validate them
		do 
		{
			System.out.println("Enter values for fration one");
			Messages.insertNumerator();
			try 
			{
				fraction1.setNumerator(input.nextInt()); // get user input
			} 
			catch (Exception e) 
			{
				Messages.inputError(e); // display error
				return;
			}
			Messages.inputDenominator();
			try 
			{
				fraction1.setDenominator(input.nextInt()); // get user input
			} 
			catch (Exception e) 
			{
				Messages.inputError(e);
				return;
			}
			if (fraction1.getDenominator() == 0) 
			{ // check for x/0 error
				Messages.DenominatorCannotBeZero();
			}
		} while (fraction1.getDenominator() == 0);

		// Display fraction one
		System.out.print("Fraction one : ");
		fraction1.display();
		Messages.newLine();

		// get user inputs for fraction two and validate them
		do 
		{
			System.out.println("Enter values for fration two");
			Messages.insertNumerator();
			try 
			{
				fraction2.setNumerator(input.nextInt()); // get user input
			} 
			catch (Exception e) 
			{
				Messages.inputError(e);
				return;
			}
			Messages.inputDenominator();
			try 
			{
				fraction2.setDenominator(input.nextInt()); // get user input
			} 
			catch (Exception e) 
			{
				Messages.inputError(e);
				return;
			}
			if (fraction2.getDenominator() == 0) 
			{ // check for x/0 error
				Messages.DenominatorCannotBeZero();
			}
		} while (fraction2.getDenominator() == 0);

		// Display fraction two
		System.out.print("Fraction two : ");
		fraction2.display();
		Messages.newLine();

		// Addition
		Addition addition = new Addition(fraction1, fraction2);
		addition.display();

		// Subtraction
		Subtraction subtraction = new Subtraction(fraction1, fraction2);
		subtraction.display();

		// Multiplication
		Multiplication multiplication = new Multiplication(fraction1, fraction2);
		multiplication.display();

		// Division
		Division division = new Division(fraction1, fraction2);
		division.display();

		// Display application footer
		Messages.displayFooter();
	}
	*/
	
	public static String produceAnswer(String input)
	{ 
		globals global = new globals();
		
		String parts[] = input.split("\\s+");
		
		Fraction fraction1 = new Fraction();
		if(parts[0].contains("/"))
		{
			if(parts[0].contains("_"))
			{
				String mix1[] = parts[0].split("_");
				String frac1[] = mix1[1].split("/");
				
				fraction1.setNumerator(Integer.parseInt(frac1[0]));
				fraction1.setDenominator(Integer.parseInt(frac1[1]));
				fraction1.setMixedIndex(Integer.parseInt(mix1[0]));
				
				fraction1.toImproperConversion();
			}
			else
			{
				String frac1[] = parts[0].split("/");
				fraction1.setNumerator(Integer.parseInt(frac1[0]));
				fraction1.setDenominator(Integer.parseInt(frac1[1]));
			}
		}
		else
		{
			fraction1.setNumerator(Integer.parseInt(parts[0]));
			fraction1.setDenominator(1);
		}
		
		String operator = parts[1];
		
		Fraction fraction2 = new Fraction();
		if(parts[0].contains("/"))
		{
			if(parts[0].contains("_"))
			{
				String mix2[] = parts[2].split("_");
				String frac2[] = mix2[1].split("/");
				
				fraction2.setNumerator(Integer.parseInt(frac2[0]));
				fraction2.setDenominator(Integer.parseInt(frac2[1]));
				fraction2.setMixedIndex(Integer.parseInt(mix2[0]));
				
				fraction2.toImproperConversion();
			}
			else
			{
				String frac2[] = parts[0].split("/");
				fraction2.setNumerator(Integer.parseInt(frac2[0]));
				fraction2.setDenominator(Integer.parseInt(frac2[1]));
			}
		}
		else
		{
			fraction2.setNumerator(Integer.parseInt(parts[2]));
			fraction2.setDenominator(1);
		}
		
		if(operator.equals("+"))
		{
			Addition addition = new Addition(fraction1, fraction2);
			//String result = addition.getAnswer();
			String result = addition.getAnswer2();
			global.setGlobal(result);
		}
		else if(operator.equals("-"))
		{
			Subtraction subtraction = new Subtraction(fraction1, fraction2);
			//String result = subtraction.getAnswer();
			String result = subtraction.getAnswer2();
			global.setGlobal(result);
		}
		else if(operator.equals("*"))
		{
			Multiplication multiplication = new Multiplication(fraction1, fraction2);
			//String result = multiplication.getAnswer();
			String result = multiplication.getAnswer2();
			global.setGlobal(result);
		}
		else if(operator.equals("/"))
		{
			Division division = new Division(fraction1, fraction2);
			//String result = division.getAnswer();
			String result = division.getAnswer2();
			global.setGlobal(result);
		}
		
		return global.getGlobal();
	}

}