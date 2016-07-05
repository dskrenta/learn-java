public class fractionHelper 
{
	private String result;
	
	public fractionHelper()
	{
		//contructor
	}
	
	public String fractionFormat(fraction fraction)
	{
		if(fraction.getNumerator() > fraction.getDenominator())
		{
			if(fraction.getNumerator() / fraction.getDenominator() == 1)
			{
				int finalFraction = fraction.getNumerator() / fraction.getDenominator();
				String result = Integer.toString(finalFraction);
				this.result = result;
			}
			else
			{
				fraction.mixNumerator();
				String result = fraction.getMixedFraction();
				this.result = result;
			}
		}
		else if(fraction.getNumerator() == fraction.getDenominator())
		{
			String result = Integer.toString(1);
			this.result = result;
		}
		else
		{
			fraction.reduce();
			String result = fraction.getFraction();
			this.result = result;
		}
		
		return result;	
	}
}
