public class fraction 
{
	private int numerator;
	private int denominator;
	private int mixed;
	
	public fraction()
	{
		//constructor 
	}
	
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
	public int getNumerator()
	{
		return this.numerator;
	}
	
	public void unMixNumerator(int multiplicity)
	{
		int mix = this.numerator * multiplicity;
		this.numerator = this.numerator + mix;
	}
	
	public void mixNumerator()
	{ 
		this.mixed = (this.numerator - this.denominator) / this.denominator;
		this.numerator = this.numerator - (this.mixed * this.denominator);
	}
	
	public String getMixedFraction()
	{
		return this.mixed + "_" + this.numerator + "/" + this.denominator;
	}
	
	public void reduce()
	{
		while(this.numerator % 2 == 0 && this.denominator % 2 == 0)
		{
			this.numerator = this.numerator / 2;
			this.denominator = this.denominator / 2;
		}
	}
	
	public String getFraction()
	{
		return this.numerator + "/" + this.denominator;
	}
}