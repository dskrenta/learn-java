import java.util.Scanner;

/*
 * 1 percent on the first 50,000
 * 2 percent on the amount over 50,000 up to 75,000
 * 3 percent on the amount over 75,000 up to 100,000
 * 4 percent on the amount over 100,000 up to 250,000
 * 5 percent on the amount over 250,000 up to 500,000
 * 6 percent on the amount over 500,000
 */

public class E5_17 
{
	public static void main(String[] args)
	{
		final double RATE1 = 0.01;      // Tax rates
	   	final double RATE2 = 0.02;
	   	final double RATE3 = 0.03;
	   	final double RATE4 = 0.05;
	   	final double RATE5 = 0.06;
	    
	   	final double S1 = 50000.0;      // Tax brackets for single and married
	   	final double S2 = 75000.0;
	   	final double S3 = 100000.0;
	   	final double S4 = 250000.0;
	   	final double S5 = 500000.0;
		
	   	double tax = 0;
	   	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your income to compute the tax:");
		double income = in.nextDouble();
		
		if ( income <= S1 )
		{
			tax = RATE1 * income;
		}
	    
		else if ( income <= S2 )
	    {
			tax = RATE1 * S1 + RATE2 * (income - S1);
	    }
	      
		else if ( income <= S3 )
		{
			tax = RATE1 * S1 + RATE2 * (S2 - S1) + RATE3 * (income - S2);
		}
		
		else if ( income <= S4 )
		{
			tax = RATE1 * S1 + RATE2 * (S2 - S1) + RATE3 * (S3 - S2) + RATE4 * (income - S3);
		}
	          
		else if ( income <= S5)
		{
			tax = RATE1 * S1 + RATE2 * (S2 - S1) + RATE3 * (S3 - S2) + RATE4 * (S4 - S3) + RATE5 * (income - S4);
		}
		
		System.out.println(tax);
		
		//500 + 500
	}
}

