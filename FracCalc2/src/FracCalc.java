import java.util.Scanner;

public class FracCalc 
{
	public static void main(String[] args) 
	{
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
		
		System.out.println("Calculator completed.");
		input.close();
	}
	
	public static String produceAnswer(String input)
	{ 
		globals global = new globals();
	
		String parts[] = input.split("\\s+");
		
		fraction fraction1 = new fraction();
		if(parts[0].contains("/"))
		{
			if(parts[0].contains("_"))
			{
				String mix1[] = parts[0].split("_");
				String frac1[] = mix1[1].split("/");
				
				fraction1.setNumerator(Integer.parseInt(frac1[0]));
				fraction1.setDenominator(Integer.parseInt(frac1[1]));
				fraction1.setMixIndex(Integer.parseInt(mix1[0]));
				
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
		
		fraction fraction2 = new fraction();
		if(parts[0].contains("/"))
		{
			if(parts[0].contains("_"))
			{
				String mix2[] = parts[2].split("_");
				String frac2[] = mix2[1].split("/");
				
				fraction2.setNumerator(Integer.parseInt(frac2[0]));
				fraction2.setDenominator(Integer.parseInt(frac2[1]));
				fraction2.setMixIndex(Integer.parseInt(mix2[0]));
				
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
		
		/*
		fraction fraction1 = new fraction();
		if(parts[0].contains("_"))
		{
			String mix1[] = parts[0].split("_");
			String frac1[] = mix1[1].split("/");
				
			fraction1.setNumerator(Integer.parseInt(frac1[0]));
			fraction1.setDenominator(Integer.parseInt(frac1[1]));
			fraction1.unMixNumerator(Integer.parseInt(mix1[0]));
		}
		else
		{
			String frac1[] = parts[0].split("/");
			
			fraction1.setNumerator(Integer.parseInt(frac1[0]));
			fraction1.setDenominator(Integer.parseInt(frac1[1]));
		}
			
		String operator = parts[1];
		
		fraction fraction2 = new fraction();
		if(parts[2].contains("_"))
		{
			String mix2[] = parts[2].split("_");
			String frac2[] = mix2[1].split("/");
			
			fraction2.setNumerator(Integer.parseInt(frac2[0]));
			fraction2.setDenominator(Integer.parseInt(frac2[1]));
			fraction2.unMixNumerator(Integer.parseInt(mix2[0]));
		}
		else
		{
			String frac2[] = parts[2].split("/");
			
			fraction2.setNumerator(Integer.parseInt(frac2[0]));
			fraction2.setDenominator(Integer.parseInt(frac2[1]));
		}
		*/
		
		if(operator.equals("+"))
		{
			if(fraction1.getDenominator() != fraction2.getDenominator())
			{
				int lcm = lcm(fraction1.getDenominator(), fraction2.getDenominator());
			
				int newNumerator = (fraction1.getNumerator() * lcm) + (fraction2.getNumerator() * lcm);
				int newDenominator = (fraction1.getDenominator() * lcm);
				
				fraction fraction = new fraction();
				fraction.setNumerator(newNumerator);
				fraction.setDenominator(newDenominator);
				
				//String result = formatFraction(fraction);
				String result = fraction.getNumerator() + "/" + fraction.getDenominator();
				global.setGlobal(result);
			}
			else
			{
				int newNumerator = fraction1.getNumerator() + fraction2.getNumerator();
				int newDenominator = fraction1.getDenominator();
				
				fraction fraction = new fraction();
				fraction.setNumerator(newNumerator);
				fraction.setDenominator(newDenominator);
				
				String result = formatFraction(fraction);
				global.setGlobal(result);
			}
		}
		
		else if(operator.equals("-"))
		{
			if(fraction1.getDenominator() != fraction2.getDenominator())
			{
				int lcm = lcm(fraction1.getDenominator(), fraction2.getDenominator());
			
				int newNumerator = (fraction1.getNumerator() * lcm) - (fraction2.getDenominator() * lcm);
				int newDenominator = (fraction1.getDenominator() * lcm);
				
				fraction fraction = new fraction();
				fraction.setNumerator(newNumerator);
				fraction.setDenominator(newDenominator);
				
				String result = formatFraction(fraction);
				global.setGlobal(result);
			}
			else
			{
				int newNumerator = fraction1.getNumerator() - fraction2.getNumerator();
				int newDenominator = fraction1.getDenominator();
				
				fraction fraction = new fraction();
				fraction.setNumerator(newNumerator);
				fraction.setDenominator(newDenominator);
				
				String result = formatFraction(fraction);
				global.setGlobal(result);
			}
		}
		
		else if(operator.equals("*"))
		{
			int newNumerator = fraction1.getNumerator() * fraction2.getNumerator();
			int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
			
			fraction fraction = new fraction();
			fraction.setNumerator(newNumerator);
			fraction.setDenominator(newDenominator);
			
			String result = formatFraction(fraction);
			global.setGlobal(result);
		}
		
		else if(operator.equals("/"))
		{
			int newNumerator = fraction1.getNumerator() * fraction2.getDenominator();
			int newDenominator = fraction1.getDenominator() * fraction2.getNumerator();
			
			fraction fraction = new fraction();
			fraction.setNumerator(newNumerator);
			fraction.setDenominator(newDenominator);
			
			String result = formatFraction(fraction);
			global.setGlobal(result);
		}
		
		return global.getGlobal();
	}
	
	public static String formatFraction(fraction fraction)
	{
		globals returnGlobal = new globals();
		
		if(fraction.getNumerator() > fraction.getDenominator())
		{
			if(fraction.getDenominator() == 1)
			{
				String result = String.valueOf(fraction.getNumerator());
				returnGlobal.setGlobal(result);
			}
			else if(fraction.getNumerator() % fraction.getDenominator() == 0)
			{
				int value = fraction.getNumerator() / fraction.getDenominator();
				String result = String.valueOf(value);
				returnGlobal.setGlobal(result);
			}
			else
			{
				// improper fraction to mixed
				//fraction.toMixedConversion();
				//String result = fraction.getMixedFraction();
				String result = fraction.getNumerator() + "/" + fraction.getDenominator();
				returnGlobal.setGlobal(result);
			}
		}
		else if(fraction.getNumerator() == fraction.getDenominator())
		{
			// fraction equals one
			String result = "1";
			returnGlobal.setGlobal(result);
		}
		else if(fraction.getNumerator() < fraction.getDenominator())
		{
			// fraction is proper and needs to be reduced
			fraction.reduce();
			String result = fraction.getNumerator() + "/" + fraction.getDenominator();
			returnGlobal.setGlobal(result);
		}
		
		return returnGlobal.getGlobal();
	}
	
	public static int gcd(int num1, int num2)
	{
		while (num2 > 0)
	    {
	        int temp = num2;
	        num2 = num1 % num2; // % is remainder
	        num1 = temp;
	    }
	    return num1;
	}
	
	public static int lcm(int num1, int num2)
	{
		return num1 * (num2 / gcd(num1, num2));
	}
	
	/*
	public static void parse(String input)
	{
		String parts[] = input.split("\\s+");
		
		fraction fraction1 = new fraction();
		if(parts[0].contains("/"))
		{
			if(parts[0].contains("_"))
			{
				String mix1[] = parts[0].split("_");
				String frac1[] = mix1[1].split("/");
				
				fraction1.setNumerator(Integer.parseInt(frac1[0]));
				fraction1.setDenominator(Integer.parseInt(frac1[1]));
				fraction1.setMixIndex(Integer.parseInt(mix1[0]));
				
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
		
		fraction fraction2 = new fraction();
		if(parts[0].contains("/"))
		{
			if(parts[0].contains("_"))
			{
				String mix2[] = parts[2].split("_");
				String frac2[] = mix2[1].split("/");
				
				fraction2.setNumerator(Integer.parseInt(frac2[0]));
				fraction2.setDenominator(Integer.parseInt(frac2[1]));
				fraction2.setMixIndex(Integer.parseInt(mix2[0]));
				
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
	}
	*/
}


