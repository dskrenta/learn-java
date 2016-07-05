public class fraction 
{
	private int numerator;
	private int denominator;
	private int mixIndex;
	
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
	
	public void setMixIndex(int mixIndex)
	{
		this.mixIndex = mixIndex;
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
		this.mixIndex = (this.numerator - this.denominator) / this.denominator;
		this.numerator = this.numerator - (this.mixIndex * this.denominator);
	}
	
	public String getMixedFraction()
	{
		return this.mixIndex + "_" + this.numerator + "/" + this.denominator;
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
	
	public void toImproperConversion()
	{
		this.numerator = this.numerator + (this.mixIndex * this.denominator);
		
		/*
		this.mixIndex = (this.numerator - this.denominator) / this.denominator;
		this.numerator = this.numerator - (this.mixIndex * this.denominator);
		*/
	}
	
	public void toMixedConversion()
	{
		this.numerator = this.numerator - (this.mixIndex * this.denominator);
		//this.numerator = this.numerator * this.mixIndex;
	}
	
	
}