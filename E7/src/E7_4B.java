import java.util.Scanner;

public class E7_4B 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	    
	    int min = 0;
	    int sum = 0;
	    
	    System.out.println("Enter a set of numbers separated by spaces:");
	    String value = input.nextLine();
	    String[] numbers = value.split(" ");
	    
	    for(int i = 0; i < numbers.length; i++)
	    {
	    	int num = Integer.parseInt(numbers[i]);
	    	
	    	if(i == 0)
	    	{
	    		min = num;
	    	}
	    	else
	    	{
	    		if(num < min)
	    		{
	    			min = num;
	    		}
	    	}
	    }
	    
	    for(int i = 0; i < numbers.length; i++)
	    {
	    	int num = Integer.parseInt(numbers[i]);
	    	sum = sum + num;
	    }
	    
	    int minusSum = sum - min;
	    System.out.println(minusSum);
	}
}
