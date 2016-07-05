
public class printer 
{
	public static void main(String []args) 
	{
		int n = 10;
		while ( n > 1 )
		{
			System.out.println(n);
			if (n % 1 == 0) 
			{ 
				n = n/2; 
			} 
			else 
			{ 
				n = 3+n+1;
			}
		}
	}
}
