import java.util.Scanner;

public class calculator 
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
				String parts[] = in.split("\\s+");
				
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
				
				if(operator.equals("+"))
				{
					if(fraction1.getDenominator() != fraction2.getDenominator())
					{
						number number = new number();
						int gcd = number.gcd(fraction1.getDenominator(), fraction2.getDenominator());
					
						int newNumerator = (fraction1.getNumerator() * gcd) + (fraction2.getDenominator() * gcd);
						int newDenominator = (fraction1.getDenominator() * gcd);
						
						fraction fraction = new fraction();
						fraction.setNumerator(newNumerator);
						fraction.setDenominator(newDenominator);
						
						fractionHelper fractionHelper = new fractionHelper();
						String result = fractionHelper.fractionFormat(fraction);
						
						System.out.println(result);
					}
					else
					{
						int newNumerator = fraction1.getNumerator() + fraction2.getNumerator();
						int newDenominator = fraction1.getDenominator();
						
						fraction fraction = new fraction();
						fraction.setNumerator(newNumerator);
						fraction.setDenominator(newDenominator);
						
						fractionHelper fractionHelper = new fractionHelper();
						String result = fractionHelper.fractionFormat(fraction);
						
						System.out.println(result);
					}
				}

				else if(operator.equals("-"))
				{
					number number = new number();
					int gcd = number.gcd(fraction1.getDenominator(), fraction2.getDenominator());
				
					int newNumerator = (fraction1.getNumerator() * gcd) - (fraction2.getDenominator() * gcd);
					int newDenominator = (fraction1.getDenominator() * gcd);
				}
				
				else if(operator.equals("/"))
				{
					
				}
				
				else if(operator.equals("*"))
				{
					int newNumerator = fraction1.getNumerator() * fraction2.getNumerator();
					int newDenominator = fraction1.getDenominator() * fraction2.getDenominator();
					
					fraction fraction = new fraction();
					fraction.setNumerator(newNumerator);
					fraction.setDenominator(newDenominator);
					
					if(fraction.getNumerator() > fraction.getDenominator())
					{
						if(fraction.getNumerator() % fraction.getDenominator() == 0)
						{
							int finalFraction = fraction.getNumerator() / fraction.getDenominator();
							String result = Integer.toString(finalFraction);
							System.out.println(result);
						}
						else
						{
							//fraction.mixNumerator();
							String result = fraction.getMixedFraction();
							System.out.println(result);
						}
					}
					else if(fraction.getNumerator() == fraction.getDenominator())
					{
						String result = Integer.toString(1);
						System.out.println(result);
					}
					else
					{
						fraction.reduce();
						String result = fraction.getFraction();
						System.out.println(result);
					}
				}
			}
		}
		
		System.out.println("Calculator Finished.");
		
		input.close();
	}
}
