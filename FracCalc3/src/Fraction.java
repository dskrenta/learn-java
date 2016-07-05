public class Fraction 
{
	private int numerator; // x
	private int denominator; // y
	private int mixedIndex;
	private String display;
	
	public int getNumerator() 
	{
		return numerator;
	}

	public void setNumerator(int Numerator) 
	{
		this.numerator = Numerator;
	}
	
	public int getDenominator() 
	{
		return denominator;
	}

	public void setDenominator(int Denominator) 
	{
		this.denominator = Denominator;
	}
	
	public int getMixedIndex()
	{
		return this.mixedIndex;
	}
	
	public void setMixedIndex(int mixedIndex)
	{
		this.mixedIndex = mixedIndex;
	}

	public void toImproperConversion()
	{
		this.numerator = this.numerator + (this.mixedIndex * this.denominator); 
	}
	
	public void toMixedConversion()
	{
		if(this.numerator > this.denominator && this.numerator % this.denominator == 0)
		{
			this.mixedIndex = this.numerator / this.denominator;
			this.numerator = this.numerator % this.denominator;
		}
	}
	
	public void reduce()
	{
		while(this.numerator % 2 == 0 && this.denominator % 2 == 0)
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
