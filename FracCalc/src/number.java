import java.math.BigInteger;

public class number 
{
	public number()
	{
		//constructor
	}
	
	public int gcd(int denominator1, int denominator2)
	{
		BigInteger bi1, bi2, bi3;
		
		bi1 = new BigInteger(Integer.toString(denominator1));
		bi2 = new BigInteger(Integer.toString(denominator2));
		
		bi3 = bi1.gcd(bi2);
		
		String str = bi3 + ""; //yuck
		
		return Integer.parseInt(str);
	}
}
