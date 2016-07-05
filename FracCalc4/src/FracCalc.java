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
	
	public static String produceAnswer(String input)
	{ 
		globals global = new globals();
		
		String parts[] = input.split("\\s+");
		
		//Fraction 1 parsing
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
		
		//Operation assignment
		String operator = parts[1];
		
		//Fraction 2 parsing
		Fraction fraction2 = new Fraction();
		if(parts[2].contains("/"))
		{
			if(parts[2].contains("_"))
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
				String frac2[] = parts[2].split("/");
				fraction2.setNumerator(Integer.parseInt(frac2[0]));
				fraction2.setDenominator(Integer.parseInt(frac2[1]));
			}
		}
		else
		{
			fraction2.setNumerator(Integer.parseInt(parts[2]));
			fraction2.setDenominator(1);
		}
		
		//Addition
		if(operator.equals("+"))
		{
			Fraction fraction = new Fraction();
			
			//Addition booleans
			if(fraction1.getDenominator() != fraction2.getDenominator())
			{
				if(fraction1.getNumerator() == 0 || fraction2.getNumerator() == 0)
				{
					fraction.setNumerator(fraction1.getMixedIndex() + fraction1.getNumerator());
					fraction.setDenominator(1);
				}
				fraction.setNumerator((fraction1.getNumerator() * fraction2.getDenominator()) + (fraction2.getNumerator() * fraction1.getDenominator()));
				fraction.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
			}
			else if(fraction1.getDenominator() == 1 && fraction2.getDenominator() == 1)
			{
				//System.out.println("Numerator1: " + fraction1.getNumerator());
				//System.out.println("Numerator2: " + fraction2.getNumerator());
				fraction.setNumerator(fraction1.getNumerator() + fraction2.getNumerator());
				fraction.setDenominator(1);
			}
			else if(fraction1.getDenominator() == fraction2.getDenominator())
			{
				fraction.setNumerator(fraction1.getNumerator() + fraction2.getNumerator());
				fraction.setDenominator(fraction1.getDenominator());
			}
			
			//Display settings
			/*
			if(fraction.getNumerator() == 0)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			if(
					fraction.isMixed() 
					|| fraction.getNumerator() > fraction.getDenominator()
			)
			{
				fraction.toMixedConversion();
				result = fraction.getMixedIndex() + "_" + fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			else if(fraction.getDenominator() == 1)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			else
			{
				fraction.reduce();
				result = fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			*/
			
			global.setGlobal(displayResult(fraction));
		}
		
		//Subtraction
		else if(operator.equals("-"))
		{
			Fraction fraction = new Fraction();
			
			//Subtraction booleans
			if(fraction1.getDenominator() != fraction2.getDenominator())
			{
				fraction.setNumerator((fraction1.getNumerator() * fraction2.getDenominator()) - (fraction2.getNumerator() * fraction1.getDenominator()));
				fraction.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
				//System.out.println(fraction.getNumerator());
				//System.out.println(fraction.getDenominator());
			}
			else if(fraction1.getDenominator() == 1 && fraction2.getDenominator() == 1)
			{
				fraction.setNumerator(fraction1.getNumerator() - fraction2.getNumerator());
				fraction.setDenominator(1);
			}
			else if(fraction1.getDenominator() == fraction2.getDenominator())
			{
				fraction.setNumerator(fraction1.getNumerator() - fraction2.getNumerator());
				fraction.setDenominator(fraction1.getDenominator());
			}
			
			//Display settings
			/*
			if(fraction.getNumerator() == 0)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			if(
					fraction.isMixed() 
					|| fraction.getNumerator() > fraction.getDenominator()
			)
			{
				fraction.toMixedConversion();
				result = fraction.getMixedIndex() + "_" + fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			else if(fraction.getDenominator() == 1)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			else
			{
				fraction.reduce();
				result = fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			*/
			
			global.setGlobal(displayResult(fraction));
		}
		
		//Multiplication
		else if(operator.equals("*"))
		{
			Fraction fraction = new Fraction();
			
			//Multiplication
			fraction.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
			fraction.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
			
			//Display settings
			/*
			if(fraction.getNumerator() == 0)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			if(
					fraction.isMixed() 
					|| fraction.getNumerator() > fraction.getDenominator()
			)
			{
				fraction.toMixedConversion();
				result = fraction.getMixedIndex() + "_" + fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			else if(fraction.getDenominator() == 1)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			else
			{
				fraction.reduce();
				result = fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			*/
			
			global.setGlobal(displayResult(fraction));
		}
		
		//Division
		else if(operator.equals("/"))
		{
			Fraction fraction = new Fraction();
			
			System.out.println("Numerator1: " + fraction1.getNumerator());
			System.out.println("Denominator1: " + fraction1.getDenominator());
			System.out.println("Numerator2: " + fraction2.getNumerator());
			System.out.println("Denominator2: " + fraction2.getDenominator());
			
			//Division
			fraction.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
			fraction.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
			
			System.out.println("Numerator: " + fraction.getNumerator());
			System.out.println("Denominator: " + fraction.getDenominator());
			
			//Display settings
			/*
			if(fraction.getNumerator() == 0)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			if(fraction.getNumerator() > fraction.getDenominator())
			{
				fraction.toMixedConversion();
				fraction.reduce();
				result = fraction.getMixedIndex() + "_" + fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			else if(fraction.getDenominator() == 1)
			{
				result = String.valueOf(fraction.getNumerator());
			}
			else
			{
				fraction.reduce();
				result = fraction.getNumerator() + "/" + fraction.getDenominator();
			}
			*/
			
			global.setGlobal(displayResult(fraction));
		}
		
		return global.getGlobal();
	}
	
	public static String displayResult(Fraction fraction)
	{
		String result;
		
		if(Math.abs(fraction.getNumerator()) > fraction.getDenominator() && fraction.getNumerator() != 0)
		{
			fraction.toMixedConversion();
			fraction.reduce();
			if(fraction.getNumerator() == 0)
			{
				result = String.valueOf(fraction.getMixedIndex());
			}
			else
			{
				if(fraction.getMixedIndex() != 0)
				{
					result = fraction.getMixedIndex() + "_" + Math.abs(fraction.getNumerator()) + "/" + Math.abs(fraction.getDenominator());
				}
				else
				{
					if(fraction.getDenominator() == 1)
					{
						result = String.valueOf(fraction.getNumerator());
					}
					else
					{
						if(fraction.getDenominator() != 0)
						{
							result = fraction.getNumerator() + "/" + fraction.getDenominator();
						}
						else
						{
							result = String.valueOf(fraction.getNumerator());
						}
					}
				}
			}
		}
		else if(fraction.getNumerator() < fraction.getDenominator() && fraction.getDenominator() == 0)
		{
			result = String.valueOf(fraction.getNumerator());
		}
		else if(fraction.getDenominator() == 1 || fraction.getNumerator() == 0)
		{
			result = String.valueOf(fraction.getNumerator());
		}
		else if(fraction.getNumerator() == fraction.getDenominator())
		{
			result = String.valueOf(1);	
		}
		else
		{
			fraction.reduce();
			result = fraction.getNumerator() + "/" + Math.abs(fraction.getDenominator());
		}
		
		return result;
	}
}