public class Fraction 
{
	private int numerator; // x
	private int denominator; // y
	private int mixedIndex;
	private boolean isMixed;
	private String display;
	
	public int getNumerator() 
	{
		return this.numerator;
	}

	public void setNumerator(int numerator) 
	{
		this.numerator = numerator;
	}
	
	public int getDenominator() 
	{
		return this.denominator;
	}

	public void setDenominator(int denominator) 
	{
		this.denominator = denominator;
	}
	
	public int getMixedIndex()
	{
		return this.mixedIndex;
	}
	
	public void setMixedIndex(int mixedIndex)
	{
		this.mixedIndex = mixedIndex;
		this.isMixed = true;
	}
	
	public boolean isMixed()
	{
		return this.isMixed;
	}

	public void toImproperConversion()
	{
		this.numerator = this.numerator + (this.mixedIndex * this.denominator); 
	}
	
	public void toMixedConversion()
	{
		if(Math.abs(this.numerator) > this.denominator && this.denominator != 0)
		{
			this.mixedIndex = this.numerator / this.denominator;
			this.numerator = this.numerator % this.denominator;
		}
	}
	
	public void reduce()
	{
		while(Math.abs(this.numerator) % 2 == 0 && Math.abs(this.denominator) % 2 == 0)
		{
			this.numerator = this.numerator / 2;
			this.denominator = this.denominator / 2;
		}
	}
	
  // This method is used to display fractions
 // Some kind of processing also
 public String display() 
 {
	 // 0/y and x/1 types
	 if (numerator == 0 || denominator == 1) 
	 {
		 //System.out.print(numerator);
		 this.display = String.valueOf(numerator);
	 }

	 // -x/-y and x/-y types
	 else 
	 {
		 if ((numerator < 0 && denominator < 0) || (numerator > 0 && denominator < 0)) 
		 {
			 numerator *= -1;
			 denominator *= -1;
		 }

		 // x/x type
		 if (numerator == denominator) 
		 {
			 this.display = String.valueOf(numerator);
			 //System.out.print(numerator);
			 //return;
		 }

		 this.reduce();
		 
		 //System.out.print(this.numerator + "/" + this.denominator);
		 this.display = this.numerator + "/" + this.denominator;
	 }
	 return this.display;

  }


}
