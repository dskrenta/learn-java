import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class E7_4 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] list = new int[10];
		int count = 0;
		int times = 0;
		int minn = 0;
		int sum = 0;
		
		System.out.println("Enter a group of integers. Escape using a char.");
		
		while(in.hasNextInt())
		{
			if(!in.hasNextInt())
			{
				break;
			}
			else
			{
				list[count] = in.nextInt();
			}
			count++;
		}
		/*
		for(int num : list)
		{
			if(times == 0)
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
			times++;
		}
		*/
		for(int i = 0; i > list.length; i++)
		{
			if(i == 0)
			{
				minn = list[i];
			}
			else
			{
				if(list[i] < minn)
				{
					minn = list[i];
				}
			}
		}
		//        System.out.println(Collections.min(b));

		int min = getMinValue(list);
		
		for(int num : list)
		{
			if(num != getMinValue(list))
			{
				// Do nothing
				if(num == min)
				{
					
				}
				else
				{
					sum = sum + num;
				}
				//sum = sum + num;
			}
			else
			{
				//sum = sum + num;
			}
		}
		System.out.println(sum);
		System.out.println(minn);
	}
	
	// getting the maximum value
	public static int getMaxValue(int[] array){  
	      int maxValue = array[0];  
	      for(int i=1;i < array.length;i++){  
	      if(array[i] > maxValue){  
	      maxValue = array[i];  

	         }  
	     }  
	             return maxValue;  
	}  
	
	// getting the miniumum value
	public static int getMinValue(int[] array){  
	     int minValue = array[0];  
	     for(int i=1;i<array.length;i++){  
	     if(array[i] < minValue){  
	     minValue = array[i];  
	        }  
	     }  
	    return minValue;  
	}
}
